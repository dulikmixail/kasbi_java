package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.CashHistory;

import java.util.List;

public interface CashHistoryServiceImpl {
    List<CashHistory> getCashHistories(int firstResult, int limit);
    CashHistory getCashHistory(int id);
    List<CashHistory> getCashHistoryByGoodId(int goodId);
}
