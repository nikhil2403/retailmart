package com.mobilelive.nikhil.retailmart.domain;

import javax.persistence.*;
import java.util.List;

//@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

   /* @ManyToMany
    @JoinTable(name = "customer_order",joinColumns = {@JoinColumn(name = "name",referencedColumnName = "cname")}
    , inverseJoinColumns = { @JoinColumn( name = "pname",
            referencedColumnName = "name" ) })
    List<Product> productList;
    */
}
