package com.alkemy.preaceleracion.preaceleracion.repository;

import com.alkemy.preaceleracion.preaceleracion.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
