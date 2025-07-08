package model;

public class Titulo {
		private String nombre;
		private int creditos;
		private String campo_cientifico;

	public Titulo(){
	}


	public Titulo(
		String nombre,
		int creditos,
		String campo_cientifico
	
	){	
		this.nombre = nombre;
		this.creditos = creditos;
		this.campo_cientifico = campo_cientifico;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public int getCreditos(){
			return this.creditos;
		} 

		public void setCreditos(int creditos){
			this.creditos = creditos;
		}
		public String getCampo_cientifico(){
			return this.campo_cientifico;
		} 

		public void setCampo_cientifico(String campo_cientifico){
			this.campo_cientifico = campo_cientifico;
		}
}
