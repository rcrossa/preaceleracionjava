package com.alkemy.preaceleracion.preaceleracion.controller;

import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import com.alkemy.preaceleracion.preaceleracion.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("film")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @PostMapping
    public ResponseEntity<FilmDTO> save(@RequestBody FilmDTO film) {
        FilmDTO filmSave = filmService.save(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(filmSave);
    }
}
