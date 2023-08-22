package cl.beta.kiosko.service;

import cl.beta.kiosko.models.Venta;
import cl.beta.kiosko.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public Venta crear(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public List<Venta> listarPorProducto(String id) {
        return ventaRepository.findAllByIdProducto(id);
    }
}
