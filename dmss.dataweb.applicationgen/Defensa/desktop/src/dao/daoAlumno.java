package dao;
import model.Alumno;
import java.util.List;



public interface daoAlumno {
	List<Alumno> getAllAlumnos();
	Alumno getAlumnoById(int id);
	void insertAlumno(Alumno alumno);
	void updateAlumno(Alumno alumno);
	void deleteAlumno(Alumno alumno);
}
