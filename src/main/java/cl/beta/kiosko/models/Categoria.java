package cl.beta.kiosko.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("categoria")
public class Categoria {

    @Id
    private String id;

    private String nombre;

    private String codigo;

    private String descripcion;
}
