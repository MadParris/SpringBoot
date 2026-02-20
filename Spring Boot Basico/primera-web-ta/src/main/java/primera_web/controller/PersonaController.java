package primera_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import primera_web.entities.Persona;
import primera_web.services.PersonaService;

import java.util.List;

@Controller
//Dependera directamente del servicio, no del repository
@RequestMapping("listaPersonas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String listarPersonas(Model model){
        //La clase model se usa para transferir datos y objetos del controller a la vista
        List<Persona> listPer = personaService.obtenerTodas();
        model.addAttribute("listaPersonas", listPer);
        return "listas";
    }

    @GetMapping("/nuevaPersona")
    //Va redirigir a una archivo HTML, no PostMapping, solo me dirijo a un formulario
    public String mostrarFormNuevaPersona(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("accion", "/listaPersonas/nuevaPersona");
        return "formulario";
    }

    @PostMapping("/nuevaPersona")
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        //@ModelAttribute Convierte automáticamente los datos que llegan en una petición HTTP en un objeto Java.
        personaService.crearPersona(persona);
        return "redirect:/listaPersonas";
    }

    @GetMapping("/editar/{id}")
    public String editarPersona(@PathVariable Long id, @ModelAttribute Persona persona, Model model){
        //@PathVariable Sirve para capturar un valor que viene en la URL.
        //@ModelAttribute Persona persona para enlazar una perosna ya existente
        model.addAttribute("persona", persona);
        model.addAttribute("accion", "/listaPersonas/editar/"+id);
        return "formulario";
    }

    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable Long id, @ModelAttribute Persona persona){
        personaService.actualizarPersona(id, persona);
        //Se va guardar como un registro ya existente
        return "redirect:/listaPersonas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "redirect:/listaPersonas";
    }
}

