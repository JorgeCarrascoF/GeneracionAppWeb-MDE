package model;

public class Matricula {
		private Asignatura asignatura;
		private Alumno alumno;

	public Matricula(){
	}



		public Asignatura getAsignatura(){
			return this.asignatura;
		} 

		public void setAsignatura(Asignatura asignatura){
			this.asignatura = asignatura;
		}
		public Alumno getAlumno(){
			return this.alumno;
		} 

		public void setAlumno(Alumno alumno){
			this.alumno = alumno;
		}
}
