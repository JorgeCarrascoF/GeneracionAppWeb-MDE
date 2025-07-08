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
					Entidad entidad1 = new Entidad("entidad_libro", "Libro");
					app.addEntidad(entidad1);
								Atributo atributoentidad11 = new Atributo("Nombre", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad11);
								Atributo atributoentidad12 = new Atributo("Fecha", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad12);
					Entidad entidad2 = new Entidad("entidad_autor", "Autor");
					app.addEntidad(entidad2);
								Atributo atributoentidad21 = new Atributo("nombreCompleto", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad21);
								Atributo atributoentidad22 = new Atributo("FechaNacimiento", TipoDato.INTEGER);
								entidad2.addAtributo(atributoentidad22);

		// Se incluyen las referencias entre entidades
				Entidad entidad_libro = app.getEntidadPorId("entidad_libro");					
						entidad_libro.addReferencia(app.getEntidadPorId("entidad_autor"));
				Entidad entidad_autor = app.getEntidadPorId("entidad_autor");					

		// Lista de RRSS de la aplicacion
				EnlaceRRSS enlace1 = new EnlaceRRSS("Twitter", "www.twitter.com");
				app.addEnlaceRRSS(enlace1);
		

		// Lista de paginas de la aplicacion
						// Pagina de inicio
						PaginaInicio pagina1 = new PaginaInicio("home", "Página principal");
						

					app.addPagina(pagina1);
								PaginaIndiceExtendido pagina2 = new PaginaIndiceExtendido("ver_autores_nombre", "Ver autores por nombre", 3);

							pagina2.setEntidad(app.getEntidadPorId("entidad_autor"));
						
								Entidad entidadpagina2 = app.getEntidadPorId("entidad_autor");
									pagina2.addAtributo(entidadpagina2.getAtributoPorNombre("nombreCompleto"));
									pagina2.addAtributo(entidadpagina2.getAtributoPorNombre("FechaNacimiento"));

									Entidad entidadFiltropagina2 = app.getEntidadPorId("entidad_autor");
										pagina2.addAtributoFiltro(entidadFiltropagina2.getAtributoPorNombre("nombreCompleto"));
											

					app.addPagina(pagina2);
							PaginaEncuestaCuestionario pagina3 = new PaginaEncuestaCuestionario("cuestionario_1", "Cuestionario 1", true);
										Pregunta pregunta1pagina3 = new Pregunta("¿Cuál de las siguientes opciones NO es un lenguaje de programación?", TipoPregunta.SELECCION, "HTML");
											pregunta1pagina3.addOpcion("Python");
											pregunta1pagina3.addOpcion("HTML");
											pregunta1pagina3.addOpcion("Java");
											pregunta1pagina3.addOpcion("C++");
										pagina3.addPregunta(pregunta1pagina3);
										Pregunta pregunta2pagina3 = new Pregunta("El sistema binario utiliza los dígitos 1 y 2.", TipoPregunta.VERDADERO_FALSO, "Falso");
										pagina3.addPregunta(pregunta2pagina3);
										Pregunta pregunta3pagina3 = new Pregunta("¿Qué término se usa para describir un error en el código de un programa?", TipoPregunta.RESPUESTA_CORTA, "Un bug");
										pagina3.addPregunta(pregunta3pagina3);

														

					app.addPagina(pagina3);
								PaginaCreacion pagina4 = new PaginaCreacion("crear_libro", "Crear libro");

							pagina4.setEntidad(app.getEntidadPorId("entidad_libro"));
						
											

					app.addPagina(pagina4);
								PaginaDetalle pagina5 = new PaginaDetalle("ver_autor", "Autor");

							pagina5.setEntidad(app.getEntidadPorId("entidad_autor"));
						
											

						pagina5.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
					app.addPagina(pagina5);
								PaginaIndice pagina6 = new PaginaIndice("ver_autores", "Autores");

							pagina6.setEntidad(app.getEntidadPorId("entidad_autor"));
						
								Entidad entidadpagina6 = app.getEntidadPorId("entidad_autor");
									pagina6.addAtributo(entidadpagina6.getAtributoPorNombre("nombreCompleto"));
									pagina6.addAtributo(entidadpagina6.getAtributoPorNombre("FechaNacimiento"));
											

					app.addPagina(pagina6);
								PaginaIndiceDetalle pagina7 = new PaginaIndiceDetalle("ver_autores_detalle", "Ver autores con detalle");

							pagina7.setEntidad(app.getEntidadPorId("entidad_autor"));
						
								Entidad entidadpagina7 = app.getEntidadPorId("entidad_autor");
									pagina7.addAtributo(entidadpagina7.getAtributoPorNombre("nombreCompleto"));
											

					app.addPagina(pagina7);
						PaginaResultados pagina8 = new PaginaResultados("resultados_cuestionario_1", "Resultados cuestionario 1");

					app.addPagina(pagina8);
							PaginaEncuestaCuestionario pagina9 = new PaginaEncuestaCuestionario("encuesta_1", "Encuesta1", false);
										Pregunta pregunta1pagina9 = new Pregunta("¿Vives en cáceres?", TipoPregunta.VERDADERO_FALSO, "Verdadero");
										pagina9.addPregunta(pregunta1pagina9);
										Pregunta pregunta2pagina9 = new Pregunta("¿Cómo vives?", TipoPregunta.SELECCION, "Bien");
											pregunta2pagina9.addOpcion("Bien");
											pregunta2pagina9.addOpcion("Mal");
										pagina9.addPregunta(pregunta2pagina9);
										Pregunta pregunta3pagina9 = new Pregunta("¿Dónde vives?", TipoPregunta.RESPUESTA_CORTA, "A");
										pagina9.addPregunta(pregunta3pagina9);

														

					app.addPagina(pagina9);
						PaginaResultados pagina10 = new PaginaResultados("resultados_cuestionario_2", "Resultados2");

					app.addPagina(pagina10);

		// Se incluyen las conexiones entre las paginas
				PaginaIndiceExtendido ver_autores_nombre = (PaginaIndiceExtendido) app.getPaginaPorId("ver_autores_nombre");
					ver_autores_nombre.addPagina(app.getPaginaPorId("ver_autores"));		
				PaginaEncuestaCuestionario cuestionario_1 = (PaginaEncuestaCuestionario) app.getPaginaPorId("cuestionario_1");
					cuestionario_1.setPaginaResultados(app.getPaginaPorId("resultados_cuestionario_1"));
				PaginaDetalle ver_autor = (PaginaDetalle) app.getPaginaPorId("ver_autor");
					ver_autor.addPagina(app.getPaginaPorId("ver_autores"));		
				PaginaIndiceDetalle ver_autores_detalle = (PaginaIndiceDetalle) app.getPaginaPorId("ver_autores_detalle");
					ver_autores_detalle.addPagina(app.getPaginaPorId("ver_autores"));		
				PaginaResultados resultados_cuestionario_1 = (PaginaResultados) app.getPaginaPorId("resultados_cuestionario_1");
					resultados_cuestionario_1.setPaginaCuestionario(app.getPaginaPorId("cuestionario_1"));
	
				PaginaEncuestaCuestionario encuesta_1 = (PaginaEncuestaCuestionario) app.getPaginaPorId("encuesta_1");
					encuesta_1.setPaginaResultados(app.getPaginaPorId("resultados_cuestionario_2"));
				PaginaResultados resultados_cuestionario_2 = (PaginaResultados) app.getPaginaPorId("resultados_cuestionario_2");
					resultados_cuestionario_2.setPaginaCuestionario(app.getPaginaPorId("encuesta_1"));
	

		// Se incluye en cada entidad las paginas que tiene
				entidad_libro.addPagina(app.getPaginaPorId("crear_libro"));
				entidad_autor.addPagina(app.getPaginaPorId("ver_autor"));
				entidad_autor.addPagina(app.getPaginaPorId("ver_autores"));
				entidad_autor.addPagina(app.getPaginaPorId("ver_autores_nombre"));
				entidad_autor.addPagina(app.getPaginaPorId("ver_autores_detalle"));

		// Roles de la aplicacion
		// El rol de Administrador se crea siempre
		
		Rol admin = new Rol("Administrador");
			admin.addPagina(app.getPaginaPorId("home"));
			admin.addPagina(app.getPaginaPorId("ver_autores_nombre"));
			admin.addPagina(app.getPaginaPorId("cuestionario_1"));
			admin.addPagina(app.getPaginaPorId("crear_libro"));
			admin.addPagina(app.getPaginaPorId("ver_autor"));
			admin.addPagina(app.getPaginaPorId("ver_autores"));
			admin.addPagina(app.getPaginaPorId("ver_autores_detalle"));
			admin.addPagina(app.getPaginaPorId("resultados_cuestionario_1"));
			admin.addPagina(app.getPaginaPorId("encuesta_1"));
			admin.addPagina(app.getPaginaPorId("resultados_cuestionario_2"));
		
				Rol rol1 = new Rol("UsuarioNormal"); 	
				app.addRol(rol1);	
					rol1.addPagina(app.getPaginaPorId("cuestionario_1"));

		// Creamos una pagina para cada rol
		PaginaRol pag_admin = new PaginaRol("pag_admin", "Administrador");
			pag_admin.addPagina(app.getPaginaPorId("home"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autores_nombre"));
			pag_admin.addPagina(app.getPaginaPorId("cuestionario_1"));
			pag_admin.addPagina(app.getPaginaPorId("crear_libro"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autor"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autores"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autores_detalle"));
			pag_admin.addPagina(app.getPaginaPorId("resultados_cuestionario_1"));
			pag_admin.addPagina(app.getPaginaPorId("encuesta_1"));
			pag_admin.addPagina(app.getPaginaPorId("resultados_cuestionario_2"));
		app.getPaginaPorId("home").addPagina(pag_admin);
		app.addPagina(pag_admin);

			PaginaRol pag_UsuarioNormal = new PaginaRol("pag_UsuarioNormal", "UsuarioNormal");
			pag_UsuarioNormal.addPagina(app.getPaginaPorId("cuestionario_1"));
			app.getPaginaPorId("home").addPagina(pag_UsuarioNormal);
			app.addPagina(pag_UsuarioNormal);

	}
}
