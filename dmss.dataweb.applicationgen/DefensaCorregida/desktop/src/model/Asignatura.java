package model;

public class Asignatura {
		private String nombre;
		private int semestre;
		private boolean obligatoria;
		private Titulo titulo;

	public Asignatura(){
	}


	public Asignatura(
		String nombre,
		int semestre,
		boolean obligatoria,
		Titulo titulo
	
	){	
		this.nombre = nombre;
		this.semestre = semestre;
		this.obligatoria = obligatoria;
		this.titulo = titulo;
	}

		public String getNombre(){
			return this.nombre;
		} 

		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public int getSemestre(){
			return this.semestre;
		} 

		public void setSemestre(int semestre){
			this.semestre = semestre;
		}
		public boolean getObligatoria(){
			return this.obligatoria;
		} 

		public void setObligatoria(boolean obligatoria){
			this.obligatoria = obligatoria;
		}
		public Titulo getTitulo(){
			return this.titulo;
		} 

		public void setTitulo(Titulo titulo){
			this.titulo = titulo;
		}
}
