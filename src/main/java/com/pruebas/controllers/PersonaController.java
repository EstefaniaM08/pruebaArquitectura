package com.pruebas.controllers;

import com.pruebas.persistence.entities.Persona;
import com.pruebas.services.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaService.guardarPersona(persona);
    }

    @GetMapping
    public List<Persona> listarPersonas() {
        return personaService.obtenerTodas();
    }
}
