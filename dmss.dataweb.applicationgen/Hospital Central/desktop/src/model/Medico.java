package model;

public class Medico {
		private String nombre;
		private String fechaIngreso;
		private int nomina;

	public Medico(){
	}

	public Medico(
		String nombre,
		String fechaIngreso,
		int nomina
	){	
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.nomina = nomina;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public String getFechaIngreso(){
			return this.fechaIngreso;
		} 

		public void setFechaIngreso(String fechaIngreso){
			this.fechaIngreso = fechaIngreso;
		}
		public int getNomina(){
			return this.nomina;
		} 

		public void setNomina(int nomina){
			this.nomina = nomina;
		}
}
