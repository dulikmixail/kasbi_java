package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Sale;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.SaleRepository;
import by.ramok.kasbi.service.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService implements SaleServiceImpl {

    @Autowired
    SaleRepository saleRepository;


    @Override
    public Page<Sale> getAllSales(Pageable pageable) {
        Page<Sale> salePage = saleRepository.findAll(pageable);
        if (salePage.getContent().size() == 0) throw new WrongParameters();
        return salePage;
    }

    @Override
    public Sale getSaleById(int id) {
        return saleRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Page<Sale> getSaleBySale(Sale sale, Pageable pageable) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Sale> example = Example.of(sale, exampleMatcher);
        Page<Sale> salePage = saleRepository.findAll(example, pageable);
        if (salePage.getContent().size() == 0) throw new ResourceNotFoundException();
        return null;
    }
}
