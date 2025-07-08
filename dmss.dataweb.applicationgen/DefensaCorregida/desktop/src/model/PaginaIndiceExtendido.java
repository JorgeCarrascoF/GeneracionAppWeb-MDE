package model;
import java.util.List;
import java.util.ArrayList;

public class PaginaIndiceExtendido extends PaginaIndice {
	private int instanciasPorPagina;
	private List<Atributo> filtro;
	

	public PaginaIndiceExtendido(String id, String nombre, int instanciasPorPagina){
		super(id, nombre);
		this.instanciasPorPagina = instanciasPorPagina;
		this.filtro = new ArrayList<>();
	}

	public int getInstanciasPorPagina(){
		return instanciasPorPagina;
	}
	public void setInstanciasPorPagina(int i){
		this.instanciasPorPagina = i;
	}

	public List<Atributo> getAtributosFiltro(){
		return this.filtro;
	}
	public void setAtributosFiltro(List<Atributo> filtro){
		this.filtro = filtro;
	}
	public void addAtributoFiltro(Atributo att){
		this.filtro.add(att);
	}

	@Override
	public void mostrar(){
		System.out.println("Entidades de tipo " + this.entidad.getNombreEntidad() + " que hay en el sistema:");
		System.out.print("Filtrando por: ");

		for(int i = 0; i < filtro.size(); i++){
			System.out.print(filtro.get(i).getNombre() + "    ");
		}
		System.out.println();

		System.out.print("ID    ");
		for(int i = 0; i < this.getAtributos().size(); i++){
			System.out.print(this.getAtributos().get(i).getNombre() + "    ");
			
		}
		System.out.println();
		for(int i = 1; i <= instanciasPorPagina; i++){
			for(int j = 0; j <= this.getAtributos().size(); j++)	{
				if(j == 0){
					System.out.print(i+"."+ this.entidad.getNombreEntidad() +"-0" + i);
				} else {
					System.out.print("    " + this.getAtributos().get(j-1).getNombre() + "-0" + i);
				}
			}
			System.out.println();
		}
		
		System.out.println("\n\n Elija una para ver los detalles de la entidad.");
		System.out.println("Pulse A o D para navegar por las pÃ¡ginas");
		System.out.println("Pulse 0 para volver al inicio.");
	}
}
