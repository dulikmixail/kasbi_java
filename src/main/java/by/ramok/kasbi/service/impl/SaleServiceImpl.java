package by.ramok.kasbi.service.impl;

import by.ramok.kasbi.entities.Sale;

import java.util.List;

public interface SaleServiceImpl {
    List<Sale> getAllSales();

    Sale addSale(Sale sale);

    Sale getSaleById(int id);
}
