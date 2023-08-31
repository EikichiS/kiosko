package cl.beta.kiosko.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("inventario")
public class Inventario {

    @Id
    private String id;

    @DBRef
    private Producto producto;

    private int cantidad;
}
