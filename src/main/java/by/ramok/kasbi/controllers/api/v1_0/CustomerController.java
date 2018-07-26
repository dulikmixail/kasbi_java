package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(Props.API_V1_0 + "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public Page<Customer> readAll(Pageable pageable) {
        return customerService.getAllCustomers(pageable);
    }

    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public Page<Customer> filter(@RequestBody Customer customer, Pageable pageable) {
        return customerService.getCustomerByCustomer(customer, pageable);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Customer read(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }
}
