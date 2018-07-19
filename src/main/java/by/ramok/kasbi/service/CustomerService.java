package by.ramok.kasbi.service;

import by.ramok.kasbi.dao.ICustomerDAO;
import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService implements CustomerServiceImpl {

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> entities = customerDAO.readAll();
        return entities;
    }

    @Override
    public Customer getCustomerByUnp(String unp) {
        Customer customer = customerDAO.getCustomerByUnp(unp);
        return customer;
    }

    @Override
    public Customer getCustomer(int id) {
        Customer customer = customerDAO.getCustomer(id);
        return customer;
    }

}
