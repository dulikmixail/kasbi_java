package by.ramok.kasbi.controllers.api.v1_0;


import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Sale;
import by.ramok.kasbi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(Props.API_V1_0 + "/sales")
public class SaleController {

    @Autowired
    SaleService saleService;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public Page<Sale> readAll(Pageable pageable) {
        return saleService.getAllSales(pageable);
    }

    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public Page<Sale> getByUnp(@RequestBody Sale sale, Pageable pageable) {
        return saleService.getSaleBySale(sale, pageable);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Sale read(@PathVariable int id) {
        return saleService.getSaleById(id);
    }

}
