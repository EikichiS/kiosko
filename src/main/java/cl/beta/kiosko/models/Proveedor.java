package cl.beta.kiosko.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("proveedor")
public class Proveedor {

    @Id
    private String id;

    private String nombre;

    private String telefono;

    private String email;

}
