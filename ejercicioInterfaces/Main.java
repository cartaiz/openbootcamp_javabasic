package ejercicioInterfaces;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCrud.save(new CocheCRUDImpl());
        cocheCrud.findAll();
        cocheCrud.delete(new CocheCRUDImpl());
    }


}
