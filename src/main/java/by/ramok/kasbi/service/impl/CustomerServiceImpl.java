package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Customer;

import java.util.List;

public interface CustomerServiceImpl {
    List<Customer> getAllCustomers();

    Customer getCustomerByUnp(String unp);

    Customer getCustomer(int id);
}
