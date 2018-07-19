package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.service.CashHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/cash_histories")
public class CashHistoryController {

    @Autowired
    CashHistoryService service;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public List<CashHistory> readAll(@RequestParam(name = "first", defaultValue = "0") int firstResult, @RequestParam(defaultValue = "10") int limit) {
        final int MAX_ITEMS = 500;
        if (firstResult < 0 || limit < 0) throw new WrongParameters("Request parameters  can't be negative");
        if (limit > MAX_ITEMS) throw new WrongParameters("Max value of parameter 'limit' equal " + MAX_ITEMS);
        List<CashHistory> cashHistoryList = service.getCashHistories(firstResult, limit);
        if (cashHistoryList.size() == 0) throw new ResourceNotFoundException();
        return cashHistoryList;
    }

//    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
//    public Customer getByUnp(@RequestParam String unn) {
//        Customer customer = service.getCustomerByUnp(unn);
//        if (customer == null) throw new ResourceNotFoundException();
//        return customer;
//    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public CashHistory read(@PathVariable(name = "id") int sysId) {
        CashHistory cashHistory = service.getCashHistory(sysId);
        if (cashHistory == null) throw new ResourceNotFoundException();
        return cashHistory;
    }

}
