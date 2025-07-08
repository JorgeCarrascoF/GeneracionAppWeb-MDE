package dao;
import model.Medico;
import java.util.List;



public interface daoMedico {
	List<Medico> getAllMedicos();
	Medico getMedicoById(int id);
	void insertMedico(Medico medico);
	void updateMedico(Medico medico);
	void deleteMedico(Medico medico);
}
