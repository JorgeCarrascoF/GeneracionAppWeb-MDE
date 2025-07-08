
package model;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
	private static Aplicacion instancia = null; // Singleton
	private String idApp;
	private String nombre;
	private List<Pagina> paginas;
	private List<Rol> roles;
	private List<Entidad> entidades;
	private List<EnlaceRRSS> enlaces;

	private Pagina paginaActual;
	
	private Aplicacion(String idApp, String nombre){
		this.idApp = idApp;
		this.nombre  = nombre;

		this.paginas = new ArrayList<>();
		this.roles = new ArrayList<>();
		this.entidades = new ArrayList<>();
		this.enlaces = new ArrayList<>();
	}

	public static Aplicacion getInstancia(){
		if(instancia == null){
			instancia = new Aplicacion("Defensa", "Defensa");
		}
		return instancia;
	}

	// getters y setters
	public String getIdApp(){
		return idApp;
	}
	public void setIdApp(String id){
		this.idApp = id;
	}

	public String getNombreApp(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
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

	public Pagina getPaginaPorId(String id){
		for (Pagina p : paginas) {
        	if (p.getIdPagina().equals(id)) {
            	return p;
        	}
    	}
		System.out.println("No se ha encontrado la pagina con id: " + id);
    	return null;	
	}

	public List<Rol> getRoles(){
		return this.roles;
	}
	public void setRoles(List<Rol> list){
		this.roles = list;
	}
	public void addRol(Rol role){
		this.roles.add(role);
	}

	public List<Entidad> getEntidades(){
		return this.entidades;
	}
	public void setEntidades(List<Entidad> list){
		this.entidades = list;
	}
	public void addEntidad(Entidad ent){
		this.entidades.add(ent);
	}
	public Entidad getEntidadPorId(String id){
		for(Entidad e : this.entidades){
			if(e.getIdEntidad().equals(id)){
				return e;
			}
		}
		System.out.println("No se ha encontrado la entidad con id: " + id);
		return null;
	}

	public List<EnlaceRRSS> getEnlacesRRSS(){
		return this.enlaces;
	}
	public void setEnlacesRRSS(List<EnlaceRRSS> list){
		this.enlaces = list;
	}
	public void addEnlaceRRSS(EnlaceRRSS rrss){
		this.enlaces.add(rrss);
	}

	public EnlaceRRSS getEnlaceRRSSPorURL(String enlace){
			for(EnlaceRRSS e : this.enlaces){
			if(e.getEnlace().equals(enlace)){
				return e;
			}
		}
		System.out.println("No se ha encontrado el EnlaceRRSS con enlace: " + enlace);
		return null;
	}

	public void navegarA(String id){
		Pagina pag = getPaginaPorId(id);
		this.paginaActual = pag;
		
	}

	public void navegarAInicio(){
		navegarA("PaginaInicio");
	}

	public void mostrar(){
		System.out.println("\n\n\n\n\n"); // Simula limpiar la consola.
		this.paginaActual.mostrarEnlacesExternos();
		this.paginaActual.mostrar();
	}

	public void procesarInput(int input){
		this.paginaActual.procesarInput(input);
	}
}

