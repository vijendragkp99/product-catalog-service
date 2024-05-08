package com.ms.training.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ms.training.productcatalog.entity.ProductCatalogEntity;
import com.ms.training.productcatalog.service.ProductCatalogServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/productcatalog")
public class ProductCatalogController {
    @Autowired
    private ProductCatalogServiceImpl service;

    @RequestMapping(value="/fetch", method = RequestMethod.GET)
    public List<ProductCatalogEntity> getProductCatalog(){
        return service.getProducts();
    }
    
    
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ProductCatalogEntity saveProductCatalog(@RequestBody ProductCatalogEntity entity){
        return service.saveProduct(entity);
    }
    
    @RequestMapping(value="/edit", method = RequestMethod.PUT)
    public ProductCatalogEntity editProductCatalog(@RequestBody ProductCatalogEntity entity){
        return service.editProduct(entity);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public String deleteProductCatalog(@PathVariable Long id){
        System.out.println("ID=" + id);
         service.deleteProduct(id);
         return "SUCCESS";
    }
    
    
}
