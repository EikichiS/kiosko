package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Categoria;

import java.util.List;

public interface CategoriaService {

    public List<Categoria> getAllCategories();

    public Categoria getCategoryById(String id);

    public Categoria saveCategory(Categoria categoria);

    public void deleteCategory(String id);

}
