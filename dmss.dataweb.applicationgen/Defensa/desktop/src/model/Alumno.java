package model;

public class Alumno {
		private String nombre;
		private int edad;
		private boolean evaluacionContinua;

	public Alumno(){
	}


	public Alumno(
		String nombre,
		int edad,
		boolean evaluacionContinua
	
	){	
		this.nombre = nombre;
		this.edad = edad;
		this.evaluacionContinua = evaluacionContinua;
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
		public boolean getEvaluacionContinua(){
			return this.evaluacionContinua;
		} 

		public void setEvaluacionContinua(boolean evaluacionContinua){
			this.evaluacionContinua = evaluacionContinua;
		}
}
