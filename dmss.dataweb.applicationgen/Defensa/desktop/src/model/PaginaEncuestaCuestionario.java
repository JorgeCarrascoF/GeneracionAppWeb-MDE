package model;
import java.util.List;
import java.util.ArrayList;

public class PaginaEncuestaCuestionario extends Pagina {
	private boolean esCuestionario;	
	private List<Pregunta> preguntas;
	private Pagina paginaResultados;

	public PaginaEncuestaCuestionario(String id, String nombre, boolean esCuestionario){
		super(id, nombre);
		this.esCuestionario = esCuestionario;
		this.preguntas = new ArrayList<>();
	}

	public boolean getEsCuestionario(){
		return this.esCuestionario;
	}
	public void setEsCuestionario(boolean esCuestionario){
		this.esCuestionario = esCuestionario;
	}

	public Pagina getPaginaResultados(){
		return this.paginaResultados;
	}
	public void setPaginaResultados(Pagina pag){
		this.paginaResultados = pag;
	}

	public List<Pregunta> getPreguntas(){
		return this.preguntas;
	}
	public void setPreguntas(List<Pregunta> preguntas){
		this.preguntas = preguntas;
	}
	public void addPregunta(Pregunta pre){
		this.preguntas.add(pre);
	}
	
	@Override
	public void mostrar(){
		String titulo = esCuestionario ? "Cuestionario " : "Encuesta ";
		System.out.println(titulo.concat(this.getNombre()));
		System.out.println("Preguntas a responder: ");	
		for(int i = 0; i < this.preguntas.size(); i++){
			Pregunta p = this.preguntas.get(i);
			System.out.print(i + ". " + p.getEnunciado());
			TipoPregunta tipo = p.getTipo();
			System.out.print("    ");
			if( tipo == TipoPregunta.VERDADERO_FALSO){
				System.out.println(" [V/F]");
			} else if (tipo == TipoPregunta.SELECCION) {
				for(int j = 0; j < p.getOpciones().size(); j++){
					if(j != 0){
						System.out.print(", ");
					}
					System.out.print(p.getOpciones().get(j));
				}
				System.out.println();
			} else {
				System.out.println("Introduzca una respuesta corta.");	
			}
		}

		System.out.println("\n\n Pulse 1 para introducir las respuestas");
		if(esCuestionario){
			System.out.println("Pulse 2 para ver la pÃ¡gina de resultados.");
		}
		System.out.println("\n\n Pulse 0 para volver al inicio");
	}
	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else if(input == 1){
			System.out.println("Â¡Gracias por responder a las preguntas!");
		} else if(input == 2 && this.esCuestionario){
			Aplicacion.getInstancia().navegarA(this.paginaResultados.getIdPagina());
		}
	}
}
