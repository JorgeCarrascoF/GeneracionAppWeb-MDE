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
					Entidad entidad1 = new Entidad("titulo", "Titulo");
					app.addEntidad(entidad1);
								Atributo atributoentidad11 = new Atributo("nombre", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad11);
								Atributo atributoentidad12 = new Atributo("creditos", TipoDato.INTEGER);
								entidad1.addAtributo(atributoentidad12);
								Atributo atributoentidad13 = new Atributo("campo_cientifico", TipoDato.STRING);
								entidad1.addAtributo(atributoentidad13);
					Entidad entidad2 = new Entidad("asignatura", "Asignatura");
					app.addEntidad(entidad2);
								Atributo atributoentidad21 = new Atributo("nombre", TipoDato.STRING);
								entidad2.addAtributo(atributoentidad21);
								Atributo atributoentidad22 = new Atributo("semestre", TipoDato.INTEGER);
								entidad2.addAtributo(atributoentidad22);
								Atributo atributoentidad23 = new Atributo("obligatoria", TipoDato.BOOLEAN);
								entidad2.addAtributo(atributoentidad23);
					Entidad entidad3 = new Entidad("alumno", "Alumno");
					app.addEntidad(entidad3);
								Atributo atributoentidad31 = new Atributo("nombre", TipoDato.STRING);
								entidad3.addAtributo(atributoentidad31);
								Atributo atributoentidad32 = new Atributo("edad", TipoDato.INTEGER);
								entidad3.addAtributo(atributoentidad32);
								Atributo atributoentidad33 = new Atributo("evaluacionContinua", TipoDato.BOOLEAN);
								entidad3.addAtributo(atributoentidad33);
					Entidad entidad4 = new Entidad("matricula", "Matricula");
					app.addEntidad(entidad4);

		// Se incluyen las referencias entre entidades
				Entidad titulo = app.getEntidadPorId("titulo");					
				Entidad asignatura = app.getEntidadPorId("asignatura");					
						asignatura.addReferencia(app.getEntidadPorId("titulo"));
				Entidad alumno = app.getEntidadPorId("alumno");					
				Entidad matricula = app.getEntidadPorId("matricula");					
						matricula.addReferencia(app.getEntidadPorId("alumno"));
						matricula.addReferencia(app.getEntidadPorId("asignatura"));

		// Lista de RRSS de la aplicacion
				EnlaceRRSS enlace1 = new EnlaceRRSS("Twitter", "www.twitter.com");
				app.addEnlaceRRSS(enlace1);
		

		// Lista de paginas de la aplicacion
						// Pagina de inicio
						PaginaInicio pagina1 = new PaginaInicio("PaginaInicio", "Pagina de inicio");
						
						app.addPagina(pagina1);

					
								PaginaIndice pagina2 = new PaginaIndice("IndiceTitulo", "pagia indice de titulo");

							pagina2.setEntidad(app.getEntidadPorId("titulo"));
						
						app.addPagina(pagina2);											

					
								PaginaIndiceExtendido pagina3 = new PaginaIndiceExtendido("IndiceExtendidoTitulo", "Indice extendido de Titulo", 3);

							pagina3.setEntidad(app.getEntidadPorId("titulo"));
						

									Entidad entidadFiltropagina3 = app.getEntidadPorId("titulo");
										pagina3.addAtributoFiltro(entidadFiltropagina3.getAtributoPorNombre("campo_cientifico"));
						app.addPagina(pagina3);											

					
								PaginaCreacion pagina4 = new PaginaCreacion("CrearTitulo", "crear Titulo");

							pagina4.setEntidad(app.getEntidadPorId("titulo"));
						
						app.addPagina(pagina4);											

					
								PaginaDetalle pagina5 = new PaginaDetalle("DetalleTitulo", "detalle Titulo");

							pagina5.setEntidad(app.getEntidadPorId("titulo"));
						
						app.addPagina(pagina5);											

					
								PaginaBorrado pagina6 = new PaginaBorrado("BorrarTitulo", "borrar Titulo");

							pagina6.setEntidad(app.getEntidadPorId("titulo"));
						
						app.addPagina(pagina6);											

					
						// GeneraciÃ³n de las pÃ¡ginas CRUD
						PaginaIndice pagina7Indice = new PaginaIndice("PaginaCRUDAsignaturaIndice", "Pagina CRUD asignaturaIndice");
								Entidad entidadpagina7 = app.getEntidadPorId("asignatura");
									pagina7Indice.addAtributo(entidadpagina7.getAtributoPorNombre("nombre"));
									pagina7Indice.addAtributo(entidadpagina7.getAtributoPorNombre("semestre"));
									pagina7Indice.addAtributo(entidadpagina7.getAtributoPorNombre("obligatoria"));
						pagina7Indice.setEntidad(app.getEntidadPorId("asignatura"));
						app.addPagina(pagina7Indice);


						PaginaDetalle pagina7Detalle = new PaginaDetalle("PaginaCRUDAsignaturaDetalle", "Pagina CRUD asignaturaDetalle");
						pagina7Detalle.setEntidad(app.getEntidadPorId("asignatura"));
						app.addPagina(pagina7Detalle);

						PaginaCreacion pagina7Creacion = new PaginaCreacion("PaginaCRUDAsignaturaCreacion", "Pagina CRUD asignaturaCreacion");
						pagina7Creacion.setEntidad(app.getEntidadPorId("asignatura"));
						app.addPagina(pagina7Creacion);


						PaginaActualizacion pagina7Actualizacion = new PaginaActualizacion("PaginaCRUDAsignaturaActualizacion", "Pagina CRUD asignaturaActualizacion");
						pagina7Actualizacion.setEntidad(app.getEntidadPorId("asignatura"));
						app.addPagina(pagina7Actualizacion);

						PaginaBorrado pagina7Borrado = new PaginaBorrado("PaginaCRUDAsignaturaBorrado", "Pagina CRUD asignaturaBorrado");
						pagina7Borrado.setEntidad(app.getEntidadPorId("asignatura"));
						app.addPagina(pagina7Borrado);

							pagina7Indice.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
							pagina7Detalle.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
							pagina7Creacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
							pagina7Actualizacion.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));
							pagina7Borrado.addEnlaceRRSS(app.getEnlaceRRSSPorURL("www.twitter.com"));


					
								PaginaDetalle pagina8 = new PaginaDetalle("DetalleAlumno", "Detalle de Alumno");

							pagina8.setEntidad(app.getEntidadPorId("alumno"));
						
						app.addPagina(pagina8);											

					
						// GeneraciÃ³n de las pÃ¡ginas CRUD
						PaginaIndice pagina9Indice = new PaginaIndice("CRUDMatriculaIndice", "Pagina CRUD MatriculaIndice");
						pagina9Indice.setEntidad(app.getEntidadPorId("matricula"));
						app.addPagina(pagina9Indice);


						PaginaDetalle pagina9Detalle = new PaginaDetalle("CRUDMatriculaDetalle", "Pagina CRUD MatriculaDetalle");
						pagina9Detalle.setEntidad(app.getEntidadPorId("matricula"));
						app.addPagina(pagina9Detalle);

						PaginaCreacion pagina9Creacion = new PaginaCreacion("CRUDMatriculaCreacion", "Pagina CRUD MatriculaCreacion");
						pagina9Creacion.setEntidad(app.getEntidadPorId("matricula"));
						app.addPagina(pagina9Creacion);


						PaginaActualizacion pagina9Actualizacion = new PaginaActualizacion("CRUDMatriculaActualizacion", "Pagina CRUD MatriculaActualizacion");
						pagina9Actualizacion.setEntidad(app.getEntidadPorId("matricula"));
						app.addPagina(pagina9Actualizacion);

						PaginaBorrado pagina9Borrado = new PaginaBorrado("CRUDMatriculaBorrado", "Pagina CRUD MatriculaBorrado");
						pagina9Borrado.setEntidad(app.getEntidadPorId("matricula"));
						app.addPagina(pagina9Borrado);

							pagina9Indice.addPaginaExterna("https://www.unex.es/");
							pagina9Detalle.addPaginaExterna("https://www.unex.es/");
							pagina9Creacion.addPaginaExterna("https://www.unex.es/");
							pagina9Actualizacion.addPaginaExterna("https://www.unex.es/");
							pagina9Borrado.addPaginaExterna("https://www.unex.es/");


					
							PaginaEncuestaCuestionario pagina10 = new PaginaEncuestaCuestionario("SatisfaccionTitulo", "Encuesta de satisfaccion", false);
										Pregunta pregunta1pagina10 = new Pregunta("¿En qué titulación estás Matriculad@?", TipoPregunta.SELECCION, "");
											pregunta1pagina10.addOpcion("Software");
											pregunta1pagina10.addOpcion("Computadores");
											pregunta1pagina10.addOpcion("TecnologiaInformacion");
										pagina10.addPregunta(pregunta1pagina10);
										Pregunta pregunta2pagina10 = new Pregunta("¿Volverías a matricularte en tu formación?", TipoPregunta.VERDADERO_FALSO, "");
										pagina10.addPregunta(pregunta2pagina10);

						app.addPagina(pagina10);														

					
							PaginaEncuestaCuestionario pagina11 = new PaginaEncuestaCuestionario("CuestionarioProgramacion", "Lenguajes de programacion", true);
										Pregunta pregunta1pagina11 = new Pregunta("¿Qué lenguaje de programación es el más usado en prácticas?", TipoPregunta.SELECCION, "Java");
											pregunta1pagina11.addOpcion("Java");
											pregunta1pagina11.addOpcion("Python");
											pregunta1pagina11.addOpcion("C++");
										pagina11.addPregunta(pregunta1pagina11);

						app.addPagina(pagina11);														

					
								PaginaIndice pagina12 = new PaginaIndice("IndiceAlumno", "Indice de Alumno");

							pagina12.setEntidad(app.getEntidadPorId("alumno"));
						
								Entidad entidadpagina12 = app.getEntidadPorId("alumno");
									pagina12.addAtributo(entidadpagina12.getAtributoPorNombre("nombre"));
						app.addPagina(pagina12);											

					
						PaginaResultados pagina13 = new PaginaResultados("resultadosCuestionario", "Resultados del cuestionario");

						app.addPagina(pagina13);

					

		// Se incluyen las conexiones entre las paginas
				PaginaEncuestaCuestionario SatisfaccionTitulo = (PaginaEncuestaCuestionario) app.getPaginaPorId("SatisfaccionTitulo");
				PaginaEncuestaCuestionario CuestionarioProgramacion = (PaginaEncuestaCuestionario) app.getPaginaPorId("CuestionarioProgramacion");
					CuestionarioProgramacion.setPaginaResultados(app.getPaginaPorId("resultadosCuestionario"));
				PaginaResultados resultadosCuestionario = (PaginaResultados) app.getPaginaPorId("resultadosCuestionario");
					resultadosCuestionario.setPaginaCuestionario(app.getPaginaPorId("CuestionarioProgramacion"));
	

		// Se incluye en cada entidad las paginas que tiene
				titulo.addPagina(app.getPaginaPorId("IndiceTitulo"));
				titulo.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
				titulo.addPagina(app.getPaginaPorId("CrearTitulo"));
				titulo.addPagina(app.getPaginaPorId("DetalleTitulo"));
				titulo.addPagina(app.getPaginaPorId("BorrarTitulo"));
				// PÃ¡ginas CRUD de asignatura	
				asignatura.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
				asignatura.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
				asignatura.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
				asignatura.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
				asignatura.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
				alumno.addPagina(app.getPaginaPorId("DetalleAlumno"));
				alumno.addPagina(app.getPaginaPorId("IndiceAlumno"));
				// PÃ¡ginas CRUD de matricula	
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
				matricula.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));

		// Roles de la aplicacion
		// El rol de Administrador se crea siempre
		
		Rol admin = new Rol("Administrador");
			admin.addPagina(app.getPaginaPorId("PaginaInicio"));
			admin.addPagina(app.getPaginaPorId("IndiceTitulo"));
			admin.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
			admin.addPagina(app.getPaginaPorId("CrearTitulo"));
			admin.addPagina(app.getPaginaPorId("DetalleTitulo"));
			admin.addPagina(app.getPaginaPorId("BorrarTitulo"));
			// PÃ¡ginas CRUD de asignatura	
			admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
			admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
			admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
			admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
			admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
			admin.addPagina(app.getPaginaPorId("DetalleAlumno"));
			// PÃ¡ginas CRUD de matricula	
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
			admin.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			admin.addPagina(app.getPaginaPorId("SatisfaccionTitulo"));
			admin.addPagina(app.getPaginaPorId("CuestionarioProgramacion"));
			admin.addPagina(app.getPaginaPorId("IndiceAlumno"));
			admin.addPagina(app.getPaginaPorId("resultadosCuestionario"));
		
				Rol rol1 = new Rol("Director"); 	
				app.addRol(rol1);	
					rol1.addPagina(app.getPaginaPorId("BorrarTitulo"));
					rol1.addPagina(app.getPaginaPorId("CrearTitulo"));
					rol1.addPagina(app.getPaginaPorId("DetalleTitulo"));
					// PÃ¡ginas CRUD de asignatura	
					rol1.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
					rol1.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
					rol1.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
					rol1.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
					rol1.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
					// PÃ¡ginas CRUD de matricula	
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
					rol1.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
				Rol rol2 = new Rol("Alumno"); 	
				app.addRol(rol2);	
					rol2.addPagina(app.getPaginaPorId("SatisfaccionTitulo"));
					rol2.addPagina(app.getPaginaPorId("CuestionarioProgramacion"));
					// PÃ¡ginas CRUD de asignatura	
					rol2.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
					rol2.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
					rol2.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
					rol2.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
					rol2.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));

		// Creamos una pagina para cada rol
		PaginaRol pag_admin = new PaginaRol("pag_admin", "Administrador");
			pag_admin.addPagina(app.getPaginaPorId("PaginaInicio"));
			pag_admin.addPagina(app.getPaginaPorId("IndiceTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("IndiceExtendidoTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("CrearTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("DetalleTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("BorrarTitulo"));
			// PÃ¡ginas CRUD de asignatura	
			pag_admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
			pag_admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
			pag_admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
			pag_admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
			pag_admin.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
			pag_admin.addPagina(app.getPaginaPorId("DetalleAlumno"));
			// PÃ¡ginas CRUD de matricula	
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
			pag_admin.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			pag_admin.addPagina(app.getPaginaPorId("SatisfaccionTitulo"));
			pag_admin.addPagina(app.getPaginaPorId("CuestionarioProgramacion"));
			pag_admin.addPagina(app.getPaginaPorId("IndiceAlumno"));
			pag_admin.addPagina(app.getPaginaPorId("resultadosCuestionario"));
		app.getPaginaPorId("PaginaInicio").addPagina(pag_admin);
		app.addPagina(pag_admin);

			PaginaRol pag_Director = new PaginaRol("pag_Director", "Director");
				pag_Director.addPagina(app.getPaginaPorId("BorrarTitulo"));
				pag_Director.addPagina(app.getPaginaPorId("CrearTitulo"));
				pag_Director.addPagina(app.getPaginaPorId("DetalleTitulo"));
				// PÃ¡ginas CRUD de asignatura	
				pag_Director.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
				pag_Director.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
				pag_Director.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
				pag_Director.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
				pag_Director.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
				// PÃ¡ginas CRUD de matricula	
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaIndice"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaDetalle"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaCreacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaActualizacion"));
				pag_Director.addPagina(app.getPaginaPorId("CRUDMatriculaBorrado"));
			app.getPaginaPorId("PaginaInicio").addPagina(pag_Director);
			app.addPagina(pag_Director);
			PaginaRol pag_Alumno = new PaginaRol("pag_Alumno", "Alumno");
				pag_Alumno.addPagina(app.getPaginaPorId("SatisfaccionTitulo"));
				pag_Alumno.addPagina(app.getPaginaPorId("CuestionarioProgramacion"));
				// PÃ¡ginas CRUD de asignatura	
				pag_Alumno.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaIndice"));
				pag_Alumno.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaDetalle"));
				pag_Alumno.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaCreacion"));
				pag_Alumno.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaActualizacion"));
				pag_Alumno.addPagina(app.getPaginaPorId("PaginaCRUDAsignaturaBorrado"));
			app.getPaginaPorId("PaginaInicio").addPagina(pag_Alumno);
			app.addPagina(pag_Alumno);

	}
}
