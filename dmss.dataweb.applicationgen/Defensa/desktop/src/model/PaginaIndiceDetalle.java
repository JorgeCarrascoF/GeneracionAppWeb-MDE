package model;

public class PaginaIndiceDetalle extends PaginaIndice {


	public PaginaIndiceDetalle(String id, String nombre){
		super(id, nombre);
	}

	@Override
	public void mostrar(){
		System.out.println("Entidades de tipo " + this.entidad.getNombreEntidad() + " que hay en el sistema:");

		System.out.println();
		for(int i = 1; i < 4; i++){
			for(int j = 0; j <= this.getAtributos().size(); j++)	{
				if(j == 0){
					System.out.print(i+"."+ this.entidad.getNombreEntidad() +"-0" + i);
				} else {
					System.out.print("    " + this.getAtributos().get(j-1).getNombre() + "-0" + i);
				}
			}
			System.out.println();
		}

		System.out.println("Pulse 0 para volver al inicio.");
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		}
	}
}
