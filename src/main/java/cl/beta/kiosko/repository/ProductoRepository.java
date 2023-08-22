package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {


}
