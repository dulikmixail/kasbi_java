package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.CashHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CashHistoryRepository extends JpaRepository<CashHistory, Integer> {
    @Query(value = "select ch from CashHistory ch where ch.ownerSysId in (select c.customerSysId from Customer c where c.unn=:unn) and ch.state=4")
    Page<CashHistory> findAllRepairByUnn(@Param("unn") String unn, Pageable pageable);
}
