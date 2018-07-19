package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.Sale;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SaleDAO implements ISaleDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Sale> readAll() {
        return em.createQuery("FROM Sale", Sale.class).getResultList();
    }
}
