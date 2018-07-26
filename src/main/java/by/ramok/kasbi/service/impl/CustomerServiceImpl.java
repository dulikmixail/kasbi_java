package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerServiceImpl {
    Page<Customer> getAllCustomers(Pageable pageable);

    Page<Customer>  getCustomerByCustomer(Customer customer, Pageable pageable);

    Customer getCustomerById(int id);
}
