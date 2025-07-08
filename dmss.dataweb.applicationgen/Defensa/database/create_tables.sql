	CREATE DATABASE DefensaDatabase;

	USE DefensaDatabase;
	
		CREATE TABLE Título (
			id_Título VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			créditos INTEGER,
			campo_cientifico VARCHAR(255)


		);
		CREATE TABLE Asignatura (
			id_Asignatura VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			semestre INTEGER,
			obligatoria BOOLEAN,
			id_Título VARCHAR(30),
			FOREIGN KEY (id_Título) REFERENCES Título(id_Título)


		);
		CREATE TABLE Alumno (
			id_Alumno VARCHAR(30) PRIMARY KEY,
			nombre VARCHAR(255),
			edad INTEGER,
			evaluacionContinua BOOLEAN


		);
		CREATE TABLE Matricula (
			id_Matricula VARCHAR(30) PRIMARY KEY,
			id_Asignatura VARCHAR(30),
			FOREIGN KEY (id_Asignatura) REFERENCES Asignatura(id_Asignatura),
			id_Alumno VARCHAR(30),
			FOREIGN KEY (id_Alumno) REFERENCES Alumno(id_Alumno)


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
	

