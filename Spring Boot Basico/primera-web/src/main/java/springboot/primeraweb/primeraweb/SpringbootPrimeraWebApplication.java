package springboot.primeraweb.primeraweb;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.primeraweb.primeraweb.entities.Persona;
import springboot.primeraweb.primeraweb.repository.PersonaRepository;

import java.util.List;

@SpringBootApplication
public class SpringbootPrimeraWebApplication implements CommandLineRunner{

	@Autowired
	private PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPrimeraWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personaRepository.save(new Persona(1L, "Sebastian", 31));
		personaRepository.save(new Persona(2L, "Camila", 26));
		personaRepository.save(new Persona(3L, "Enzo", 8));
		personaRepository.save(new Persona(4L, "Mariana", 10));

		//Mostrar la cantidad de personas
		System.out.println("Numero de personas de la tabla: "+ personaRepository.count());

		List<Persona> personaList = personaRepository.findAll();
		personaList.forEach(per -> System.out.println("Nombre de la persona: "+per.getName()));
	}
}
