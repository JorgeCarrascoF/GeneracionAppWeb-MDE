package dao;
import model.Autor;
import java.util.List;



public interface daoAutor {
	List<Autor> getAllAutors();
	Autor getAutorById(int id);
	void insertAutor(Autor autor);
	void updateAutor(Autor autor);
	void deleteAutor(Autor autor);
}
