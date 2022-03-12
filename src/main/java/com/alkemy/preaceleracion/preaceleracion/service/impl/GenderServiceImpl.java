package com.alkemy.preaceleracion.preaceleracion.service.impl;

import com.alkemy.preaceleracion.preaceleracion.dto.GenderDTO;
import com.alkemy.preaceleracion.preaceleracion.entity.GenderEntity;
import com.alkemy.preaceleracion.preaceleracion.mapper.GenderMapper;
import com.alkemy.preaceleracion.preaceleracion.repository.GenderRepository;
import com.alkemy.preaceleracion.preaceleracion.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    private GenderMapper genderMapper;

    @Autowired
    private GenderRepository genderRepository;

    public GenderDTO save(GenderDTO dto){
        GenderEntity entity = genderMapper.genderDTO2Entity(dto);
        GenderEntity genderSaved = genderRepository.save(entity);
        GenderDTO result = genderMapper.genderEntity2DTO(genderSaved);
        return result;
    }

    public List<GenderDTO> getAllGenders(){
        List<GenderEntity> entities = genderRepository.findAll();
        List<GenderDTO> result = genderMapper.genderEntityList2DTOList(entities);
        return result;
    }
}
