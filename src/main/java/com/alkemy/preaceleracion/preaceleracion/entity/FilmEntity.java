package com.alkemy.preaceleracion.preaceleracion.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "film")
@Getter
@Setter
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String image;
    private String title;
    @Column(name = "date_create")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateCreate;

    private int rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gender_id", insertable = false, updatable = false)
    private GenderEntity gender;

    @Column(name = "gender_id", nullable = false)
    private Long gender_id;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "film_character", joinColumns = @JoinColumn(name = "film_id" ),
            inverseJoinColumns = @JoinColumn(name = "character_id"))
    private Set<CharacterEntity> characters = new HashSet<>();

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "character_id", insertable = false, updatable = false)
//    private CharacterEntity character;
//
//    @Column(name = "character_id", nullable = false)
//    private Long character_id;

}
