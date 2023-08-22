package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Venta;

import java.util.List;

public interface VentaService {

    public Venta crear(Venta venta);

    public List<Venta> listar();

    public List<Venta> listarPorProducto(String id);
}
