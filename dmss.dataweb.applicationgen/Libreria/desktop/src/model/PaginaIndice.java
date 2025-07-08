package model;
import java.util.List;
import java.util.ArrayList;

public class PaginaIndice extends PaginaEntidad {
	private List<Atributo> atributosAMostrar;
	
	public PaginaIndice(String id, String nombre){
		super(id, nombre);
		this.atributosAMostrar = new ArrayList<>();
	}

	public List<Atributo> getAtributos(){
		return this.atributosAMostrar;
	}

	public void setAtributos(List<Atributo> list){
		this.atributosAMostrar = list;
	}

	public void addAtributo(Atributo att){
		this.atributosAMostrar.add(att);
	}
	
	@Override
	public void mostrar(){
		System.out.println("Entidades de tipo " + this.entidad.getNombreEntidad() + "que hay en el sistema:");
		System.out.print("ID    ");
		for(int i = 0; i < atributosAMostrar.size(); i++){
			System.out.print(atributosAMostrar.get(i).getNombre() + "    ");
			
		}
		System.out.println();
		for(int i = 1; i < 4; i++){
			for(int j = 0; j <= atributosAMostrar.size(); j++)	{
				if(j == 0){
					System.out.print(i+"."+ this.entidad.getNombreEntidad() +"-0" + i);
				} else {
					System.out.print("    " + atributosAMostrar.get(j-1).getNombre() + "-0" + i);
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\n Elija una para ver los detalles de la entidad.\nPulse 0 para volver al inicio.");
	}

	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else {
			PaginaDetalle pag = (PaginaDetalle) this.entidad.getPaginas().stream().filter(p -> p instanceof PaginaDetalle).findFirst().orElse(null);
			Aplicacion.getInstancia().navegarA(pag.getIdPagina());
		}
	}
}
