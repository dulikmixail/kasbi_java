package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.GoodType;
import by.ramok.kasbi.service.GoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/good_types")
public class GoodTypeController {

    private final GoodTypeService goodTypeService;

    @Autowired
    public GoodTypeController(GoodTypeService goodTypeService) {
        this.goodTypeService = goodTypeService;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public GoodType read(@PathVariable Integer id) {
        return goodTypeService.getGoodTypeById(id);
    }

    @RequestMapping(value = "/list/{ids}", method = RequestMethod.GET, produces = "application/json")
    public List<GoodType> readListGet(@PathVariable List<Integer> ids) {
        return goodTypeService.getListGoodTypesById(ids);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
    public List<GoodType> readListPost(@RequestBody List<Integer> ids) {
        return goodTypeService.getListGoodTypesById(ids);
    }
}
