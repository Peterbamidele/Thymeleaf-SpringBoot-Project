package com.example.phonemangementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tables")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "modelname")
    private String modelName;
    @Column(name = "modelnumber")
    private String modelNumber;
    private String Capacity;
    private String ramSize;
    private String price;
    private String description;

}
