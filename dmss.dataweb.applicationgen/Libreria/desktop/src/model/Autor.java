package model;

public class Autor {
		private String nombre;
		private String localidad;

	public Autor(){
	}

	public Autor(
		String nombre,
		String localidad
	){	
		this.nombre = nombre;
		this.localidad = localidad;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public String getLocalidad(){
			return this.localidad;
		} 

		public void setLocalidad(String localidad){
			this.localidad = localidad;
		}
}
