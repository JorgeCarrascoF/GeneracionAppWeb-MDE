package dao;
import model.Entidad_autor;
import java.util.List;



public interface daoEntidad_autor {
	List<Entidad_autor> getAllEntidad_autors();
	Entidad_autor getEntidad_autorById(int id);
	void insertEntidad_autor(Entidad_autor entidad_autor);
	void updateEntidad_autor(Entidad_autor entidad_autor);
	void deleteEntidad_autor(Entidad_autor entidad_autor);
}
