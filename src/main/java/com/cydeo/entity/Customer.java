package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private String email;
    private String firstName;
    private String lastName;
    private String userName;

    @OneToMany(mappedBy = "customer")
    private List<Address> address;

    @OneToOne(mappedBy = "customer")
    private Balance balance;

    @OneToMany(mappedBy = "customer")
    private List<Cart> cart;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;
}
