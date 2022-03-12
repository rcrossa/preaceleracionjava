package com.alkemy.preaceleracion.preaceleracion.entity;



import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "characters")
@Data
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private double weight;
    private String history;

}
