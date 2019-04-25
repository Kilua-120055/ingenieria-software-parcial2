package gt.edu.umg.ingenieria.sistemas.parcial2.factura.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cabeceraFactura")
public class DetalleFacturaController {
    @Autowired
    private FacturaService DetalleFacturaService;
            
    @PostMapping("/crearFactura")
    public DetalleFacturaEntity crearFactura(@RequestBody(required = true) DetalleFacturaEntity varent){
        return this.DetalleFacturaService.crearFactura(varent);
    }
        
}
