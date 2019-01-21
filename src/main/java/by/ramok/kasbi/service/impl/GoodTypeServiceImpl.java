package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.GoodType;

import java.util.List;

public interface GoodTypeServiceImpl {
    GoodType getGoodTypeById(int id);
    List<GoodType> getListGoodTypesById(List<Integer> ids);
}
