package com.ifood.ordering.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifood.ordering.CustomerController.service.CustomerService;

@RestController
public class CustomerController{
    final String PREFIX_PATH = "api/customer/";

    @Autowired
    CustomerService customerService;

    @GetMapping(PREFIX_PATH +"doLogin")
    public String doLogin(){
        return customerService.doLogin();
    }

    @GetMapping(PREFIX_PATH +"registerCustomer")
    public String registerCustomer(){
        return "done register";
    }
}