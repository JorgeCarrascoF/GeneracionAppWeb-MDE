package dao;
import model.Matricula;
import java.util.List;



public interface daoMatricula {
	List<Matricula> getAllMatriculas();
	Matricula getMatriculaById(int id);
	void insertMatricula(Matricula matricula);
	void updateMatricula(Matricula matricula);
	void deleteMatricula(Matricula matricula);
}
