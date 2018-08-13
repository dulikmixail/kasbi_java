package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.Good;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodRepository extends JpaRepository<Good, Integer> {

    @Query(value = "SELECT DISTINCT g.* FROM (SELECT MAX(change_state_date) AS date_p, good_sys_id FROM cash_history WHERE state = 4 GROUP BY good_sys_id) t_p LEFT JOIN (SELECT MAX(change_state_date) AS date_s, good_sys_id FROM cash_history WHERE state IN (2, 3) GROUP BY good_sys_id) t_s ON t_p.good_sys_id = t_s.good_sys_id, cash_history ch, good g, customer c WHERE t_p.date_p > ISNULL(t_s.date_s,'') AND ch.change_state_date = t_p.date_p AND ch.state = 4 AND t_p.good_sys_id = g.good_sys_id AND c.customer_sys_id = ch.owner_sys_id AND c.unn = :unn",
            nativeQuery = true)
    List<Good> findGoodsOnTObyUnnList(@Param("unn") String unn);

    @Query(value = "SELECT DISTINCT g.* FROM (SELECT MAX(change_state_date) AS date_p, good_sys_id FROM cash_history WHERE state = 4 GROUP BY good_sys_id) t_p LEFT JOIN (SELECT MAX(change_state_date) AS date_s, good_sys_id FROM cash_history WHERE state IN (2, 3) GROUP BY good_sys_id) t_s ON t_p.good_sys_id = t_s.good_sys_id, cash_history ch, good g, customer c WHERE t_p.date_p > ISNULL(t_s.date_s,'') AND ch.change_state_date = t_p.date_p AND ch.state = 4 AND t_p.good_sys_id = g.good_sys_id AND c.customer_sys_id = ch.owner_sys_id AND c.unn = :unn",
            countQuery = "SELECT COUNT(*) FROM (SELECT DISTINCT g.* FROM (SELECT MAX(change_state_date) AS date_p, good_sys_id FROM cash_history WHERE state = 4 GROUP BY good_sys_id) t_p LEFT JOIN (SELECT MAX(change_state_date) AS date_s, good_sys_id FROM cash_history WHERE state IN (2, 3) GROUP BY good_sys_id) t_s ON t_p.good_sys_id = t_s.good_sys_id, cash_history ch, good g, customer c WHERE t_p.date_p > ISNULL(t_s.date_s,'') AND ch.change_state_date = t_p.date_p AND ch.state = 4 AND t_p.good_sys_id = g.good_sys_id AND c.customer_sys_id = ch.owner_sys_id AND c.unn = :unn) tt",
            nativeQuery = true)
    Page<Good> findGoodsOnTObyUnnPage(@Param("unn") String unn, Pageable pageable);

    Good getGoodByGoodSysId(int goodSysId);

}
