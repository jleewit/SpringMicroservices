package com.nl.controller;

import com.nl.contracts.ProductResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private static List<ProductResponse> products=new ArrayList();
    static {
        ProductResponse p=new ProductResponse(1,"Microwave","Samsung Microwave","Electronics",150.00,true);
        products.add(p);
        p=new ProductResponse(2,"TV","Samsung TV","Electronics",750.00,true);
        products.add(p);
        p=new ProductResponse(3,"iPhone 13","Apple iPhone 13","Electronics",930.00,true);
        products.add(p);
    }
    @RequestMapping(value = "/",method={RequestMethod.GET})
    public List<ProductResponse> getProducts(){
        return products;
    }

}
