package springboot.primeraweb.primeraweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.primeraweb.primeraweb.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

