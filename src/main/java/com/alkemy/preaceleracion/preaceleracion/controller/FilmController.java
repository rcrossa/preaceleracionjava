package com.alkemy.preaceleracion.preaceleracion.controller;

import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import com.alkemy.preaceleracion.preaceleracion.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public ResponseEntity<List<FilmDTO>> getAll(){
        List<FilmDTO> films = filmService.getAllfilms();
        return ResponseEntity.ok().body(films);
    }

    @PostMapping
    public ResponseEntity<FilmDTO> save(@RequestBody FilmDTO film) {
        FilmDTO filmSave = filmService.save(film);
        return ResponseEntity.status(HttpStatus.CREATED).body(filmSave);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.filmService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
