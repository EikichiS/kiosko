package cl.beta.kiosko.controller;

import cl.beta.kiosko.models.DetalleVenta;
import cl.beta.kiosko.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleVenta")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> getAllDetalleVenta() { return  detalleVentaService.getAllDetalles(); }

    @GetMapping("/{id}")
    public DetalleVenta getDetalleVentaById(@PathVariable String id) {
        return detalleVentaService.getDetalleById(id);
    }

    @PostMapping
    public DetalleVenta createDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.saveDetalle(detalleVenta);
    }

    @PutMapping("/{id}")
    public DetalleVenta updateDetalleVenta(@PathVariable String id, @RequestBody DetalleVenta detalleVenta) {
        // Set the ID of the category before updating
        detalleVenta.setId(id);
        return detalleVentaService.saveDetalle(detalleVenta);
    }

    @DeleteMapping("/{id}")
    public void deleteDetalleVenta(@PathVariable String id) {
        detalleVentaService.deleteDetalle(id);
    }
}
