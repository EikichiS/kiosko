package cl.beta.kiosko.repository;

import cl.beta.kiosko.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria,String> {
}
