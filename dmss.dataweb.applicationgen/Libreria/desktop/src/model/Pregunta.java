package model;
import java.util.List;
import java.util.ArrayList;

public class Pregunta {
	private String enunciado;
	private TipoPregunta tipo;
	private String respuestaCorrecta;
	private List<String> opciones;

	public Pregunta(String enunciado, TipoPregunta tipo, String respuestaCorrecta){
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.respuestaCorrecta = respuestaCorrecta;
		this.opciones = new ArrayList<>();
	}
	
	public String getEnunciado(){
		return this.enunciado;
	}
	public void setEnunciado(String enunciado){
		this.enunciado = enunciado;
	}

	public TipoPregunta getTipo(){
		return this.tipo;
	}
	public void setTipo(TipoPregunta tipo){
		this.tipo = tipo;
	}

	public String getRespuestaCorrecta(){
		return this.respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String respuesta){
		this.respuestaCorrecta = respuesta;
	}

	public List<String> getOpciones(){
		return this.opciones;
	}
	public void setOpciones(List<String> opc){
		this.opciones = opc;
	}
	public void addOpcion(String opc){
		this.opciones.add(opc);
	}

}
