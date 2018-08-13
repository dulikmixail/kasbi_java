package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.CashHistoryRepository;
import by.ramok.kasbi.service.impl.CashHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashHistoryService implements CashHistoryServiceImpl {

    @Autowired
    CashHistoryRepository cashHistoryRepository;

    @Override
    public Page<CashHistory> getCashHistories(Pageable pageable) {
        Page<CashHistory> cashHistoryPage = cashHistoryRepository.findAll(pageable);
        if (cashHistoryPage.getContent().size() == 0) throw new WrongParameters();
        return cashHistoryPage;
    }

    @Override
    public CashHistory getCashHistory(int id) {
        return cashHistoryRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<CashHistory> getCashHistoryByGoodId(int goodId) {
        CashHistory cashHistory = new CashHistory();
        cashHistory.setGoodSysId(goodId);
        Example<CashHistory> example = Example.of(cashHistory);
        List<CashHistory> cashHistoryList = cashHistoryRepository.findAll(example);
        if (cashHistoryList.size() == 0) throw new ResourceNotFoundException();
        return cashHistoryList;
    }

    @Override
    public Page<CashHistory> findAllRepairByUnnPage(String unn, Pageable pageable) {
        return cashHistoryRepository.findAllRepairByUnnPage(unn, pageable);
    }

    @Override
    public List<CashHistory> findAllRepairByUnnList(String unn) {
        return cashHistoryRepository.findAllRepairByUnnList(unn);
    }
}
