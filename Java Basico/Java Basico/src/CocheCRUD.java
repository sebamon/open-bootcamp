import java.util.List;

public interface CocheCRUD {
    public void save(Coche coche);
    public void delete(Coche coche);
    public List<Coche> findAll();
    
}
