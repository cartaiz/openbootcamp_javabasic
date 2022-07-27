package ejercicioInterfaces;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUD cocheCRUD);

    List<CocheCRUD> findAll();

    void delete(CocheCRUD cocheCRUD);
}
