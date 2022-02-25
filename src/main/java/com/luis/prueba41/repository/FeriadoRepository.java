package com.luis.prueba41.repository;

import com.luis.prueba41.model.Feriado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeriadoRepository extends JpaRepository<Feriado, Integer>
{}
