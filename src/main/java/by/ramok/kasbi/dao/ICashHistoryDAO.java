package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.entities.Customer;

import java.util.List;

public interface ICashHistoryDAO {
    List<CashHistory> readAll(int firstResult, int limit);
    CashHistory getCashHistory(int id);
    List<CashHistory> getCashHistoryByGoodId(int goodId);
}
