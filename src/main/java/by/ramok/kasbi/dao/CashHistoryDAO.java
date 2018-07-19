package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.CashHistory;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CashHistoryDAO implements ICashHistoryDAO {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<CashHistory> readAll(int firstResult, int limit) {
        List<CashHistory> cashHistoryList = em.createQuery("FROM CashHistory order by sysId", CashHistory.class).setFirstResult(firstResult).setMaxResults(limit).getResultList();
        return cashHistoryList;
    }

    @Override
    public CashHistory getCashHistory(int id) {
        List<CashHistory> cashHistoryList = em.createQuery("FROM CashHistory where sysId=:id", CashHistory.class).setParameter("id", id).getResultList();
        return cashHistoryList.isEmpty() ? null : cashHistoryList.get(0);
    }

    @Override
    public List<CashHistory> getCashHistoryByGoodId(int goodId) {
        List<CashHistory> cashHistoryList = em.createQuery("FROM CashHistory where goodSysId=:goodId", CashHistory.class).setParameter("goodId", goodId).getResultList();
        return cashHistoryList;
    }
}
