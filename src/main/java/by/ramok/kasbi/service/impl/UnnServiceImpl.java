package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Unn;

import java.util.List;

public interface UnnServiceImpl {
    List<Unn> getAllUnns();

    Unn getDebt(int id);

    Unn getDebtByUnn(String unn);
}
