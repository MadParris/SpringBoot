package primera_web.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import primera_web.entities.Persona;
import primera_web.repository.PersonaRepository;
import primera_web.services.PersonaService;

import java.util.List;

@Service
//Estereotipo que se encarga de las operaciones del negocio.
// LLAMA A LOS REPOS, los invoca como en la linea 17
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
        //Si no se coloca el "orElse(null)" devuelve error, es decir si no
        //encuentra a la persona por id, pues tiene que retornar null.
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaBBDD = personaRepository.findById(id).orElse(null);
        //Primero se debe saber que persona hay que actualizar.
        //Es decir, que si no encuentra a las persona por el id, se le pone un null
        //Y eso se va guardar en ese objeto "personaBBDD"
        if(personaBBDD != null){
            //Si la persona ya existe, se va actualizar la informacion (el id no puede cambiar)
            personaBBDD.setName(persona.getName());
            personaBBDD.setAge(persona.getAge());
            return personaRepository.save(personaBBDD);
            //Guarda ese mismo registro en la DDBB, no se guarda un nuevo registro
            //porque el id es el mismo.
        }
        return null;
        //Si la persona es null, o sea si NO existe la persona. Pues no hay que actualizar nada
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}
