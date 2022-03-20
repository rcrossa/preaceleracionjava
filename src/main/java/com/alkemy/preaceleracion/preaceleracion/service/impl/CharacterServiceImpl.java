package com.alkemy.preaceleracion.preaceleracion.service.impl;

import com.alkemy.preaceleracion.preaceleracion.dto.CharacterDTO;
import com.alkemy.preaceleracion.preaceleracion.entity.CharacterEntity;
import com.alkemy.preaceleracion.preaceleracion.mapper.CharacterMapper;
import com.alkemy.preaceleracion.preaceleracion.repository.CharacterRepository;
import com.alkemy.preaceleracion.preaceleracion.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterMapper characterMapper;

    @Autowired
    private CharacterRepository characterRespository;

    public CharacterDTO save(CharacterDTO dto){
        CharacterEntity entity = characterMapper.characterDTO2Entity(dto);
        CharacterEntity characterSave = characterRespository.save(entity);
        CharacterDTO result = characterMapper.characterEntity2DTO(characterSave);
        return result;
    }

    public List<CharacterDTO> getAllcharacters(){
        List<CharacterEntity> entities = characterRespository.findAll();
        List<CharacterDTO> result = characterMapper.characterEntityList2DTOList(entities);
        return result;
    }

    public void delete(Long id){
        this.characterRespository.deleteById(id);
    }
}
