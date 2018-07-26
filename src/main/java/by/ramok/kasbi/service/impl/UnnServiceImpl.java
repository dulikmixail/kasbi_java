package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Unn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UnnServiceImpl {
    Page<Unn> getAllUnns(Pageable pageable);

    Unn getDebtById(int id);

    Page<Unn> getDebtByUnn(Unn unn, Pageable pageable);

    Unn getDebtByUnn(String unn);

    Unn getDebtByUnn(Unn unn);
}
