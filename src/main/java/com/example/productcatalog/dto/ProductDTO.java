package com.example.productcatalog.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    long id;
    String productName;
    String size;
    String sku;
    String color;
    double price;
    
}
