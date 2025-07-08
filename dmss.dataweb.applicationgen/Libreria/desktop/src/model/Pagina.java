package model;
import java.util.List;
import java.util.ArrayList;

public abstract class Pagina {
	private String idPagina;
	private String nombrePagina;
	
	private List<String> enlacesPaginasExternas;
	private List<Pagina> enlacesPaginas;
	private List<EnlaceRRSS> enlacesRRSS;
	

	public Pagina(String id, String nombre){
		this.idPagina = id;		
		this.nombrePagina = nombre;

		this.enlacesPaginasExternas = new ArrayList<>();
		this.enlacesPaginas = new ArrayList<>();
		this.enlacesRRSS = new ArrayList<>();
	}


	// setters y getters
	public String getIdPagina(){
		return this.idPagina;
	}
	public void setIdPagina(String idPagina){
		this.idPagina = idPagina;
	}

	public String getNombre(){
		return this.nombrePagina;
	}
	public void setNombre(String nombre){
		this.nombrePagina = nombre;
	}

	public List<String> getPaginasExternas(){
		return this.enlacesPaginasExternas;
	}
	public void setPaginasExternas(List<String> list){
		this.enlacesPaginasExternas = list;
	}
	public void addPaginaExterna(String pag){
		this.enlacesPaginasExternas.add(pag);
	}

	public List<Pagina> getPaginas(){
		return this.enlacesPaginas;
	}
	public void setPaginas(List<Pagina> list){
		this.enlacesPaginas = list;
	}
	public void addPagina(Pagina pag){
		this.enlacesPaginas.add(pag);
	}

	public List<EnlaceRRSS> getEnlacesRRSS(){
		return this.enlacesRRSS;
	}
	public void setEnlacesRRSS(List<EnlaceRRSS> list){
		this.enlacesRRSS = list;
	}
	public void addEnlaceRRSS(EnlaceRRSS enlace){
		this.enlacesRRSS.add(enlace);
	}

	public void mostrar(){}
	public void procesarInput(int input){}
	public void mostrarEnlacesExternos(){
		if(this.enlacesRRSS.size() > 0 || this.enlacesPaginasExternas.size() > 0) {
			System.out.println("Enlaces externos:");
			for(EnlaceRRSS enlace : this.enlacesRRSS){
				System.out.println("- " + enlace.getNombre() + " / " + enlace.getEnlace());
			}
			for(String enlace : this.enlacesPaginasExternas){
				System.out.println("- " + enlace);
			}
		}
	}
}
