package Hairsalon.service;


import Hairsalon.database.dao.CustomerServiceDAO;
import Hairsalon.database.entity.CustomerService;
import Hairsalon.formbean.CreateServiceFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class CustomServiceService {

    private final CustomerServiceDAO customerServiceDAO;

    @Autowired
    public CustomServiceService(CustomerServiceDAO customerServiceDAO) {
        this.customerServiceDAO = customerServiceDAO;
    }

    public Optional<CustomerService> getServiceById(Integer id) {
        return customerServiceDAO.findById(id);
    }

    public CustomerService createOrUpdateService(CreateServiceFormBean form) {
        log.debug("id: " + form.getId());
        log.debug("name: " + form.getName());
        log.info("description: " + form.getDescription());
        log.info("price: " + form.getPrice());

        Optional<CustomerService> customerServiceOptional = customerServiceDAO.findById(form.getId());
        CustomerService customerService = customerServiceOptional.orElseGet(CustomerService::new);

        customerService.setName(form.getName());
        customerService.setDescription(form.getDescription());
        customerService.setPrice(form.getPrice());

        return customerServiceDAO.save(customerService);
    }
}


