package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Unn;
import by.ramok.kasbi.service.UnnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(Props.API_V1_0 + "/debts")
public class UnnController {

    private final UnnService unnService;

    @Autowired
    public UnnController(UnnService unnService) {
        this.unnService = unnService;
    }

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public Page<Unn> readAll(Pageable pageable) {
        return unnService.getAllUnns(pageable);
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST, produces = "application/json")
    public Page<Unn> getByUnpPost(@RequestBody Unn unn, Pageable pageable) {
        return unnService.getDebtByUnn(unn, pageable);
    }

    @RequestMapping(value = "/one", method = RequestMethod.GET, produces = "application/json")
    public Unn getByUnpGet(@RequestParam String unn) {
        return unnService.getDebtByUnn(unn);
    }

    @RequestMapping(value = "/one", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = "application/json")
    public Unn getByUnpGet(@RequestBody Unn dept) {
        return unnService.getDebtByUnn(dept);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Unn read(@PathVariable int id) {
        return unnService.getDebtById(id);
    }
}
