package model;

public class PaginaResultados extends Pagina {
	private Pagina paginaCuestionario;

	public PaginaResultados(String id, String nombre){
		super(id, nombre);
	}

	public Pagina getPaginaCuestionario(){
		return this.paginaCuestionario;
	}
	public void setPaginaCuestionario(Pagina pag){
		this.paginaCuestionario = pag;
	}

	
	@Override
	public void mostrar(){
		System.out.println(this.getNombre());
		System.out.println("Preguntas y respuestas");
		PaginaEncuestaCuestionario cuestionario = (PaginaEncuestaCuestionario) paginaCuestionario;
		for(int i = 0; i < cuestionario.getPreguntas().size(); i++){
			Pregunta p = cuestionario.getPreguntas().get(i);
			System.out.println(i + ". " + p.getEnunciado());
			System.out.println(p.getRespuestaCorrecta());
		}

		System.out.println("\n\n Pulse 1 para volver al cuestionario");
		System.out.println("\n\n Pulse 0 para volver al inicio");
	}
	@Override
	public void procesarInput(int input){
		if(input == 0){
			Aplicacion.getInstancia().navegarAInicio();
		} else if(input == 1){
			Aplicacion.getInstancia().navegarA(this.paginaCuestionario.getIdPagina());
		}
	}
}
