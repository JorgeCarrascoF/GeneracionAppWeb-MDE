package main;

import java.util.Scanner;
import model.*;

public class App {
	public static boolean navegando;
	public static void main(String[] args){
		Aplicacion app = Aplicacion.getInstancia();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a " + app.getNombreApp());
		int input;
		navegando = true;
		createDataFromModel(app);
		app.navegarAInicio();
		while(navegando){
			app.mostrar();
			input = sc.nextInt();
			app.procesarInput(input);
		}
		System.out.println("Adios!");
		sc.close();
	}

	private static void createDataFromModel(Aplicacion app){
		// Lista de entidades de la aplicacion
					Entidad entidad1 = new Entidad("paciente", "Paciente");
					app.addEntidad(entidad1);
								Atributo atributoentidad11 = new Atributo("nombre", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad11);
								Atributo atributoentidad12 = new Atributo("edad", TipoDato.INTEGER);
								entidad1.addAtributo(atributoentidad12);
								Atributo atributoentidad13 = new Atributo("fechaIngreso", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad13);
								Atributo atributoentidad14 = new Atributo("enTratamiento", TipoDato.BOOLEAN);
								entidad1.addAtributo(atributoentidad14);
					Entidad entidad2 = new Entidad("medico", "Medico");
					app.addEntidad(entidad2);
								Atributo atributoentidad21 = new Atributo("nombre", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad21);
								Atributo atributoentidad22 = new Atributo("fechaIngreso", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad22);
								Atributo atributoentidad23 = new Atributo("nomina", TipoDato.INTEGER);
								entidad2.addAtributo(atributoentidad23);

		// Se incluyen las referencias entre entidades
				Entidad paciente = app.getEntidadPorId("paciente");					
						paciente.addReferencia(app.getEntidadPorId("medico"));
				Entidad medico = app.getEntidadPorId("medico");					

		// Lista de RRSS de la aplicacion
				EnlaceRRSS enlace1 = new EnlaceRRSS("Cómo leer un prospecto", "https://www.salud.mapfre.es/enfermedades/reportajes-enfermedades/prospecto-de-un-medicamento-como-entenderlo/");
				app.addEnlaceRRSS(enlace1);
		

		// Lista de paginas de la aplicacion
						PaginaIndice pagina1 = new PaginaIndice("crud_pacienteIndice", "PaginaCRUDPaciente");
								Entidad entidadpagina1 = app.getEntidadPorId("paciente");
									pagina1.addAtributo(entidadpagina1.getAtributoPorNombre("nombre"));
									pagina1.addAtributo(entidadpagina1.getAtributoPorNombre("edad"));
									pagina1.addAtributo(entidadpagina1.getAtributoPorNombre("fechaIngreso"));
									pagina1.addAtributo(entidadpagina1.getAtributoPorNombre("enTratamiento"));
						pagina1.setEntidad(app.getEntidadPorId("paciente"));

						PaginaDetalle pagina1Detalle = new PaginaDetalle("crud_pacienteDetalle", "PaginaCRUDPaciente");
						pagina1.setEntidad(app.getEntidadPorId("paciente"));
						app.addPagina(pagina1Detalle);

						PaginaCreacion pagina1Creacion = new PaginaCreacion("crud_pacienteCreacion", "PaginaCRUDPaciente");
						pagina1.setEntidad(app.getEntidadPorId("paciente"));
						app.addPagina(pagina1Creacion);

						PaginaActualizacion pagina1Actualizacion = new PaginaActualizacion("crud_pacienteActualizacion", "PaginaCRUDPaciente");
						pagina1.setEntidad(app.getEntidadPorId("paciente"));
						app.addPagina(pagina1Actualizacion);

						PaginaBorrado pagina1Borrado = new PaginaBorrado("crud_pacienteBorrado", "PaginaCRUDPaciente");
						pagina1.setEntidad(app.getEntidadPorId("paciente"));
						app.addPagina(pagina1Borrado);


					app.addPagina(pagina1);
								PaginaIndice pagina2 = new PaginaIndice("indice_medicos", "Ver medicos");

							pagina2.setEntidad(app.getEntidadPorId("medico"));
						
								Entidad entidadpagina2 = app.getEntidadPorId("medico");
									pagina2.addAtributo(entidadpagina2.getAtributoPorNombre("nombre"));
									pagina2.addAtributo(entidadpagina2.getAtributoPorNombre("fechaIngreso"));
											

						pagina2.addPaginaExterna("https://saludextremadura.ses.es/web/");
					app.addPagina(pagina2);
								PaginaDetalle pagina3 = new PaginaDetalle("ver_medico", "Ver medico");

							pagina3.setEntidad(app.getEntidadPorId("medico"));
						
											

					app.addPagina(pagina3);
						// Pagina de inicio
						PaginaInicio pagina4 = new PaginaInicio("inicio", "Pagina Inicio del Hospital");
						

						pagina4.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://www.salud.mapfre.es/enfermedades/reportajes-enfermedades/prospecto-de-un-medicamento-como-entenderlo/"));
					app.addPagina(pagina4);
							PaginaEncuestaCuestionario pagina5 = new PaginaEncuestaCuestionario("encuesta_satisfaccion", "Encuesta de satisfaccion del usuario", false);
										Pregunta pregunta1pagina5 = new Pregunta("¿Ha sido atendido en las ultimas 24h por nuestro hospital?", TipoPregunta.VERDADERO_FALSO, "");
										pagina5.addPregunta(pregunta1pagina5);
										Pregunta pregunta2pagina5 = new Pregunta("Del 1 al 10, ¿cuál es su nivel de satisfacción?", TipoPregunta.RESPUESTA_CORTA, "");
											pregunta2pagina5.addOpcion("1-3");
											pregunta2pagina5.addOpcion("4-6");
											pregunta2pagina5.addOpcion("7-10");
										pagina5.addPregunta(pregunta2pagina5);
										Pregunta pregunta3pagina5 = new Pregunta("Por favor, deje algún comentario de mejora:", TipoPregunta.RESPUESTA_CORTA, "");
										pagina5.addPregunta(pregunta3pagina5);

														

						pagina5.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://www.salud.mapfre.es/enfermedades/reportajes-enfermedades/prospecto-de-un-medicamento-como-entenderlo/"));
					app.addPagina(pagina5);
							PaginaEncuestaCuestionario pagina6 = new PaginaEncuestaCuestionario("cuestionario_medico", "Cuestionario sobre medicamentos", true);
										Pregunta pregunta1pagina6 = new Pregunta("¿Los antibióticos son efectivos contra infecciones virales?", TipoPregunta.VERDADERO_FALSO, "Falso");
										pagina6.addPregunta(pregunta1pagina6);
										Pregunta pregunta2pagina6 = new Pregunta("¿Cuál de los siguientes medicamentos es un analgésico?", TipoPregunta.SELECCION, "Ibuprofeno");
											pregunta2pagina6.addOpcion("Amoxicilina");
											pregunta2pagina6.addOpcion("Omeprazol");
											pregunta2pagina6.addOpcion("Ibuprofeno");
										pagina6.addPregunta(pregunta2pagina6);
										Pregunta pregunta3pagina6 = new Pregunta("¿Cuál es el nombre genérico del Advil?", TipoPregunta.RESPUESTA_CORTA, "Ibuprofeno");
										pagina6.addPregunta(pregunta3pagina6);

														

						pagina6.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://www.salud.mapfre.es/enfermedades/reportajes-enfermedades/prospecto-de-un-medicamento-como-entenderlo/"));
					app.addPagina(pagina6);
						PaginaResultados pagina7 = new PaginaResultados("resultado_cuestionario", "Resultados del cuestionario medico");

						pagina7.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://www.salud.mapfre.es/enfermedades/reportajes-enfermedades/prospecto-de-un-medicamento-como-entenderlo/"));
					app.addPagina(pagina7);
						PaginaResultados pagina8 = new PaginaResultados("resultados_encuesta", "Resultados encuesta satisfaccion");

					app.addPagina(pagina8);

		// Se incluyen las conexiones entre las paginas
				PaginaDetalle ver_medico = (PaginaDetalle) app.getPaginaPorId("ver_medico");
					ver_medico.addPagina(app.getPaginaPorId("indice_medicos"));		
				PaginaEncuestaCuestionario encuesta_satisfaccion = (PaginaEncuestaCuestionario) app.getPaginaPorId("encuesta_satisfaccion");
					encuesta_satisfaccion.setPaginaResultados(app.getPaginaPorId("resultados_encuesta"));
				PaginaEncuestaCuestionario cuestionario_medico = (PaginaEncuestaCuestionario) app.getPaginaPorId("cuestionario_medico");
					cuestionario_medico.setPaginaResultados(app.getPaginaPorId("resultado_cuestionario"));
				PaginaResultados resultado_cuestionario = (PaginaResultados) app.getPaginaPorId("resultado_cuestionario");
					resultado_cuestionario.setPaginaCuestionario(app.getPaginaPorId("cuestionario_medico"));
	
				PaginaResultados resultados_encuesta = (PaginaResultados) app.getPaginaPorId("resultados_encuesta");
					resultados_encuesta.setPaginaCuestionario(app.getPaginaPorId("encuesta_satisfaccion"));
	

		// Se incluye en cada entidad las paginas que tiene
				paciente.addPagina(app.getPaginaPorId("crud_paciente"));
				medico.addPagina(app.getPaginaPorId("ver_medico"));
				medico.addPagina(app.getPaginaPorId("indice_medicos"));

		// Roles de la aplicacion
		// El rol de Administrador se crea siempre
		
		Rol admin = new Rol("Administrador");
			admin.addPagina(app.getPaginaPorId("crud_paciente"));
			admin.addPagina(app.getPaginaPorId("indice_medicos"));
			admin.addPagina(app.getPaginaPorId("ver_medico"));
			admin.addPagina(app.getPaginaPorId("inicio"));
			admin.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			admin.addPagina(app.getPaginaPorId("cuestionario_medico"));
			admin.addPagina(app.getPaginaPorId("resultado_cuestionario"));
			admin.addPagina(app.getPaginaPorId("resultados_encuesta"));
		
				Rol rol1 = new Rol("Invitado"); 	
				app.addRol(rol1);	
					rol1.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
					rol1.addPagina(app.getPaginaPorId("cuestionario_medico"));
				Rol rol2 = new Rol("Medico"); 	
				app.addRol(rol2);	

		// Creamos una pagina para cada rol
		PaginaRol pag_admin = new PaginaRol("pag_admin", "Administrador");
			pag_admin.addPagina(app.getPaginaPorId("crud_paciente"));
			pag_admin.addPagina(app.getPaginaPorId("indice_medicos"));
			pag_admin.addPagina(app.getPaginaPorId("ver_medico"));
			pag_admin.addPagina(app.getPaginaPorId("inicio"));
			pag_admin.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			pag_admin.addPagina(app.getPaginaPorId("cuestionario_medico"));
			pag_admin.addPagina(app.getPaginaPorId("resultado_cuestionario"));
			pag_admin.addPagina(app.getPaginaPorId("resultados_encuesta"));
		app.getPaginaPorId("inicio").addPagina(pag_admin);
		app.addPagina(pag_admin);

			PaginaRol pag_Invitado = new PaginaRol("pag_Invitado", "Invitado");
			pag_Invitado.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			pag_Invitado.addPagina(app.getPaginaPorId("cuestionario_medico"));
			app.getPaginaPorId("inicio").addPagina(pag_Invitado);
			app.addPagina(pag_Invitado);
			PaginaRol pag_Medico = new PaginaRol("pag_Medico", "Medico");
			app.getPaginaPorId("inicio").addPagina(pag_Medico);
			app.addPagina(pag_Medico);

	}
}
