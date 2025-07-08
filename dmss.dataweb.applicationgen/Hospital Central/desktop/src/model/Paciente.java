package model;

public class Paciente {
		private String nombre;
		private int edad;
		private String fechaIngreso;
		private boolean enTratamiento;

	public Paciente(){
	}

	public Paciente(
		String nombre,
		int edad,
		String fechaIngreso,
		boolean enTratamiento
	){	
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.enTratamiento = enTratamiento;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public int getEdad(){
			return this.edad;
		} 

		public void setEdad(int edad){
			this.edad = edad;
		}
		public String getFechaIngreso(){
			return this.fechaIngreso;
		} 

		public void setFechaIngreso(String fechaIngreso){
			this.fechaIngreso = fechaIngreso;
		}
		public boolean getEnTratamiento(){
			return this.enTratamiento;
		} 

		public void setEnTratamiento(boolean enTratamiento){
			this.enTratamiento = enTratamiento;
		}
}
