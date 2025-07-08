package model;

public class Matricula {
		private Alumno alumno;
		private Asignatura asignatura;

	public Matricula(){
	}



		public Alumno getAlumno(){
			return this.alumno;
		} 

		public void setAlumno(Alumno alumno){
			this.alumno = alumno;
		}
		public Asignatura getAsignatura(){
			return this.asignatura;
		} 

		public void setAsignatura(Asignatura asignatura){
			this.asignatura = asignatura;
		}
}
