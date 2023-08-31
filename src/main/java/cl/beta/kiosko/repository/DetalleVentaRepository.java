package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.DetalleVenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DetalleVentaRepository extends MongoRepository<DetalleVenta,String> {
}
