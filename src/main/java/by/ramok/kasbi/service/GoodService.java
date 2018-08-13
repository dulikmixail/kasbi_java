package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Good;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.GoodRepository;
import by.ramok.kasbi.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService implements GoodServiceImpl {
    @Autowired
    GoodRepository goodRepository;

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
        if(good == null) throw new ResourceNotFoundException();
        return good;
    }

    @Override
    public Page<Good> getAllGoods(Pageable pageable) {
        Page<Good> unnPage = goodRepository.findAll(pageable);
        if (unnPage.getContent().size() == 0) throw new WrongParameters();
        return unnPage;
    }


}
