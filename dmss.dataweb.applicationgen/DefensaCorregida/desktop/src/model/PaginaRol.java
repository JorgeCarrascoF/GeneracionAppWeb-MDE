package model;

public class PaginaRol extends Pagina {
	
	public PaginaRol(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		System.out.println("Paginas a las que tiene acceso el rol " + this.getNombre());
		System.out.println("0. Volver al inicio");	
		for(int i = 1; i <= this.getPaginas().size(); i++){
			System.out.println(i + ". " + this.getPaginas().get(i-1).getNombre());
		}

	}
	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else {
			Aplicacion.getInstancia().navegarA(this.getPaginas().get(input-1).getIdPagina());
		}
	}
}
