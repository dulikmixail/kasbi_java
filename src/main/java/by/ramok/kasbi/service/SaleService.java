package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Sale;
import by.ramok.kasbi.repository.SaleRepository;
import by.ramok.kasbi.service.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements SaleServiceImpl {

    @Autowired
    SaleRepository repository;

    @Override
    public List<Sale> getAllSales() {
        return repository.findAll();
    }

    @Override
    public Sale addSale(Sale sale) {
        return repository.saveAndFlush(sale);
    }

    @Override
    public Sale getSaleById(int id) {
        return repository.findById(id).orElse(null);
    }
}
