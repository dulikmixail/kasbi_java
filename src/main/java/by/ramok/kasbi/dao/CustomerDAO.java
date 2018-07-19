package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerDAO implements ICustomerDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Customer> readAll() {
        return em.createQuery("FROM Customer", Customer.class).getResultList();
    }

    @Override
    public Customer getCustomer(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    public Customer getCustomerByUnp(String unn) {
        List<Customer> customerList = em.createQuery("FROM Customer WHERE unn=:unn", Customer.class).setParameter("unn", unn).getResultList();
        return customerList.isEmpty() ? null : customerList.get(0);
    }

}
