package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> readAll();

    Customer getCustomer(int id);

    Customer getCustomerByUnp(String unp);

}
