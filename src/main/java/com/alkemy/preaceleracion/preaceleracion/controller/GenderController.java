package com.alkemy.preaceleracion.preaceleracion.controller;


import com.alkemy.preaceleracion.preaceleracion.dto.GenderDTO;
import com.alkemy.preaceleracion.preaceleracion.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("gender")
public class GenderController {

    @Autowired
    private GenderService genderService;


    @GetMapping
    public  ResponseEntity<List<GenderDTO>> getAll(){
        List<GenderDTO> genders = genderService.getAllGenders();
        return  ResponseEntity.ok().body(genders);
    }

    @PostMapping
    public ResponseEntity<GenderDTO> save(@RequestBody GenderDTO gender){
        GenderDTO genderSave = genderService.save(gender);
        return ResponseEntity.status(HttpStatus.CREATED).body(genderSave);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> delete(@PathVariable Long id){
        this.genderService.delete(id);
        return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
