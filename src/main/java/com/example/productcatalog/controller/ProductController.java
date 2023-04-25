package com.example.productcatalog.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.productcatalog.dto.ProductDTO;
import com.example.productcatalog.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.*;


@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class ProductController{

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;
    

    @GetMapping(value = "/getProductList", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<ProductDTO>> getProducts(){
        List<ProductDTO> products = productService.getProductList();
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

    @PostMapping(value = "/saveProduct", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO product){
        ProductDTO saveProduct = productService.saveProduct(product);
        return new ResponseEntity<>(saveProduct,HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteProduct/{id}", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ProductDTO> deleteProduct(@PathVariable(name = "id") long id){
        ProductDTO saveProduct = productService.deleteProduct(id);
        return new ResponseEntity<>(saveProduct,HttpStatus.OK);
    }

}