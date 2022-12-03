package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String colorname;

    @ManyToMany(mappedBy = "colors", cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JsonIgnoreProperties("colors")
    List<Product> products;

    public Color(String colorname, List<Product> products) {
        this.colorname = colorname;
        this.products = products;
    }
}
