	CREATE DATABASE AppPruebaDatabase;

	USE AppPruebaDatabase;
	
		CREATE TABLE Libro (
			id_Libro VARCHAR(30) PRIMARY KEY,
			Nombre VARCHAR(255),
			Fecha VARCHAR(255)
		);
		CREATE TABLE Autor (
			id_Autor VARCHAR(30) PRIMARY KEY,
			nombreCompleto VARCHAR(255),
			FechaNacimiento INTEGER
		);

	CREATE TABLE Cuestionario(
		id_cuestionario VARCHAR(30) PRIMARY KEY
	);

	CREATE TABLE PreguntaCuestionario(
		id_pregunta VARCHAR(30) PRIMARY KEY,
		id_cuestionario VARCHAR(30),
		totalRespuestas INT DEFAULT 0,
		respuestasCorrectas INT DEFAULT 0,
		FOREIGN KEY (id_cuestionario) REFERENCES Cuestionario(id_cuestionario)
	);
	

