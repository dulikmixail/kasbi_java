package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.CashHistoryRepository;
import by.ramok.kasbi.service.impl.CashHistoryServiceImpl;
import by.ramok.kasbi.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashHistoryService implements CashHistoryServiceImpl {

    private final CashHistoryRepository cashHistoryRepository;

    private final Valid valid;

    @Autowired
    public CashHistoryService(CashHistoryRepository cashHistoryRepository, Valid valid) {
        this.cashHistoryRepository = cashHistoryRepository;
        this.valid = valid;
    }

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
        valid.isEmpty(cashHistoryList, new ResourceNotFoundException());
        return cashHistoryList;
    }

    @Override
    public Page<CashHistory> findAllRepairByUnnPage(String unn, Pageable pageable) {
        Page<CashHistory> allRepairByUnnPage = cashHistoryRepository.findAllRepairByUnnPage(unn, pageable);
        valid.isEmpty(allRepairByUnnPage, new ResourceNotFoundException());
        return allRepairByUnnPage;
    }

    @Override
    public List<CashHistory> findAllRepairByUnnList(String unn) {
        List<CashHistory> allRepairByUnnList = cashHistoryRepository.findAllRepairByUnnList(unn);
        valid.isEmpty(allRepairByUnnList, new ResourceNotFoundException());
        return allRepairByUnnList;
    }

    @Override
    public Page<CashHistory> findAllTOsByUnnPage(String unn, Pageable pageable) {
        Page<CashHistory> allTOsByUnnPage = cashHistoryRepository.findAllTOsByUnnPage(unn, pageable);
        valid.isEmpty(allTOsByUnnPage, new ResourceNotFoundException());
        return allTOsByUnnPage;
    }

    @Override
    public List<CashHistory> findAllTOsByUnnList(String unn) {
        List<CashHistory> allTOsByUnnList = cashHistoryRepository.findAllTOsByUnnList(unn);
        valid.isEmpty(allTOsByUnnList, new ResourceNotFoundException());
        return allTOsByUnnList;
    }

    @Override
    public Page<CashHistory> findAllRepairByUnnAndGoodIdPage(int goodId, String unn, Pageable pageable) {
        Page<CashHistory> allRepairByUnnAndGoodIdPage = cashHistoryRepository.findAllRepairByUnnAndGoodIdPage(goodId, unn, pageable);
        valid.isEmpty(allRepairByUnnAndGoodIdPage, new ResourceNotFoundException());
        return allRepairByUnnAndGoodIdPage;
    }

    @Override
    public List<CashHistory> findAllRepairByUnnAndGoodIdList(int goodId, String unn) {
        List<CashHistory> allRepairByUnnAndGoodIdList = cashHistoryRepository.findAllRepairByUnnAndGoodIdList(goodId, unn);
        valid.isEmpty(allRepairByUnnAndGoodIdList, new ResourceNotFoundException());
        return allRepairByUnnAndGoodIdList;
    }

    @Override
    public Page<CashHistory> findAllTOByUnnAndGoodIdPage(int goodId, String unn, Pageable pageable) {
        Page<CashHistory> allTOByUnnAndGoodIdPage = cashHistoryRepository.findAllTOByUnnAndGoodIdPage(goodId, unn, pageable);
        valid.isEmpty(allTOByUnnAndGoodIdPage, new ResourceNotFoundException());
        return allTOByUnnAndGoodIdPage;
    }

    @Override
    public List<CashHistory> findAllTOByUnnAndGoodIdList(int goodId, String unn) {
        List<CashHistory> allTOByUnnAndGoodIdList = cashHistoryRepository.findAllTOByUnnAndGoodIdList(goodId, unn);
        valid.isEmpty(allTOByUnnAndGoodIdList, new ResourceNotFoundException());
        return allTOByUnnAndGoodIdList;
    }


}
