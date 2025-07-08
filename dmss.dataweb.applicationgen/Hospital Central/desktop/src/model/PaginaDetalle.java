package model;

public class PaginaDetalle extends PaginaEntidad {

	public PaginaDetalle(String id, String nombre){
		super(id, nombre);
	}
	
	@Override
	public void mostrar(){
		System.out.println(this.entidad.getNombreEntidad() + "-0x:");
		for (int i = 0; i <= this.entidad.getAtributos().size(); i++) {
			if (i == 0) {
				System.out.print("ID    ");
				System.out.println(this.entidad.getNombreEntidad() + "-0x");
			} else {
				System.out.print(this.entidad.getAtributos().get(i-1).getNombre() + "    ");
				System.out.println("    " + this.entidad.getAtributos().get(i - 1).getNombre() + "-0x");
			}

		}
		System.out.println("\n\nPulse 0 para volver al inicio.");
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		}
	}
}
