package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.Inventario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventarioRepository extends MongoRepository<Inventario,String> {
}
