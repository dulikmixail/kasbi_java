package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.GoodType;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.repository.GoodTypeRepository;
import by.ramok.kasbi.service.impl.GoodTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodTypeService implements GoodTypeServiceImpl {

    @Autowired
    GoodTypeRepository goodTypeRepository;

    @Override
    public GoodType getGoodTypeById(int id) {
        return goodTypeRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
