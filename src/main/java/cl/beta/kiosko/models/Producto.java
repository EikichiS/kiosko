package cl.beta.kiosko.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("productos")
public class Producto {

    @Id
    private String id;
    @DBRef
    private Proveedor proveedor;

    @DBRef
    private Categoria categoria;

    private String sku;

    private String nombre;

    private int precio;

    private String descripcion;

    private String imagen;

    private String estado;

}
