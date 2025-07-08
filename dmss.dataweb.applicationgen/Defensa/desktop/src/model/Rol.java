package model;
import java.util.List;
import java.util.ArrayList;

public class Rol {
	private String nombreRol;
	private List<Pagina> paginasAccesibles;

	public Rol(String nombreRol){
		this.nombreRol = nombreRol;
		this.paginasAccesibles = new ArrayList<>();		
	}

	// setters y getters
	public String getNombreRol(){
		return this.nombreRol;
	}
	public void setNombreRol(String nombre){
		this.nombreRol = nombre;
	}
	public List<Pagina> getPaginasAccesibles(){
		return this.paginasAccesibles;
	}
	public void setPaginas(List<Pagina> list){
		this.paginasAccesibles = list;
	}
	public void addPagina(Pagina pag){
		this.paginasAccesibles.add(pag);
	}	
}
