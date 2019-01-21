package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Good;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.GoodRepository;
import by.ramok.kasbi.service.impl.GoodServiceImpl;
import by.ramok.kasbi.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService implements GoodServiceImpl {
    private final GoodRepository goodRepository;

    private final Valid valid;

    @Autowired
    public GoodService(GoodRepository goodRepository, Valid valid) {
        this.goodRepository = goodRepository;
        this.valid = valid;
    }

    @Override
    public Page<Good> getCashRegistersOnTOByUnnPage(String unn, Pageable pageable) {
        return goodRepository.findGoodsOnTObyUnnPage(unn, pageable);
    }

    @Override
    public List<Good> getCashRegistersOnTOByUnnList(String unn) {
        return goodRepository.findGoodsOnTObyUnnList(unn);
    }

    @Override
    public Page<Good> getRepairsByUnnPage(String unn, Pageable pageable) {
        return null;
    }

    @Override
    public List<Good> getRepairsOnTOByUnnList(String unn) {
        return null;
    }

    @Override
    public Good getGoodById(Integer id) {
        Good good = goodRepository.getGoodByGoodSysId(id);
        if (good == null) throw new ResourceNotFoundException();
        return good;
    }

    @Override
    public List<Good> getListGoodById(List<Integer> ids) {
        List<Good> goodList = goodRepository.getAllByGoodSysIdIn(ids);
        valid.isEmpty(goodList, new ResourceNotFoundException());
        return goodList;
    }

    @Override
    public Page<Good> getAllGoods(Pageable pageable) {
        Page<Good> unnPage = goodRepository.findAll(pageable);
        valid.isEmpty(unnPage, new WrongParameters());
        return unnPage;
    }


}
