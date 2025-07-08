package model;

public class Atributo {
	private String nombreAtributo;
	private TipoDato tipo;


	public Atributo(String nombre, TipoDato tipo){
		this.nombreAtributo = nombre;
		this.tipo = tipo;		
	}


	// setters y getters
	public String getNombre(){
		return this.nombreAtributo;
	}
	public void setNombre(String nombre){
		this.nombreAtributo = nombre;
	}

	public TipoDato getTipo(){
		return this.tipo;
	}
	public void setTipo(TipoDato tipo){
		this.tipo = tipo;
	}
		
}

