package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProveedorRepository extends MongoRepository<Proveedor,String> {
}
