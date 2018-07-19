package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CashHistoryRepository extends JpaRepository<Sale,Integer> {
    List<CashHistory> readAll(int firstResult, int limit);
    CashHistory getCashHistory(int id);
    List<CashHistory> getCashHistoryByGoodId(int goodId);
}
