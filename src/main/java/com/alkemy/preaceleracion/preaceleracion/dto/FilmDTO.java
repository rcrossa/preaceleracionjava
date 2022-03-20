package com.alkemy.preaceleracion.preaceleracion.dto;


import com.alkemy.preaceleracion.preaceleracion.entity.CharacterEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class FilmDTO {
    private Long id;
    private String image;
    private String title;
    private LocalDate dateCreate;
    private int rating;
    private Long gender_id;

    private List<CharacterDTO> characters;
}
