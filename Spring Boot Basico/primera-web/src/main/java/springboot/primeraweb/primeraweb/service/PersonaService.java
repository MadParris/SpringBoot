package springboot.primeraweb.primeraweb.service;

import springboot.primeraweb.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();


    Persona obtnerPorId(Long id);
    Persona crearPersona(Persona persona);
}
