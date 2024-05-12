package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @ManyToMany
//    @JoinTable(name = "product_category_rel", joinColumns = @JoinColumn(name = "c_id"),
//    inverseJoinColumns = @JoinColumn(name = "p_id"))
//    private List<Product> productList; //10000000
}
