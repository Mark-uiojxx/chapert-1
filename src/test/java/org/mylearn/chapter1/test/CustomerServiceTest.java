package org.mylearn.chapter1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mylearn.chapter1.helper.DatabaseHelper;
import org.mylearn.chapter1.model.Customer;
import org.mylearn.chapter1.service.CustomerService;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/6/26.
 * CustomerService 单元测试
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertTrue(customerList.size() > 0);
    }

    @Test
    public void getCustomerTest() throws Exception {
        Integer id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "金基德");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "1241324132");
        fieldMap.put("email", "kinkid900@1633.com");
        fieldMap.put("remark", "《春夏秋冬又一春》");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        Integer id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        Integer id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
