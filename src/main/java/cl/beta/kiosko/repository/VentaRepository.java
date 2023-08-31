package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VentaRepository extends MongoRepository<Venta,String> {

}
