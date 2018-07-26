package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.Unn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UnnRepository extends JpaRepository<Unn, Integer> {
    Unn getTopByUnn(String unn);
}
