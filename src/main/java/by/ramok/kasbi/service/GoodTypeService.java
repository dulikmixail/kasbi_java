package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.GoodType;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.repository.GoodTypeRepository;
import by.ramok.kasbi.service.impl.GoodTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodTypeService implements GoodTypeServiceImpl {

    private final GoodTypeRepository goodTypeRepository;

    @Autowired
    public GoodTypeService(GoodTypeRepository goodTypeRepository) {
        this.goodTypeRepository = goodTypeRepository;
    }

    @Override
    public GoodType getGoodTypeById(int id) {
        return goodTypeRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<GoodType> getListGoodTypesById(List<Integer> ids) {
        List<GoodType> goodTypeList = goodTypeRepository.findAllById(ids);
        if (goodTypeList.size() == 0) {
            throw new ResourceNotFoundException();
        }
        return goodTypeList;
    }
}
