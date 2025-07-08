package model;

public class PaginaActualizacion extends PaginaEntidad {

	public PaginaActualizacion(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		System.out.println("PÃ¡gina de actualizaciÃ³n de " + this.entidad.getNombreEntidad() + "-0x");
		System.out.println("Introduzca informaciÃ³n correspondiente a los siguientes campos:");
		for(int i = 0; i < this.entidad.getAtributos().size(); i++){
			System.out.println("- " + this.entidad.getAtributos().get(i).getNombre());
		}
		System.out.println();

		System.out.println("Pulse 0 para volver al inicio.");	
		System.out.println("Pulse 1 para introducir los parÃ¡metros y actualizar " + this.entidad.getNombreEntidad() + "-0x");
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else {
			System.out.println("Â¡Has actualizado " + this.entidad.getNombreEntidad() + "-0x!");
		}
	}
}
