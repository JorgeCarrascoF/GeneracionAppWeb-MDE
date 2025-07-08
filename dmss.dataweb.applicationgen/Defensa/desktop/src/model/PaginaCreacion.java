package model;

public class PaginaCreacion extends PaginaEntidad {

	public PaginaCreacion(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		System.out.println("PÃ¡gina de creaciÃ³n de " + this.entidad.getNombreEntidad());
		System.out.println("Introduzca informaciÃ³n correspondiente a los siguientes campos:");
		for(int i = 0; i < this.entidad.getAtributos().size(); i++){
			System.out.println("- " + this.entidad.getAtributos().get(i).getNombre());
		}
		for(int i = 0; i < this.entidad.getReferencias().size(); i++){
			System.out.print("- " + this.entidad.getReferencias().get(i).getNombreEntidad());
		}
		System.out.println();

		System.out.println("Pulse 0 para volver al inicio.");	
		System.out.println("Pulse 1 para introducir los parÃ¡metros y crear un/a " + this.entidad.getNombreEntidad());
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else {
			System.out.println("Â¡Has creado un/a " + this.entidad.getNombreEntidad() + "!");
		}
	}
}
