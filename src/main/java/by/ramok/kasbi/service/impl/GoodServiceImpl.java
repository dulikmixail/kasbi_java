package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Good;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodServiceImpl {
    Page<Good> getCashRegisterOnTOByUnnPage(String unn, Pageable pageable);
    List<Good> getCashRegisterOnTOByUnnList(String unn);
    Good getGoodById(Integer id);
}
