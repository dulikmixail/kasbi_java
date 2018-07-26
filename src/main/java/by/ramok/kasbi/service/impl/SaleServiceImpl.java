package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface SaleServiceImpl {
    Page<Sale> getAllSales(Pageable pageable);

    Sale getSaleById(int id);

    Page<Sale> getSaleBySale(Sale sale, Pageable pageable);
}
