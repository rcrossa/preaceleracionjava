package com.alkemy.preaceleracion.preaceleracion.service;

import com.alkemy.preaceleracion.preaceleracion.dto.CharacterDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CharacterService {

    CharacterDTO save(CharacterDTO dto);

    List<CharacterDTO> getAllcharacters();

    void delete(Long id);
}
