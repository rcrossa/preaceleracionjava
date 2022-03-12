package com.alkemy.preaceleracion.preaceleracion.service;

import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    public FilmDTO save(FilmDTO dto){
        System.out.println("Save film");
        return  dto;
    }
}
