package primera_web.services;

import primera_web.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();

    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    long contarPersonas();
}

//Persona obtenerPorId(Long id);        // ← Retorna un objeto Persona
//List<Persona> obtenerTodas();         // ← Retorna una lista de Personas
//String obtenerNombre();               // ← Retorna un texto
//int calcularEdad();                   // ← Retorna un número entero
//boolean esMayorDeEdad();              // ← Retorna true/false
