package cl.beta.kiosko.controller;

import cl.beta.kiosko.models.Venta;
import cl.beta.kiosko.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/crear")
    public ResponseEntity<Venta> crear(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.crear(venta));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Venta>> listar(){
        return ResponseEntity.ok(ventaService.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<List<Venta>> listarPorProducto(@PathVariable(name = "id", required = true) String id){
        return ResponseEntity.ok(ventaService.listarPorProducto(id));
    }
}
