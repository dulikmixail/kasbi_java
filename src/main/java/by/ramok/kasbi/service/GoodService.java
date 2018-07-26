package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Good;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.repository.GoodRepository;
import by.ramok.kasbi.service.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodService implements GoodServiceImpl {
    @Autowired
    GoodRepository goodRepository;

    @Override
    public Page<Good> getCashRegisterOnTOByUnnPage(String unn, Pageable pageable) {
        return goodRepository.findGoodOnTObyUnnPage(unn, pageable);
    }

    @Override
    public List<Good> getCashRegisterOnTOByUnnList(String unn) {
        return goodRepository.findGoodOnTObyUnnList(unn);
    }

    @Override
        public Good getGoodById(Integer id) {
        Good good = goodRepository.getGoodByGoodSysId(id);
        if(good == null) throw new ResourceNotFoundException();
        return good;
    }

}
