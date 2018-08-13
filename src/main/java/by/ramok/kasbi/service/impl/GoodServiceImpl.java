package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Good;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodServiceImpl {
    Page<Good> getCashRegistersOnTOByUnnPage(String unn, Pageable pageable);
    List<Good> getCashRegistersOnTOByUnnList(String unn);
    Page<Good> getRepairsByUnnPage(String unn, Pageable pageable);
    List<Good> getRepairsOnTOByUnnList(String unn);
    Good getGoodById(Integer id);
    Page<Good> getAllGoods(Pageable pageable);
}
