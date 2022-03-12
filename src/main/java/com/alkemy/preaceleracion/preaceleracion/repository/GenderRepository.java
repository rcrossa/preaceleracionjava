package com.alkemy.preaceleracion.preaceleracion.repository;

import com.alkemy.preaceleracion.preaceleracion.entity.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<GenderEntity, Long> {

}
