package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.service.CashHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(Props.API_V1_0 + "/cash_histories")
public class CashHistoryController {

    @Autowired
    CashHistoryService cashHistoryService;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public Page<CashHistory> readAll(Pageable pageable) {
        return cashHistoryService.getCashHistories(pageable);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public CashHistory read(@PathVariable(name = "id") int sysId) {
        CashHistory cashHistory = cashHistoryService.getCashHistory(sysId);
        if (cashHistory == null) throw new ResourceNotFoundException();
        return cashHistory;
    }

    @RequestMapping(value = "/repairs", method = RequestMethod.GET, produces = "application/json")
    public Page<CashHistory> getRepairsPage(@RequestParam String unn, Pageable pageable) {
        return cashHistoryService.findAllRepairByUnn(unn, pageable);
    }

}
