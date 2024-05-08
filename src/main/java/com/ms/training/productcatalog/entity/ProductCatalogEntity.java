package com.ms.training.productcatalog.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="productcatalog")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductCatalogEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String productname;
    private String producttype;
    private String productcode;
    
    private String productFeatures;
    private String descriptions;
    private String price;
    private String length;
    private String height; 
    private String width;
    private String weight; 
     
    private String availability;
    private String color;
    private String customerReviews;
    
    private int isActive;
    private Date createdDate;
    
    
}
