package org.mylearn.chapter1.service;

import org.mylearn.chapter1.model.Customer;
import org.mylearn.chapter1.util.PropsUtil;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by admin on 2017/6/26.
 */
public class CustomerService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }

    public List<Customer> getCustomerList() {
        Connection conn = null;
        List<Customer> customerList = new ArrayList<Customer>();
        try {
            String sql = "SELECT * FROM customer";
            conn= DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            LOGGER.error("execute sql failure", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("close connection failure", e);
                }
            }
        }
        return customerList;
    }

    public Customer getCustomer(Integer id) {
        //TODO
        return null;
    }

    public Boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    public Boolean updateCustomer(Integer id, Map<String, Object> fieldMap) {
        return false;
    }

    public Boolean deleteCustomer(Integer id) {
        return false;
    }
}
