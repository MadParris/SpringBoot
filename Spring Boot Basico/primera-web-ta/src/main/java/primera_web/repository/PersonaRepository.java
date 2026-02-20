package primera_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primera_web.entities.Persona;

@Repository //Es el estereotipo que ayuda a la comunicacion con la BBDD
public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
