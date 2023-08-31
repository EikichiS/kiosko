package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Proveedor;
import cl.beta.kiosko.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> getAllSuppliers() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor getSupplierById(String id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor saveSupplier(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void deleteSupplier(String id) {
        proveedorRepository.deleteById(id);
    }
}
