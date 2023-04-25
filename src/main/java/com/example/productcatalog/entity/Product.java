package com.example.productcatalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;


@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 2069937152339670231L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @Column(name = "product_id")
    long id;


    @Column(name = "product_name")
    String productName;

    @Column(name = "size")
    String size;

    @Column(name = "sku")
    String sku;

    @Column(name = "color")
    String color;

    @Column(name = "price")
    double price;




    
}
