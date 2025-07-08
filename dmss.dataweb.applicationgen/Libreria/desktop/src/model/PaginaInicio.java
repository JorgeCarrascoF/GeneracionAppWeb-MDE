package model;
import main.App;

public class PaginaInicio extends Pagina {
	
	public PaginaInicio(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		this.mostrarEnlacesExternos();

		System.out.println("Por favor, elige un rol de acceso:");
		System.out.println("0. Salir");

		for(int i = 0; i < this.getPaginas().size(); i++){
				System.out.println(i+1 + ". " + this.getPaginas().get(i).getNombre());				
		}
	}
	@Override
	public void procesarInput(int input){
		if(input == 0){
			App.navegando = false;
		} else {
			Aplicacion.getInstancia().navegarA(this.getPaginas().get(input-1).getIdPagina());
		}
	}
}
