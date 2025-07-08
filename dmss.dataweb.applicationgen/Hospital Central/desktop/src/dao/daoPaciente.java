package dao;
import model.Paciente;
import java.util.List;



public interface daoPaciente {
	List<Paciente> getAllPacientes();
	Paciente getPacienteById(int id);
	void insertPaciente(Paciente paciente);
	void updatePaciente(Paciente paciente);
	void deletePaciente(Paciente paciente);
}
