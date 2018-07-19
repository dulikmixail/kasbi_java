package by.ramok.kasbi.service;

import by.ramok.kasbi.dao.IUnnDAO;
import by.ramok.kasbi.entities.Unn;
import by.ramok.kasbi.service.impl.UnnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UnnService implements UnnServiceImpl {
    @Autowired
    private IUnnDAO unnDAO;

    @Override
    public List<Unn> getAllUnns() {
        return unnDAO.readAll();
    }

    @Override
    public Unn getDebt(int id) {
        return unnDAO.getDebt(id);
    }

    @Override
    public Unn getDebtByUnn(String unn) {
        return unnDAO.getDebtByUnn(unn);
    }
}
