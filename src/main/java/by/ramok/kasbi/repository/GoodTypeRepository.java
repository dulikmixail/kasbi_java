package by.ramok.kasbi.repository;

import by.ramok.kasbi.entities.GoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodTypeRepository extends JpaRepository<GoodType, Integer> {
}
