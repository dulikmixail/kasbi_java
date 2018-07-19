package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.entities.Customer;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(Props.API_V1_0 + "/customers")
public class CustomerController {

    @Autowired
    CustomerService service;

    @RequestMapping(value = {"", "/all"}, method = RequestMethod.GET, produces = "application/json")
    public List<Customer> readAll() {
        List<Customer> customers = service.getAllCustomers();
        if (customers.size() == 0) throw new ResourceNotFoundException();
        return customers;
    }

    @RequestMapping(value = "/filter", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public Customer getByUnp(@RequestParam String unn) {
        Customer customer = service.getCustomerByUnp(unn);
        if (customer == null) throw new ResourceNotFoundException();
        return customer;
    }

    @RequestMapping(value = "/debt", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public Customer getDebtByUnp(@RequestParam String unn) {
        Customer customer = service.getCustomerByUnp(unn);
        if (customer == null) throw new ResourceNotFoundException();
        return customer;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
    public Customer read(@PathVariable int id) {
        Customer customer = service.getCustomer(id);
        if (customer == null) throw new ResourceNotFoundException();
        return customer;
    }
}
