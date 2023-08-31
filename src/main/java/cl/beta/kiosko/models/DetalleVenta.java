package cl.beta.kiosko.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("detalleVenta")
public class DetalleVenta {
    @Id
    private String id;
    @DBRef
    private Venta venta;
    @DBRef
    private Producto producto;

    private int cantidad;

    private int subtotal;

    private String medioPago;

    private String estado;

}
