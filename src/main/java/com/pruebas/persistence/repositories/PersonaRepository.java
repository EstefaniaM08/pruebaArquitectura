package com.pruebas.persistence.repositories;

import com.pruebas.persistence.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
