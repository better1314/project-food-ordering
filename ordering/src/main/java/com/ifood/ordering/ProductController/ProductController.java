package com.ifood.ordering.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    final String PREFIX_PATH = "api/product/";

    @GetMapping(PREFIX_PATH +"addProduct")
    public String addProduct(){
        return "added a product";
    }
    
}
