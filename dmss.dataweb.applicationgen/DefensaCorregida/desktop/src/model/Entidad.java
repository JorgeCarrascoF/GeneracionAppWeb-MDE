package model;
import java.util.List;
import java.util.ArrayList;

public class Entidad {
	private String idEntidad;
	private String nombreEntidad;
	
	private List<Atributo> atributos;
	private List<Entidad> referencias;
	private List<Pagina> paginas;

	public Entidad(String idEntidad, String nombreEntidad){
		this.idEntidad = idEntidad;
		this.nombreEntidad = nombreEntidad;
		this.atributos = new ArrayList<>();
		this.referencias = new ArrayList<>();
		this.paginas = new ArrayList<>();		
	}


	// setters y getters
	public String getIdEntidad(){
		return this.idEntidad;
	}
	public void setIdEntidad(String id){
		this.idEntidad = id;
	}

	public String getNombreEntidad(){
		return this.nombreEntidad;
	}
	public void setNombreEntidad(String nombre){
		this.nombreEntidad = nombre;
	}
	
	public List<Atributo> getAtributos(){
		return this.atributos;
	}
	public void setAtributos(List<Atributo> list){
		this.atributos = list;
	}
	public void addAtributo(Atributo att){
		this.atributos.add(att);
	}
	public Atributo getAtributoPorNombre(String nombre){
		for(Atributo a : this.atributos){
			if(a.getNombre().equals(nombre)){
				return a;
			}
		}
		System.out.println("No se ha encontrado el atributo con nombre: " + nombre);
		return null;	
	}

	public List<Entidad> getReferencias(){
		return this.referencias;
	}
	public void setReferencias(List<Entidad> list){
		this.referencias = list;
	}
	public void addReferencia(Entidad ref){
		this.referencias.add(ref);
	}	

	public List<Pagina> getPaginas(){
		return this.paginas;
	}
	public void setPaginas(List<Pagina> list){
		this.paginas = list;
	}
	public void addPagina(Pagina pag){
		this.paginas.add(pag);
	}	
}

