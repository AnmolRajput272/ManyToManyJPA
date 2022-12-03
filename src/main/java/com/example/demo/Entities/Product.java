package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String description;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JoinTable(
            name = "Product_Color_Table",
            joinColumns = {
                    @JoinColumn(name = "product_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "color_id",referencedColumnName = "id")
            }
    )
    @JsonIgnoreProperties("products")
    List<Color> colors;

    public Product(String name, String description, List<Color> colors) {
        this.name = name;
        this.description = description;
        this.colors = colors;
    }

    public void addColor(Color color){
        colors.add(color);
    }
}
