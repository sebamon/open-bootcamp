public class App {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    public static void main(String[] args) throws Exception {
        
        Coche unCoche = new Coche();

        cocheCrud.save(unCoche);
        cocheCrud.delete(unCoche);
        cocheCrud.findAll();
        
    }
}
