package cl.beta.kiosko.controller;

import cl.beta.kiosko.models.Categoria;
import cl.beta.kiosko.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAllCategories() {
        return categoriaService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categoria getCategoryById(@PathVariable String id) {
        return categoriaService.getCategoryById(id);
    }

    @PostMapping
    public Categoria createCategory(@RequestBody Categoria category) {
        return categoriaService.saveCategory(category);
    }

    @PutMapping("/{id}")
    public Categoria updateCategory(@PathVariable String id, @RequestBody Categoria category) {
        // Set the ID of the category before updating
        category.setId(id);
        return categoriaService.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable String id) {
        categoriaService.deleteCategory(id);
    }
}
