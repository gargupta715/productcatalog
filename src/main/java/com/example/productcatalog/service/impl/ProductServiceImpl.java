package com.example.productcatalog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productcatalog.dto.ProductDTO;
import com.example.productcatalog.repository.ProductRepository;
import com.example.productcatalog.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
  
  public List<ProductDTO> getProductList() {
    List<ProductDTO> products =  new ArrayList<>();
    ProductDTO p1 = new ProductDTO(1,"tshirt", "S" ,"skt", "Blue", 6.0);
    products.add(0, p1);
    return products;
  }

  @Override
  public ProductDTO saveProduct(ProductDTO product) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'saveProduc'");
  }

  @Override
  public ProductDTO deleteProduct(long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
  }
    
}
