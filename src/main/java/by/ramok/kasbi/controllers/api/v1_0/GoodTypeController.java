package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.GoodType;
import by.ramok.kasbi.service.GoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Props.API_V1_0 + "/good_types")
public class GoodTypeController {

    @Autowired
    GoodTypeService goodTypeService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public GoodType read(@PathVariable Integer id) {
        return goodTypeService.getGoodTypeById(id);
    }
}
