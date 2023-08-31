package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Categoria;
import cl.beta.kiosko.models.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {

    public List<DetalleVenta> getAllDetalles();

    public DetalleVenta getDetalleById(String id);

    public DetalleVenta saveDetalle(DetalleVenta detalleVenta);

    public void deleteDetalle(String id);
}
