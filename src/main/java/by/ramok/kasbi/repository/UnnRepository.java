package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.Sale;
import by.ramok.kasbi.entities.Unn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnnRepository extends JpaRepository<Sale,Integer> {
    List<Unn> readAll();

    Unn getDebt(int id);

    Unn getDebtByUnn(String unn);
}
