package cl.beta.kiosko.service;

import cl.beta.kiosko.models.DetalleVenta;
import cl.beta.kiosko.repository.CategoriaRepository;
import cl.beta.kiosko.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> getAllDetalles() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta getDetalleById(String id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleVenta saveDetalle(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public void deleteDetalle(String id) {
        detalleVentaRepository.deleteById(id);
    }
}
