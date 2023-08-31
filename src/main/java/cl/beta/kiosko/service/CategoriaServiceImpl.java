package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Categoria;
import cl.beta.kiosko.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategories() {
        return categoriaRepository.findAll();
    }

    public Categoria getCategoryById(String id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria saveCategory(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteCategory(String id) {
        categoriaRepository.deleteById(id);
    }
}
