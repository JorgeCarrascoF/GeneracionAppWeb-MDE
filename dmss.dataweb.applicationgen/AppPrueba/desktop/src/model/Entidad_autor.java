package model;

public class Entidad_autor {
		private String nombreCompleto;
		private int FechaNacimiento;

	public Entidad_autor(){
	}

	public Entidad_autor(
		String nombreCompleto,
		int FechaNacimiento
	){	
		this.nombreCompleto = nombreCompleto;
		this.FechaNacimiento = FechaNacimiento;
	}

		public String getNombreCompleto(){
			return this.nombreCompleto;
		} 

		public void setNombreCompleto(String nombreCompleto){
			this.nombreCompleto = nombreCompleto;
		}
		public int getFechaNacimiento(){
			return this.FechaNacimiento;
		} 

		public void setFechaNacimiento(int FechaNacimiento){
			this.FechaNacimiento = FechaNacimiento;
		}
}
