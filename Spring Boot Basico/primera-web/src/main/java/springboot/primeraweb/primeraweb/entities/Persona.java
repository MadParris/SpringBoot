package springboot.primeraweb.primeraweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name =  "tbl_personas" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {


    @Id //Indico que es la llave primaria
    private Long id;

    private String name;

    private int age;
}


