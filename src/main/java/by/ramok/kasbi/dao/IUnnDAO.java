package by.ramok.kasbi.dao;

import by.ramok.kasbi.entities.Unn;

import java.util.List;

public interface IUnnDAO {
    List<Unn> readAll();

    Unn getDebt(int id);

    Unn getDebtByUnn(String unn);
}
