package com.emarques10.efood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emarques10.efood.domain.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
