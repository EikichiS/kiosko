package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Inventario;
import cl.beta.kiosko.repository.InventarioRepository;
import cl.beta.kiosko.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService{

    @Autowired
    private InventarioRepository inventarioRepository;
    @Override
    public List<Inventario> getAllInventarios() {
        return inventarioRepository.findAll();
    }

    @Override
    public Inventario getInventarioById(String id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    @Override
    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public void deleteInventario(String id) {
        inventarioRepository.deleteById(id);
    }
}
