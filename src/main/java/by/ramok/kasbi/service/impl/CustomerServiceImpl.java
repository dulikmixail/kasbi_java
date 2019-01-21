package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerServiceImpl {
    Page<Customer> getAllCustomersPage(Pageable pageable);

    List<Customer> getAllCustomersList();

    Page<Customer>  getCustomerByCustomer(Customer customer, Pageable pageable);

    Customer getCustomerById(int id);
}
