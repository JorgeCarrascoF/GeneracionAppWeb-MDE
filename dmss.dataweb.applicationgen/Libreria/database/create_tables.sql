	CREATE DATABASE LibreriaDatabase;

	USE LibreriaDatabase;
	
		CREATE TABLE Libro (
			id_Libro VARCHAR(30) PRIMARY KEY,
			ISBN VARCHAR(255),
			FechaSalida VARCHAR(255),
			copias INTEGER,
			titulo VARCHAR(255)
		);
		CREATE TABLE Autor (
			id_Autor VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			localidad VARCHAR(255)
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
	

