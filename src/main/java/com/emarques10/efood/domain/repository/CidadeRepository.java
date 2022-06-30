package com.emarques10.efood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emarques10.efood.domain.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
