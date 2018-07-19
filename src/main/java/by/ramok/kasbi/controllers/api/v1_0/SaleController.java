package by.ramok.kasbi.controllers.api.v1_0;


import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Sale;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.repository.SaleRepository;
import by.ramok.kasbi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/sales")
public class SaleController {

    @Autowired
    SaleService service;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public List<Sale> readAll() {
        List<Sale> saleList = service.getAllSales();
        if (saleList.size() == 0) throw new ResourceNotFoundException();
        return saleList;
    }

//    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
//    public Sale getByUnp(@RequestParam String unn) {
//        Sale debt = service.getDebtBySale(unn);
//        if (debt == null) throw new ResourceNotFoundException();
//        return debt;
//    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Sale read(@PathVariable int id) {
        Sale debt = service.getSaleById(id);
        if (debt == null) throw new ResourceNotFoundException();
        return debt;
    }

}
