package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Sale,Integer> {
    List<Customer> readAll();

    Customer getCustomer(int id);

    Customer getCustomerByUnp(String unp);

}
