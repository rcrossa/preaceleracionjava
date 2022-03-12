package com.alkemy.preaceleracion.preaceleracion.service;

import com.alkemy.preaceleracion.preaceleracion.dto.GenderDTO;

import java.util.List;

public interface GenderService {
     GenderDTO save(GenderDTO dto);

    List<GenderDTO> getAllGenders();
}
