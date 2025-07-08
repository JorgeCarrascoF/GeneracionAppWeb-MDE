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
					Entidad entidad1 = new Entidad("libro", "Libro");
					app.addEntidad(entidad1);
								Atributo atributoentidad11 = new Atributo("ISBN", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad11);
								Atributo atributoentidad12 = new Atributo("FechaSalida", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad12);
								Atributo atributoentidad13 = new Atributo("copias", TipoDato.INTEGER);
								entidad1.addAtributo(atributoentidad13);
								Atributo atributoentidad14 = new Atributo("titulo", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad14);
					Entidad entidad2 = new Entidad("autor", "Autor");
					app.addEntidad(entidad2);
								Atributo atributoentidad21 = new Atributo("nombre", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad21);
								Atributo atributoentidad22 = new Atributo("localidad", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad22);

		// Se incluyen las referencias entre entidades
				Entidad libro = app.getEntidadPorId("libro");					
						libro.addReferencia(app.getEntidadPorId("autor"));
				Entidad autor = app.getEntidadPorId("autor");					

		// Lista de RRSS de la aplicacion
				EnlaceRRSS enlace1 = new EnlaceRRSS("Twitter de la biblioteca", "www.twitter.com");
				app.addEnlaceRRSS(enlace1);
		

		// Lista de paginas de la aplicacion
								PaginaDetalle pagina1 = new PaginaDetalle("ver_libro", "Ver libro");

							pagina1.setEntidad(app.getEntidadPorId("libro"));
						
											

						pagina1.addPaginaExterna("www.casadellibro.com");
						pagina1.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
					app.addPagina(pagina1);
								PaginaBorrado pagina2 = new PaginaBorrado("borrar_libro", "Borrar Libro");

							pagina2.setEntidad(app.getEntidadPorId("libro"));
						
											

					app.addPagina(pagina2);
								PaginaCreacion pagina3 = new PaginaCreacion("crear_libro", "Crear libro");

							pagina3.setEntidad(app.getEntidadPorId("libro"));
						
											

					app.addPagina(pagina3);
								PaginaIndice pagina4 = new PaginaIndice("ver_autores", "Ver autores");

							pagina4.setEntidad(app.getEntidadPorId("autor"));
						
								Entidad entidadpagina4 = app.getEntidadPorId("autor");
											

					app.addPagina(pagina4);
								PaginaIndiceExtendido pagina5 = new PaginaIndiceExtendido("ver_ultimos_libros", "Ver ultimos libros de la biblioteca", 5);

							pagina5.setEntidad(app.getEntidadPorId("libro"));
						
								Entidad entidadpagina5 = app.getEntidadPorId("libro");
									pagina5.addAtributo(entidadpagina5.getAtributoPorNombre("titulo"));
									pagina5.addAtributo(entidadpagina5.getAtributoPorNombre("FechaSalida"));

									Entidad entidadFiltropagina5 = app.getEntidadPorId("libro");
										pagina5.addAtributoFiltro(entidadFiltropagina5.getAtributoPorNombre("FechaSalida"));
											

					app.addPagina(pagina5);
								PaginaIndiceDetalle pagina6 = new PaginaIndiceDetalle("ver_autores_en_detalle", "Ver autores en detalle");

							pagina6.setEntidad(app.getEntidadPorId("autor"));
						
								Entidad entidadpagina6 = app.getEntidadPorId("autor");
									pagina6.addAtributo(entidadpagina6.getAtributoPorNombre("nombre"));
									pagina6.addAtributo(entidadpagina6.getAtributoPorNombre("localidad"));
											

					app.addPagina(pagina6);
								PaginaDetalle pagina7 = new PaginaDetalle("ver_autor", "Ver autor");

							pagina7.setEntidad(app.getEntidadPorId("autor"));
						
											

						pagina7.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
					app.addPagina(pagina7);
						// Pagina de inicio
						PaginaInicio pagina8 = new PaginaInicio("pagina_inicio", "Inicio");
						

						pagina8.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
					app.addPagina(pagina8);
							PaginaEncuestaCuestionario pagina9 = new PaginaEncuestaCuestionario("encuesta_satisfaccion", "Encuesta de satisfacción", false);
										Pregunta pregunta1pagina9 = new Pregunta("¿Qué libros has sacado de la biblioteca en los últimos días?", TipoPregunta.RESPUESTA_CORTA, "");
										pagina9.addPregunta(pregunta1pagina9);
										Pregunta pregunta2pagina9 = new Pregunta("¿Cuál es tu género de libros más leído?", TipoPregunta.SELECCION, "");
											pregunta2pagina9.addOpcion("Ciencia Ficcion");
											pregunta2pagina9.addOpcion("Historia");
											pregunta2pagina9.addOpcion("Programacion");
										pagina9.addPregunta(pregunta2pagina9);
										Pregunta pregunta3pagina9 = new Pregunta("¿Das permiso a la biblioteca para mandarte emails con nuevas adquisiciones?", TipoPregunta.VERDADERO_FALSO, "");
										pagina9.addPregunta(pregunta3pagina9);

														

					app.addPagina(pagina9);
						PaginaResultados pagina10 = new PaginaResultados("resultados_simulacro_examen", "Resultados del simulacro de examen");

					app.addPagina(pagina10);
							PaginaEncuestaCuestionario pagina11 = new PaginaEncuestaCuestionario("simulacro_examen", "Simulacro Examen de Programacion", true);
										Pregunta pregunta1pagina11 = new Pregunta("¿Qué tipo utilizarias para almacenar la edad de una persona?", TipoPregunta.SELECCION, "Integer");
											pregunta1pagina11.addOpcion("Integer");
											pregunta1pagina11.addOpcion("Boolean");
											pregunta1pagina11.addOpcion("String");
											pregunta1pagina11.addOpcion("Date");
										pagina11.addPregunta(pregunta1pagina11);
										Pregunta pregunta2pagina11 = new Pregunta("¿Qué palabra reservada en Java se utiliza para heredar de una clase?", TipoPregunta.RESPUESTA_CORTA, "extends");
										pagina11.addPregunta(pregunta2pagina11);
										Pregunta pregunta3pagina11 = new Pregunta("¿las listas en Python son estructuras inmutables?", TipoPregunta.VERDADERO_FALSO, "falso");
										pagina11.addPregunta(pregunta3pagina11);

														

					app.addPagina(pagina11);
						PaginaResultados pagina12 = new PaginaResultados("resultados_encuesta_satisfaccion", "Resultados de la encuesta de satisfaccion");

					app.addPagina(pagina12);

		// Se incluyen las conexiones entre las paginas
				PaginaDetalle ver_libro = (PaginaDetalle) app.getPaginaPorId("ver_libro");
					ver_libro.addPagina(app.getPaginaPorId("ver_ultimos_libros"));		
					ver_libro.addPagina(app.getPaginaPorId("ver_autor"));		
				PaginaIndiceDetalle ver_autores_en_detalle = (PaginaIndiceDetalle) app.getPaginaPorId("ver_autores_en_detalle");
					ver_autores_en_detalle.addPagina(app.getPaginaPorId("ver_autores"));		
				PaginaEncuestaCuestionario encuesta_satisfaccion = (PaginaEncuestaCuestionario) app.getPaginaPorId("encuesta_satisfaccion");
					encuesta_satisfaccion.setPaginaResultados(app.getPaginaPorId("invalid"));
				PaginaResultados resultados_simulacro_examen = (PaginaResultados) app.getPaginaPorId("resultados_simulacro_examen");
					resultados_simulacro_examen.setPaginaCuestionario(app.getPaginaPorId("simulacro_examen"));
	
				PaginaEncuestaCuestionario simulacro_examen = (PaginaEncuestaCuestionario) app.getPaginaPorId("simulacro_examen");
					simulacro_examen.addPagina(app.getPaginaPorId("pagina_inicio"));		
					simulacro_examen.setPaginaResultados(app.getPaginaPorId("invalid"));
				PaginaResultados resultados_encuesta_satisfaccion = (PaginaResultados) app.getPaginaPorId("resultados_encuesta_satisfaccion");
					resultados_encuesta_satisfaccion.setPaginaCuestionario(app.getPaginaPorId("encuesta_satisfaccion"));
	

		// Se incluye en cada entidad las paginas que tiene
				libro.addPagina(app.getPaginaPorId("ver_libro"));
				libro.addPagina(app.getPaginaPorId("borrar_libro"));
				libro.addPagina(app.getPaginaPorId("crear_libro"));
				libro.addPagina(app.getPaginaPorId("ver_ultimos_libros"));
				autor.addPagina(app.getPaginaPorId("ver_autores"));
				autor.addPagina(app.getPaginaPorId("ver_autores_en_detalle"));
				autor.addPagina(app.getPaginaPorId("ver_autor"));

		// Roles de la aplicacion
		// El rol de Administrador se crea siempre
		
		Rol admin = new Rol("Administrador");
			admin.addPagina(app.getPaginaPorId("ver_libro"));
			admin.addPagina(app.getPaginaPorId("borrar_libro"));
			admin.addPagina(app.getPaginaPorId("crear_libro"));
			admin.addPagina(app.getPaginaPorId("ver_autores"));
			admin.addPagina(app.getPaginaPorId("ver_ultimos_libros"));
			admin.addPagina(app.getPaginaPorId("ver_autores_en_detalle"));
			admin.addPagina(app.getPaginaPorId("ver_autor"));
			admin.addPagina(app.getPaginaPorId("pagina_inicio"));
			admin.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			admin.addPagina(app.getPaginaPorId("resultados_simulacro_examen"));
			admin.addPagina(app.getPaginaPorId("simulacro_examen"));
			admin.addPagina(app.getPaginaPorId("resultados_encuesta_satisfaccion"));
		
				Rol rol1 = new Rol("Empleado"); 	
				app.addRol(rol1);	
					rol1.addPagina(app.getPaginaPorId("crear_libro"));
					rol1.addPagina(app.getPaginaPorId("borrar_libro"));
					rol1.addPagina(app.getPaginaPorId("ver_libro"));
				Rol rol2 = new Rol("Usuario"); 	
				app.addRol(rol2);	
					rol2.addPagina(app.getPaginaPorId("ver_ultimos_libros"));
					rol2.addPagina(app.getPaginaPorId("ver_libro"));
					rol2.addPagina(app.getPaginaPorId("ver_autores"));
					rol2.addPagina(app.getPaginaPorId("ver_autores_en_detalle"));
					rol2.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
					rol2.addPagina(app.getPaginaPorId("simulacro_examen"));

		// Creamos una pagina para cada rol
		PaginaRol pag_admin = new PaginaRol("pag_admin", "Administrador");
			pag_admin.addPagina(app.getPaginaPorId("ver_libro"));
			pag_admin.addPagina(app.getPaginaPorId("borrar_libro"));
			pag_admin.addPagina(app.getPaginaPorId("crear_libro"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autores"));
			pag_admin.addPagina(app.getPaginaPorId("ver_ultimos_libros"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autores_en_detalle"));
			pag_admin.addPagina(app.getPaginaPorId("ver_autor"));
			pag_admin.addPagina(app.getPaginaPorId("pagina_inicio"));
			pag_admin.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			pag_admin.addPagina(app.getPaginaPorId("resultados_simulacro_examen"));
			pag_admin.addPagina(app.getPaginaPorId("simulacro_examen"));
			pag_admin.addPagina(app.getPaginaPorId("resultados_encuesta_satisfaccion"));
		app.getPaginaPorId("pagina_inicio").addPagina(pag_admin);
		app.addPagina(pag_admin);

			PaginaRol pag_Empleado = new PaginaRol("pag_Empleado", "Empleado");
			pag_Empleado.addPagina(app.getPaginaPorId("crear_libro"));
			pag_Empleado.addPagina(app.getPaginaPorId("borrar_libro"));
			pag_Empleado.addPagina(app.getPaginaPorId("ver_libro"));
			app.getPaginaPorId("pagina_inicio").addPagina(pag_Empleado);
			app.addPagina(pag_Empleado);
			PaginaRol pag_Usuario = new PaginaRol("pag_Usuario", "Usuario");
			pag_Usuario.addPagina(app.getPaginaPorId("ver_ultimos_libros"));
			pag_Usuario.addPagina(app.getPaginaPorId("ver_libro"));
			pag_Usuario.addPagina(app.getPaginaPorId("ver_autores"));
			pag_Usuario.addPagina(app.getPaginaPorId("ver_autores_en_detalle"));
			pag_Usuario.addPagina(app.getPaginaPorId("encuesta_satisfaccion"));
			pag_Usuario.addPagina(app.getPaginaPorId("simulacro_examen"));
			app.getPaginaPorId("pagina_inicio").addPagina(pag_Usuario);
			app.addPagina(pag_Usuario);

	}
}
