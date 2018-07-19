package by.ramok.kasbi.controllers.api.v1_0;


import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Unn;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.service.UnnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/debts")
public class UnnController {

    @Autowired
    UnnService service;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public List<Unn> readAll() {
        List<Unn> unns = service.getAllUnns();
        if (unns.size() == 0) throw new ResourceNotFoundException();
        return unns;
    }

    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public Unn getByUnp(@RequestParam String unn) {
        Unn debt = service.getDebtByUnn(unn);
        if (debt == null) throw new ResourceNotFoundException();
        return debt;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Unn read(@PathVariable int id) {
        Unn debt = service.getDebt(id);
        if (debt == null) throw new ResourceNotFoundException();
        return debt;
    }
}
