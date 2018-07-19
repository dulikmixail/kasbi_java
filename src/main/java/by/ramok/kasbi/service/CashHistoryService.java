package by.ramok.kasbi.service;

import by.ramok.kasbi.dao.ICashHistoryDAO;
import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.service.impl.CashHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CashHistoryService implements CashHistoryServiceImpl {
    @Autowired
    private ICashHistoryDAO cashHistoryDAO;

    @Override
    public List<CashHistory> getCashHistories(int firstResult, int limit) {
        return cashHistoryDAO.readAll(firstResult, limit);
    }

    @Override
    public CashHistory getCashHistory(int id) {
        return cashHistoryDAO.getCashHistory(id);
    }

    @Override
    public List<CashHistory> getCashHistoryByGoodId(int goodId) {
        return cashHistoryDAO.getCashHistoryByGoodId(goodId);
    }
}
