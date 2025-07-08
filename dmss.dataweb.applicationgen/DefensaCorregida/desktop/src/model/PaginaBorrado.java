package model;

public class PaginaBorrado extends PaginaEntidad {
	
	public PaginaBorrado(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		System.out.println("Entidades de tipo " + this.entidad.getNombreEntidad() + " que hay en el sistema:");
		System.out.println();

		for(int i = 1; i < 4; i++){
					System.out.println(i+"."+ this.entidad.getNombreEntidad() +"-0" + i);
		}
		
		System.out.println("\n\n Elija una para borrar la entidad.\nPulse 0 para volver al inicio.");
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else {
			System.out.println("Â¡Has borrado " + this.entidad.getNombreEntidad() + "-0" + input + "!");
		}
	}
}
