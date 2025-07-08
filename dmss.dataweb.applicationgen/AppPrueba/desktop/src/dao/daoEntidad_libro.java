package dao;
import model.Entidad_libro;
import java.util.List;



public interface daoEntidad_libro {
	List<Entidad_libro> getAllEntidad_libros();
	Entidad_libro getEntidad_libroById(int id);
	void insertEntidad_libro(Entidad_libro entidad_libro);
	void updateEntidad_libro(Entidad_libro entidad_libro);
	void deleteEntidad_libro(Entidad_libro entidad_libro);
}
