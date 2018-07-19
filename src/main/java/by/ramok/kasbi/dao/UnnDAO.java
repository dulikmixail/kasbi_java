package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.Unn;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UnnDAO implements IUnnDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<Unn> readAll() {
        return em.createQuery("FROM Unn", Unn.class).getResultList();
    }

    @Override
    public Unn getDebt(int id) {
        return em.find(Unn.class, id);
    }

    @Override
    public Unn getDebtByUnn(String unn) {
        List<Unn> unnList = em.createQuery("FROM Unn WHERE unn=:unn", Unn.class).setParameter("unn", unn).getResultList();
        return unnList.isEmpty() ? null : unnList.get(0);
    }
}
