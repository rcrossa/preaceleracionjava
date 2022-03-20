package com.alkemy.preaceleracion.preaceleracion.mapper;

import com.alkemy.preaceleracion.preaceleracion.dto.CharacterDTO;
import com.alkemy.preaceleracion.preaceleracion.dto.FilmDTO;
import com.alkemy.preaceleracion.preaceleracion.entity.FilmEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilmMapper {

    @Autowired
    private CharacterMapper characterMapper;

    public FilmEntity filmDTO2Entity(FilmDTO dto){
        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setImage(dto.getImage());
        filmEntity.setTitle(dto.getTitle());
        filmEntity.setDateCreate(dto.getDateCreate());
        filmEntity.setRating(dto.getRating());
        filmEntity.setGender_id(dto.getGender_id());
        List<Character> characters = characterMapper.characterDTOList2EntityList(dto.getCharacters());
        filmEntity.setCharacters(characters);
        return filmEntity;
    }

    public FilmDTO filmEntity2DTO(FilmEntity entity){
        FilmDTO dto = new FilmDTO();
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setDateCreate(entity.getDateCreate());
        dto.setRating(entity.getRating());
        return  dto;
    }

    public List<FilmDTO> filmEntityList2DTOList(List<FilmEntity> entities) {
        List<FilmDTO> dtos = new ArrayList<>();
        for (FilmEntity entity : entities){
            dtos.add(this.filmEntity2DTO(entity));
        }
        return dtos;
    }

}
