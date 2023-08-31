package cl.beta.kiosko.controller;

import cl.beta.kiosko.models.Inventario;
import cl.beta.kiosko.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> getAllInventario() {
        return inventarioService.getAllInventarios();
    }

    @GetMapping("/{id}")
    public Inventario getInventarioById(@PathVariable String id) {
        return inventarioService.getInventarioById(id);
    }

    @PostMapping
    public Inventario createInventario(@RequestBody Inventario inventario) {
        return inventarioService.saveInventario(inventario);
    }

    @PutMapping("/{id}")
    public Inventario updateInventario(@PathVariable String id, @RequestBody Inventario inventario) {
        // Set the ID of the Inventario before updating
        inventario.setId(id);
        return inventarioService.saveInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public void deleteInventario(@PathVariable String id) {
        inventarioService.deleteInventario(id);
    }
}
