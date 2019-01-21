package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.CashHistory;
import by.ramok.kasbi.entities.Good;
import by.ramok.kasbi.service.CashHistoryService;
import by.ramok.kasbi.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Props.API_V1_0 + "/goods")
public class GoodController {

    private final GoodService goodService;

    private final CashHistoryService cashHistoryService;

    @Autowired
    public GoodController(GoodService goodService, CashHistoryService cashHistoryService) {
        this.goodService = goodService;
        this.cashHistoryService = cashHistoryService;
    }

    @RequestMapping(value = {"cr_on_to"}, method = RequestMethod.GET, produces = "application/json")
    public Page<Good> getCashRegistersOnToPage(@RequestParam String unn, Pageable pageable) {
        return goodService.getCashRegistersOnTOByUnnPage(unn, pageable);
    }

    @RequestMapping(value = {"cr_on_to/list"}, method = RequestMethod.GET, produces = "application/json")
    public List<Good> getCashRegistersOnToList(@RequestParam String unn) {
        return goodService.getCashRegistersOnTOByUnnList(unn);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Good read(@PathVariable Integer id) {
        return goodService.getGoodById(id);
    }

    @RequestMapping(value = "/list/{ids}", method = RequestMethod.GET, produces = "application/json")
    public List<Good> readListGet(@PathVariable List<Integer> ids) {
        return goodService.getListGoodById(ids);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json")
    public List<Good> readListPost(@RequestBody List<Integer> ids) {
        return goodService.getListGoodById(ids);
    }

    @RequestMapping(value = "{id}/repairs", method = RequestMethod.GET, produces = "application/json")
    public Page<CashHistory> readRepairByGoodIdPage(@PathVariable Integer id, @RequestParam String unn, Pageable pageable) {
        return cashHistoryService.findAllRepairByUnnAndGoodIdPage(id, unn, pageable);
    }

    @RequestMapping(value = "{id}/repairs/list", method = RequestMethod.GET, produces = "application/json")
    public List<CashHistory> readRepairByGoodIdList(@PathVariable Integer id, @RequestParam String unn) {
        return cashHistoryService.findAllRepairByUnnAndGoodIdList(id, unn);
    }

    @RequestMapping(value = "{id}/tos", method = RequestMethod.GET, produces = "application/json")
    public Page<CashHistory> readTOByGoodIdPage(@PathVariable Integer id, @RequestParam String unn, Pageable pageable) {
        return cashHistoryService.findAllTOByUnnAndGoodIdPage(id, unn, pageable);
    }

    @RequestMapping(value = "{id}/tos/list", method = RequestMethod.GET, produces = "application/json")
    public List<CashHistory> readTOByGoodIdList(@PathVariable Integer id, @RequestParam String unn) {
        return cashHistoryService.findAllTOByUnnAndGoodIdList(id, unn);
    }

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public Page<Good> readAll(Pageable pageable) {
        return goodService.getAllGoods(pageable);
    }

}
