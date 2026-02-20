package primera_web.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Para mapear estas variables en una tabla en una BBDD
@Table(name = "tbl_personas") //Cambiar el nombre de la tabla

@Data //Para crear setters y getters (lombok)
@AllArgsConstructor //Crea constructor con todos los parametros (lombok)
@NoArgsConstructor //Crea constructor vacio (lombok)
public class Persona {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //"GenerationType.IDENTITY" es para que el id aumente automaticamente de uno en uno
    //Empieza desde uno, asi que si la BBDD ya tiene unas personas asignadas, pues va ser error,
    //Toca limpiar la tabla desde 0, que no haya id. Entonces en el
    // .properties se pone "spring.jpa.hibernate.ddl-auto=create-drop"

    @Id //Esta sera la primary key
    private Long id;

    private String name;

    private int age;

}
