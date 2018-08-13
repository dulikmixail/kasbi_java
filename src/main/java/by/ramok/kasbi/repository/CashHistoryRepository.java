package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.CashHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CashHistoryRepository extends JpaRepository<CashHistory, Integer> {
    @Query(value = "select ch from CashHistory ch where ch.ownerSysId in (select c.customerSysId from Customer c where c.unn=:unn) and ch.state=5")
    Page<CashHistory> findAllRepairByUnnPage(@Param("unn") String unn, Pageable pageable);

    @Query(value = "select ch from CashHistory ch where ch.ownerSysId = (select c.customerSysId from Customer c where c.unn=:unn) and ch.state=5")
    List<CashHistory> findAllRepairByUnnList(@Param("unn") String unn);
}
