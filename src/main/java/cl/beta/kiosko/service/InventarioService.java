package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Inventario;

import java.util.List;

public interface InventarioService {

    public List<Inventario> getAllInventarios();

    public Inventario getInventarioById(String id);

    public Inventario saveInventario(Inventario inventario);

    public void deleteInventario(String id);
}
