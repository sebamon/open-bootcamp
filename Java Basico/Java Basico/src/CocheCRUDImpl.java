import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        System.out.println("Se llamo al metodo save de la implementacion");
        
    }
    
    @Override
    public void delete(Coche coche) {
        System.out.println("Se llamo al metodo delete de la implementacion");
        
    }
    
    @Override
    public List<Coche> findAll() {
        System.out.println("Se llamo al metodo findAll de la implementacion");
        return null;
    }
    
}
