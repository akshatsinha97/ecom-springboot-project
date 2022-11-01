package com.sheryians.major.dto;

import com.sheryians.major.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
    private Long id;

    private String name;

    private int categoryId;

    private double price;

    private double weight;

    private  String description;

    private String imageName;
}
