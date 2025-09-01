package springboot.primeraweb.primeraweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import springboot.primeraweb.primeraweb.entities.Persona;
import springboot.primeraweb.primeraweb.repository.PersonaRepository;
import springboot.primeraweb.primeraweb.service.PersonaService;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository

    @Override
    public List<Persona> obtenerTodas() {
        return List.of();
    }

    @Override
    public Persona obtnerPorId(Long id) {
        return null;
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return null;
    }
}
