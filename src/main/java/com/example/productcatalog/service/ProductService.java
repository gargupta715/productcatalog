package com.example.productcatalog.service;

import com.example.productcatalog.dto.ProductDTO;

import java.util.List;

public interface ProductService {

  List<ProductDTO> getProductList();

  ProductDTO saveProduct(ProductDTO product);

ProductDTO deleteProduct(long id);
    
}
