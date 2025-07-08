	CREATE DATABASE Hospital CentralDatabase;

	USE Hospital CentralDatabase;
	
		CREATE TABLE Paciente (
			id_Paciente VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			edad INTEGER,
			fechaIngreso VARCHAR(255),
			enTratamiento BOOLEAN
		);
		CREATE TABLE Medico (
			id_Medico VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			fechaIngreso VARCHAR(255),
			nomina INTEGER
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
	

