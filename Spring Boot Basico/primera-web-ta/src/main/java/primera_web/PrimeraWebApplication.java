package primera_web;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import primera_web.entities.Persona;
import primera_web.services.PersonaService;

import java.util.List;

@SpringBootApplication
public class PrimeraWebApplication {



	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(4L, "Jesus", 50));
		personaService.crearPersona(new Persona(5L, "Eva", 50));

		//Mostrar el numero de personas
		System.out.println("EL numero de personas de la tabla: "+personaService.contarPersonas());

		//Mostrar la lsita de personas
		List<Persona> listaPersonas = personaService.obtenerTodas();
		listaPersonas.forEach(per -> System.out.println("Nombre de la persona: "+per.getName()));
	}*/
}
