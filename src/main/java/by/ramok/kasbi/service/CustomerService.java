package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.CustomerRepository;
import by.ramok.kasbi.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceImpl {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Page<Customer> getAllCustomersPage(Pageable pageable) {
        Page<Customer> customerPage = customerRepository.findAll(pageable);
        if (customerPage.getContent().size() == 0) throw new WrongParameters();
        return customerPage;
    }

    @Override
    public List<Customer> getAllCustomersList() {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList.size() == 0) throw new ResourceNotFoundException();
        return customerList;
    }

    @Override
    public Page<Customer> getCustomerByCustomer(Customer customer, Pageable pageable) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Customer> example = Example.of(customer, exampleMatcher);
        Page<Customer> customerList = customerRepository.findAll(example, pageable);
        if (customerList.getContent().size() == 0) throw new ResourceNotFoundException();
        return customerList;
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

}
