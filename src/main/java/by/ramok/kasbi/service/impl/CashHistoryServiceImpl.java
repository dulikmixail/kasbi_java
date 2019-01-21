package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.CashHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CashHistoryServiceImpl {
    Page<CashHistory> getCashHistories(Pageable pageable);

    CashHistory getCashHistory(int id);

    List<CashHistory> getCashHistoryByGoodId(int goodId);

    Page<CashHistory> findAllRepairByUnnPage(String unn, Pageable pageable);

    List<CashHistory> findAllRepairByUnnList(String unn);

    Page<CashHistory> findAllTOsByUnnPage(String unn, Pageable pageable);

    List<CashHistory> findAllTOsByUnnList(String unn);

    Page<CashHistory> findAllRepairByUnnAndGoodIdPage(int goodId, String unn, Pageable pageable);

    List<CashHistory> findAllRepairByUnnAndGoodIdList(int goodId, String unn);

    Page<CashHistory> findAllTOByUnnAndGoodIdPage(int goodId, String unn, Pageable pageable);

    List<CashHistory> findAllTOByUnnAndGoodIdList(int goodId, String unn);
}
