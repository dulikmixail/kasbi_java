package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Good;
import by.ramok.kasbi.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/goods")
public class GoodController {

    @Autowired
    GoodService goodService;

    @RequestMapping(value = {"cr_on_to", ""}, method = RequestMethod.GET, produces = "application/json")
    public Page<Good> getCashRegistersOnToPage(@RequestParam String unn, Pageable pageable) {
        return goodService.getCashRegisterOnTOByUnnPage(unn, pageable);
    }

    @RequestMapping(value = {"cr_on_to/list", ""}, method = RequestMethod.GET, produces = "application/json")
    public List<Good> getCashRegistersOnToList(@RequestParam String unn) {
        return goodService.getCashRegisterOnTOByUnnList(unn);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Good read(@PathVariable Integer id) {
        return goodService.getGoodById(id);
    }


}
