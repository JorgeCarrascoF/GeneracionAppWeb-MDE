package dao;
import model.Titulo;
import java.util.List;



public interface daoTitulo {
	List<Titulo> getAllTitulos();
	Titulo getTituloById(int id);
	void insertTitulo(Titulo titulo);
	void updateTitulo(Titulo titulo);
	void deleteTitulo(Titulo titulo);
}
