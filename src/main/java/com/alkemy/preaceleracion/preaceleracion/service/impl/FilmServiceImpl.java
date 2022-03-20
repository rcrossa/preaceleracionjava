package com.alkemy.preaceleracion.preaceleracion.service.impl;

import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import com.alkemy.preaceleracion.preaceleracion.entity.FilmEntity;
import com.alkemy.preaceleracion.preaceleracion.mapper.FilmMapper;
import com.alkemy.preaceleracion.preaceleracion.repository.FilmRepository;
import com.alkemy.preaceleracion.preaceleracion.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private FilmRepository filmRespository;

    public FilmDTO save(FilmDTO dto){
        FilmEntity entity = filmMapper.filmDTO2Entity(dto);
        FilmEntity filmSave = filmRespository.save(entity);
        FilmDTO result = filmMapper.filmEntity2DTO(filmSave);
        return result;
    }

    public List<FilmDTO> getAllfilms(){
        List<FilmEntity> entities = filmRespository.findAll();
        List<FilmDTO> result = filmMapper.filmEntityList2DTOList(entities);
        return result;
    }

    public void delete(Long id) {
        this.filmRespository.deleteById(id);
    }

//    public Film editFilm(Long id, Film film){
//        Film editToEdit = getFilm(id);
//        editToEdit.setFilm
//    }
}
