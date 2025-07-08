package model;

public abstract class PaginaEntidad extends Pagina {
	protected Entidad entidad;
	
	public PaginaEntidad(String id, String nombre){
		super(id, nombre);
	}

	public Entidad getEntidad(){
		return this.entidad;
	}

	public void setEntidad(Entidad entidad){
		this.entidad = entidad;
	}
}
