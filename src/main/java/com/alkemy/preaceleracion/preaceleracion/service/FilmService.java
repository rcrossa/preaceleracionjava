package com.alkemy.preaceleracion.preaceleracion.service;

import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {

    FilmDTO save(FilmDTO dto);

    List<FilmDTO> getAllfilms();

    void delete(Long id);

    FilmDTO editFilm(Long id)
}
