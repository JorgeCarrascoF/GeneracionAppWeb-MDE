package model;

public class Titulo {
		private String nombre;
		private int créditos;
		private String campo_cientifico;

	public Titulo(){
	}


	public Titulo(
		String nombre,
		int créditos,
		String campo_cientifico
	
	){	
		this.nombre = nombre;
		this.créditos = créditos;
		this.campo_cientifico = campo_cientifico;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public int getCréditos(){
			return this.créditos;
		} 

		public void setCréditos(int créditos){
			this.créditos = créditos;
		}
		public String getCampo_cientifico(){
			return this.campo_cientifico;
		} 

		public void setCampo_cientifico(String campo_cientifico){
			this.campo_cientifico = campo_cientifico;
		}
}
