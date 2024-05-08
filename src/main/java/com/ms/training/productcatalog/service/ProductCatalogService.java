package com.ms.training.productcatalog.service;

import java.util.List;
import java.util.Optional;

import com.ms.training.productcatalog.entity.ProductCatalogEntity;


public interface ProductCatalogService {
	public List<ProductCatalogEntity> getProducts();
	public ProductCatalogEntity saveProduct(ProductCatalogEntity entity);
	public ProductCatalogEntity editProduct(ProductCatalogEntity entity) ;
	public void deleteProduct(Long id);
	
}
