package dao;
import model.Asignatura;
import java.util.List;



public interface daoAsignatura {
	List<Asignatura> getAllAsignaturas();
	Asignatura getAsignaturaById(int id);
	void insertAsignatura(Asignatura asignatura);
	void updateAsignatura(Asignatura asignatura);
	void deleteAsignatura(Asignatura asignatura);
}
