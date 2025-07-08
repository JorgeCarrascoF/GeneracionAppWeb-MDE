package model;

public class EnlaceRRSS {
	private String nombre;
	private String enlace;

	public EnlaceRRSS(String nombre, String enlace){
		this.nombre = nombre;
		this.enlace = enlace;		
	}


	// setters y getters
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getEnlace(){
		return this.enlace;
	}
	public void setEnlace(String nombre){
		this.enlace = nombre;
	}

}
