package com.alkemy.preaceleracion.preaceleracion.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FilmDTO {
    private int id;
    private String image;
    private String title;
    private LocalDate dateCreate;
    private int rating;
}
