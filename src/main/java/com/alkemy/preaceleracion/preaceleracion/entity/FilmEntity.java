package com.alkemy.preaceleracion.preaceleracion.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

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
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate dateCreate;

    private Long rating;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "gender_id", insertable = false, updatable = false)
    private GenderEntity gender;

    @Column(name = "gender_id", nullable = false)
    private Long gender_id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", insertable = false, updatable = false)
    private CharacterEntity character;

    @Column(name = "character_id", nullable = false)
    private Long character_id;

}
