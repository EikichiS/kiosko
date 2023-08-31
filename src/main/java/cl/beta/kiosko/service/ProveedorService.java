package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Proveedor;

import java.util.List;

public interface ProveedorService {

    public List<Proveedor> getAllSuppliers();

    public Proveedor getSupplierById(String id);

    public Proveedor saveSupplier(Proveedor proveedor);

    public void deleteSupplier(String id);
}
