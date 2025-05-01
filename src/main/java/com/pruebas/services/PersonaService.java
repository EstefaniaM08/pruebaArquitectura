package com.pruebas.services;

import com.pruebas.persistence.entities.Persona;
import com.pruebas.persistence.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }
}
