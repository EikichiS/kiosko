package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public Producto crear(Producto producto);

    public List<Producto> listar();

    public Optional<Producto> listarPorProducto(String id);
}
