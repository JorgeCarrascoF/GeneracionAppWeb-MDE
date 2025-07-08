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
					Entidad entidad1 = new Entidad("Titulo", "Título");
					app.addEntidad(entidad1);
								Atributo atributoentidad11 = new Atributo("nombre", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad11);
								Atributo atributoentidad12 = new Atributo("créditos", TipoDato.INTEGER);
								entidad1.addAtributo(atributoentidad12);
								Atributo atributoentidad13 = new Atributo("campo_cientifico", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad13);
					Entidad entidad2 = new Entidad("Asignatura", "Asignatura");
					app.addEntidad(entidad2);
								Atributo atributoentidad21 = new Atributo("nombre", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad21);
								Atributo atributoentidad22 = new Atributo("semestre", TipoDato.INTEGER);
								entidad2.addAtributo(atributoentidad22);
								Atributo atributoentidad23 = new Atributo("obligatoria", TipoDato.BOOLEAN);
								entidad2.addAtributo(atributoentidad23);
					Entidad entidad3 = new Entidad("Alumno", "Alumno");
					app.addEntidad(entidad3);
								Atributo atributoentidad31 = new Atributo("nombre", TipoDato.STRING);
								entidad3.addAtributo(atributoentidad31);
								Atributo atributoentidad32 = new Atributo("edad", TipoDato.INTEGER);
								entidad3.addAtributo(atributoentidad32);
								Atributo atributoentidad33 = new Atributo("evaluacionContinua", TipoDato.BOOLEAN);
								entidad3.addAtributo(atributoentidad33);
					Entidad entidad4 = new Entidad("Matricula", "Matricula");
					app.addEntidad(entidad4);

		// Se incluyen las referencias entre entidades
				Entidad titulo = app.getEntidadPorId("Titulo");					
				Entidad asignatura = app.getEntidadPorId("Asignatura");					
						asignatura.addReferencia(app.getEntidadPorId("Titulo"));
				Entidad alumno = app.getEntidadPorId("Alumno");					
				Entidad matricula = app.getEntidadPorId("Matricula");					
						matricula.addReferencia(app.getEntidadPorId("Asignatura"));
						matricula.addReferencia(app.getEntidadPorId("Alumno"));

		// Lista de RRSS de la aplicacion
				EnlaceRRSS enlace1 = new EnlaceRRSS("Twitter", "https://twitter.com");
				app.addEnlaceRRSS(enlace1);
				EnlaceRRSS enlace2 = new EnlaceRRSS("UNEX", "http://www.unex.es/");
				app.addEnlaceRRSS(enlace2);
		

		// Lista de paginas de la aplicacion
						// Pagina de inicio
						PaginaInicio pagina1 = new PaginaInicio("PaginaInicio", "PaginaInicio");
						
						app.addPagina(pagina1);

					
								PaginaIndiceExtendido pagina2 = new PaginaIndiceExtendido("IndiceExtendidoTitulo", "IndiceExtendidoTitulo", 2);

							pagina2.setEntidad(app.getEntidadPorId("Titulo"));
						
								Entidad entidadpagina2 = app.getEntidadPorId("Titulo");
									pagina2.addAtributo(entidadpagina2.getAtributoPorNombre("campo_cientifico"));

									Entidad entidadFiltropagina2 = app.getEntidadPorId("Titulo");
										pagina2.addAtributoFiltro(entidadFiltropagina2.getAtributoPorNombre("campo_cientifico"));
						app.addPagina(pagina2);											

					
								PaginaCreacion pagina3 = new PaginaCreacion("CrearTitulo", "CreatTitulo");

							pagina3.setEntidad(app.getEntidadPorId("Titulo"));
						
						app.addPagina(pagina3);											

					
								PaginaDetalle pagina4 = new PaginaDetalle("DetalleTitulo", "DetalleTitulo");

							pagina4.setEntidad(app.getEntidadPorId("Titulo"));
						
						app.addPagina(pagina4);											

					
								PaginaBorrado pagina5 = new PaginaBorrado("BorrarTitulo", "BorrarTitulo");

							pagina5.setEntidad(app.getEntidadPorId("Titulo"));
						
						app.addPagina(pagina5);											

					
						// GeneraciÃ³n de las pÃ¡ginas CRUD
						PaginaIndice pagina6Indice = new PaginaIndice("CRUDAsignaturaIndice", "CRUDAsignaturaIndice");
								Entidad entidadpagina6 = app.getEntidadPorId("Asignatura");
									pagina6Indice.addAtributo(entidadpagina6.getAtributoPorNombre("nombre"));
									pagina6Indice.addAtributo(entidadpagina6.getAtributoPorNombre("semestre"));
									pagina6Indice.addAtributo(entidadpagina6.getAtributoPorNombre("obligatoria"));
						pagina6Indice.setEntidad(app.getEntidadPorId("Asignatura"));
						app.addPagina(pagina6Indice);


						PaginaDetalle pagina6Detalle = new PaginaDetalle("CRUDAsignaturaDetalle", "CRUDAsignaturaDetalle");
						pagina6Detalle.setEntidad(app.getEntidadPorId("Asignatura"));
						app.addPagina(pagina6Detalle);

						PaginaCreacion pagina6Creacion = new PaginaCreacion("CRUDAsignaturaCreacion", "CRUDAsignaturaCreacion");
						pagina6Creacion.setEntidad(app.getEntidadPorId("Asignatura"));
						app.addPagina(pagina6Creacion);


						PaginaActualizacion pagina6Actualizacion = new PaginaActualizacion("CRUDAsignaturaActualizacion", "CRUDAsignaturaActualizacion");
						pagina6Actualizacion.setEntidad(app.getEntidadPorId("Asignatura"));
						app.addPagina(pagina6Actualizacion);

						PaginaBorrado pagina6Borrado = new PaginaBorrado("CRUDAsignaturaBorrado", "CRUDAsignaturaBorrado");
						pagina6Borrado.setEntidad(app.getEntidadPorId("Asignatura"));
						app.addPagina(pagina6Borrado);

							pagina6Indice.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://twitter.com"));
							pagina6Detalle.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://twitter.com"));
							pagina6Creacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://twitter.com"));
							pagina6Actualizacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://twitter.com"));
							pagina6Borrado.addEnlaceRRSS(app.getEnlaceRRSSPorURL("https://twitter.com"));


					
								PaginaDetalle pagina7 = new PaginaDetalle("DetalleAlumno", "DetalleAlumno");

							pagina7.setEntidad(app.getEntidadPorId("Alumno"));
						
						app.addPagina(pagina7);											

					
						// GeneraciÃ³n de las pÃ¡ginas CRUD
						PaginaIndice pagina8Indice = new PaginaIndice("CRUDMatriculaIndice", "CRUDMatriculaIndice");
						pagina8Indice.setEntidad(app.getEntidadPorId("Matricula"));
						app.addPagina(pagina8Indice);


						PaginaDetalle pagina8Detalle = new PaginaDetalle("CRUDMatriculaDetalle", "CRUDMatriculaDetalle");
						pagina8Detalle.setEntidad(app.getEntidadPorId("Matricula"));
						app.addPagina(pagina8Detalle);

						PaginaCreacion pagina8Creacion = new PaginaCreacion("CRUDMatriculaCreacion", "CRUDMatriculaCreacion");
						pagina8Creacion.setEntidad(app.getEntidadPorId("Matricula"));
						app.addPagina(pagina8Creacion);


						PaginaActualizacion pagina8Actualizacion = new PaginaActualizacion("CRUDMatriculaActualizacion", "CRUDMatriculaActualizacion");
						pagina8Actualizacion.setEntidad(app.getEntidadPorId("Matricula"));
						app.addPagina(pagina8Actualizacion);

						PaginaBorrado pagina8Borrado = new PaginaBorrado("CRUDMatriculaBorrado", "CRUDMatriculaBorrado");
						pagina8Borrado.setEntidad(app.getEntidadPorId("Matricula"));
						app.addPagina(pagina8Borrado);

							pagina8Indice.addEnlaceRRSS(app.getEnlaceRRSSPorURL("http://www.unex.es/"));
							pagina8Detalle.addEnlaceRRSS(app.getEnlaceRRSSPorURL("http://www.unex.es/"));
							pagina8Creacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("http://www.unex.es/"));
							pagina8Actualizacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("http://www.unex.es/"));
							pagina8Borrado.addEnlaceRRSS(app.getEnlaceRRSSPorURL("http://www.unex.es/"));


					
							PaginaEncuestaCuestionario pagina9 = new PaginaEncuestaCuestionario("SatisfaccionConElTitulo", "Encuesta de satisfacción con el título", false);
										Pregunta pregunta1pagina9 = new Pregunta("¿En qué titulación estás matriculad@?", TipoPregunta.SELECCION, "");
											pregunta1pagina9.addOpcion("I.Software");
											pregunta1pagina9.addOpcion("I.Computadores");
											pregunta1pagina9.addOpcion("I.TecnologiasInformacion");
										pagina9.addPregunta(pregunta1pagina9);
										Pregunta pregunta2pagina9 = new Pregunta("¿Volverías a matricularte de tu titulación?", TipoPregunta.VERDADERO_FALSO, "");
										pagina9.addPregunta(pregunta2pagina9);

						app.addPagina(pagina9);														

					
							PaginaEncuestaCuestionario pagina10 = new PaginaEncuestaCuestionario("LenguajesProgramacion", "Cuestionario de lenguajes de programación", true);
										Pregunta pregunta1pagina10 = new Pregunta("¿Cuál es el lenguaje de programación más utilizado en prácticas?", TipoPregunta.RESPUESTA_CORTA, "Java");
											pregunta1pagina10.addOpcion("C++");
											pregunta1pagina10.addOpcion("Java");
											pregunta1pagina10.addOpcion("Python");
										pagina10.addPregunta(pregunta1pagina10);

						app.addPagina(pagina10);														

					
								PaginaIndice pagina11 = new PaginaIndice("IndiceAlumno", "IndiceAlumno");

							pagina11.setEntidad(app.getEntidadPorId("Alumno"));
						
						app.addPagina(pagina11);											

					
						PaginaResultados pagina12 = new PaginaResultados("resultadosCuestionariosLenguajes", "Resultados Cuestionario de Lenguajes");

						app.addPagina(pagina12);

					

		// Se incluyen las conexiones entre las paginas
				PaginaEncuestaCuestionario SatisfaccionConElTitulo = (PaginaEncuestaCuestionario) app.getPaginaPorId("SatisfaccionConElTitulo");
				PaginaEncuestaCuestionario LenguajesProgramacion = (PaginaEncuestaCuestionario) app.getPaginaPorId("LenguajesProgramacion");
					LenguajesProgramacion.setPaginaResultados(app.getPaginaPorId("resultadosCuestionariosLenguajes"));
				PaginaResultados resultadosCuestionariosLenguajes = (PaginaResultados) app.getPaginaPorId("resultadosCuestionariosLenguajes");
					resultadosCuestionariosLenguajes.setPaginaCuestionario(app.getPaginaPorId("LenguajesProgramacion"));
	

		// Se incluye en cada entidad las paginas que tiene
				titulo.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
				titulo.addPagina(app.getPaginaPorId("CrearTitulo"));
				titulo.addPagina(app.getPaginaPorId("DetalleTitulo"));
				titulo.addPagina(app.getPaginaPorId("BorrarTitulo"));
				// PÃ¡ginas CRUD de Asignatura	
				asignatura.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
				asignatura.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
				asignatura.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
				asignatura.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
				asignatura.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
				alumno.addPagina(app.getPaginaPorId("DetalleAlumno"));
				alumno.addPagina(app.getPaginaPorId("IndiceAlumno"));
				// PÃ¡ginas CRUD de Matricula	
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));

		// Roles de la aplicacion
		// El rol de Administrador se crea siempre
		
		Rol admin = new Rol("Administrador");
			admin.addPagina(app.getPaginaPorId("PaginaInicio"));
			admin.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
			admin.addPagina(app.getPaginaPorId("CrearTitulo"));
			admin.addPagina(app.getPaginaPorId("DetalleTitulo"));
			admin.addPagina(app.getPaginaPorId("BorrarTitulo"));
			// PÃ¡ginas CRUD de Asignatura	
			admin.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
			admin.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
			admin.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
			admin.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
			admin.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
			admin.addPagina(app.getPaginaPorId("DetalleAlumno"));
			// PÃ¡ginas CRUD de Matricula	
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			admin.addPagina(app.getPaginaPorId("SatisfaccionConElTitulo"));
			admin.addPagina(app.getPaginaPorId("LenguajesProgramacion"));
			admin.addPagina(app.getPaginaPorId("IndiceAlumno"));
			admin.addPagina(app.getPaginaPorId("resultadosCuestionariosLenguajes"));
		
				Rol rol1 = new Rol("Director"); 	
				app.addRol(rol1);	
					rol1.addPagina(app.getPaginaPorId("CrearTitulo"));
					rol1.addPagina(app.getPaginaPorId("DetalleTitulo"));
					rol1.addPagina(app.getPaginaPorId("BorrarTitulo"));
					rol1.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
					// PÃ¡ginas CRUD de Asignatura	
					rol1.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
					rol1.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
					rol1.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
					// PÃ¡ginas CRUD de Matricula	
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
				Rol rol2 = new Rol("Alumno"); 	
				app.addRol(rol2);	
					// PÃ¡ginas CRUD de Asignatura	
					rol2.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
					rol2.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
					rol2.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
					rol2.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
					rol2.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
					rol2.addPagina(app.getPaginaPorId("SatisfaccionConElTitulo"));
					rol2.addPagina(app.getPaginaPorId("LenguajesProgramacion"));

		// Creamos una pagina para cada rol
		PaginaRol pag_admin = new PaginaRol("pag_admin", "Administrador");
			pag_admin.addPagina(app.getPaginaPorId("PaginaInicio"));
			pag_admin.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("CrearTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("DetalleTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("BorrarTitulo"));
			// PÃ¡ginas CRUD de Asignatura	
			pag_admin.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
			pag_admin.addPagina(app.getPaginaPorId("DetalleAlumno"));
			// PÃ¡ginas CRUD de Matricula	
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			pag_admin.addPagina(app.getPaginaPorId("SatisfaccionConElTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("LenguajesProgramacion"));
			pag_admin.addPagina(app.getPaginaPorId("IndiceAlumno"));
			pag_admin.addPagina(app.getPaginaPorId("resultadosCuestionariosLenguajes"));
		app.getPaginaPorId("PaginaInicio").addPagina(pag_admin);
		app.addPagina(pag_admin);

			PaginaRol pag_Director = new PaginaRol("pag_Director", "Director");
				pag_Director.addPagina(app.getPaginaPorId("CrearTitulo"));
				pag_Director.addPagina(app.getPaginaPorId("DetalleTitulo"));
				pag_Director.addPagina(app.getPaginaPorId("BorrarTitulo"));
				pag_Director.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
				// PÃ¡ginas CRUD de Asignatura	
				pag_Director.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
				// PÃ¡ginas CRUD de Matricula	
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			app.getPaginaPorId("PaginaInicio").addPagina(pag_Director);
			app.addPagina(pag_Director);
			PaginaRol pag_Alumno = new PaginaRol("pag_Alumno", "Alumno");
				// PÃ¡ginas CRUD de Asignatura	
				pag_Alumno.addPagina(app.getPaginaPorId("CRUDAsignaturaIndice"));
				pag_Alumno.addPagina(app.getPaginaPorId("CRUDAsignaturaDetalle"));
				pag_Alumno.addPagina(app.getPaginaPorId("CRUDAsignaturaCreacion"));
				pag_Alumno.addPagina(app.getPaginaPorId("CRUDAsignaturaActualizacion"));
				pag_Alumno.addPagina(app.getPaginaPorId("CRUDAsignaturaBorrado"));
				pag_Alumno.addPagina(app.getPaginaPorId("SatisfaccionConElTitulo"));
				pag_Alumno.addPagina(app.getPaginaPorId("LenguajesProgramacion"));
			app.getPaginaPorId("PaginaInicio").addPagina(pag_Alumno);
			app.addPagina(pag_Alumno);

	}
}
