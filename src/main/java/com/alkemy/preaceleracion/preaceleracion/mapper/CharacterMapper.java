package com.alkemy.preaceleracion.preaceleracion.mapper;

import com.alkemy.preaceleracion.preaceleracion.dto.CharacterDTO;
import com.alkemy.preaceleracion.preaceleracion.entity.CharacterEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterMapper {

    public CharacterEntity characterDTO2Entity(CharacterDTO dto){
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setName(dto.getName());
        characterEntity.setAge(dto.getAge());
        characterEntity.setWeight(dto.getWeight());
        characterEntity.setHistory(dto.getHistory());
        return characterEntity;
    }

    public CharacterDTO characterEntity2DTO(CharacterEntity entity){
        CharacterDTO dto = new CharacterDTO();
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setWeight(entity.getWeight());
        dto.setHistory(entity.getHistory());
        return dto;
    }

    public List<CharacterDTO> characterEntityList2DTOList(List<CharacterEntity> entities){
        List<CharacterDTO> dtos = new ArrayList<>();
        for(CharacterEntity entity : entities){
            dtos.add(this.characterEntity2DTO(entity));
        }
        return dtos;
    }


    public List<Character> characterDTOList2EntityList(List<CharacterDTO> characters) {
    }
}
