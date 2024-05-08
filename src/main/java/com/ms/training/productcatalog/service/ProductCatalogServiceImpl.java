package com.ms.training.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.training.productcatalog.entity.ProductCatalogEntity;
import com.ms.training.productcatalog.repo.ProductCatalogRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

	@Autowired
	private ProductCatalogRepository repository;

	public List<ProductCatalogEntity> getProducts() {
		return repository.findAll();
	}

	public ProductCatalogEntity saveProduct(ProductCatalogEntity entity) {
		repository.save(entity);
		return entity;
	}

	public ProductCatalogEntity editProduct(ProductCatalogEntity entity) {
		Optional<ProductCatalogEntity> productFromDb = repository.findById(entity.getId());

		if (productFromDb.isPresent()) {
			ProductCatalogEntity b = productFromDb.get();
			b.setProducttype(entity.getProducttype());
			b.setProductname(entity.getProductname());
			b.setProductFeatures(entity.getProductFeatures());
			b.setDescriptions(entity.getDescriptions());
			b.setProductcode(entity.getProductcode());
			b.setPrice(entity.getPrice());
			b.setLength(entity.getLength());
			b.setHeight(entity.getHeight());
			b.setWidth(entity.getWidth());
			b.setWeight(entity.getWeight());
			b.setAvailability(entity.getAvailability());
			b.setColor(entity.getColor());
			b.setCustomerReviews(entity.getCustomerReviews());
			b.setIsActive(1);
			b.setCreatedDate(new Date());
			
			repository.save(b);

		} else {
			repository.save(entity);
		}

		return entity;
	}

	public void deleteProduct(Long id) {
		repository.deleteById(id);
	}

	
}
