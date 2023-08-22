package cl.beta.kiosko.controller;

import cl.beta.kiosko.models.Producto;
import cl.beta.kiosko.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/crear")
    public ResponseEntity<Producto> crear(@RequestBody Producto producto){
        return ResponseEntity.ok(productoService.crear(producto));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar(){
        return ResponseEntity.ok(productoService.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Optional<Producto>> listarPorProducto(@PathVariable(name = "id", required = true) String id){
        return ResponseEntity.ok(productoService.listarPorProducto(id));
    }
}
