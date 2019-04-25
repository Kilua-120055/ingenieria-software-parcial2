package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarTodos() {
        return (List<ProductoEntity>) this.productoRepository.findAll();
    }
    
    public ProductoEntity registrarProducto(ProductoEntity varent) {
         String Name =varent.getName();
        
        Name=Name.substring(0,1).toUpperCase() + Name.substring(1).toLowerCase();
        varent.setName(Name);
        
        return this.productoRepository.save(varent);
    }
         public ProductoEntity actualizarStock(ProductoEntity stock, Long id) {
        return this.productoRepository.save(stock);        
    }
    
    
}
