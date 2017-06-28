package org.mylearn.chapter1.service;

import org.mylearn.chapter1.helper.DatabaseHelper;
import org.mylearn.chapter1.model.Customer;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/26.
 */
public class CustomerService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(Integer id) {
        return null;
    }

    public Boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public Boolean updateCustomer(Integer id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public Boolean deleteCustomer(Integer id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
