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

    @PostMapping
    public ResponseEntity<Venta> crear(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaService.crear(venta));
    }

    @GetMapping
    public ResponseEntity<List<Venta>> listar(){
        return ResponseEntity.ok(ventaService.listar());
    }


}
