package com.alkemy.preaceleracion.preaceleracion.controller;

import com.alkemy.preaceleracion.preaceleracion.dto.CharacterDTO;
import com.alkemy.preaceleracion.preaceleracion.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;


    @PostMapping
    public ResponseEntity<CharacterDTO> save(@RequestBody CharacterDTO character){
        CharacterDTO characterSave = characterService.save(character);
        return  ResponseEntity.status(HttpStatus.CREATED).body(characterSave);
    }

    @DeleteMapping("id")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.characterService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
