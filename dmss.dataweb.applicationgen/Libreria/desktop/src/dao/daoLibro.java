package dao;
import model.Libro;
import java.util.List;



public interface daoLibro {
	List<Libro> getAllLibros();
	Libro getLibroById(int id);
	void insertLibro(Libro libro);
	void updateLibro(Libro libro);
	void deleteLibro(Libro libro);
}
