package com.sheryians.major.model;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    private double price;

    private double weight;

    private  String description;

    private String imageName;


}
