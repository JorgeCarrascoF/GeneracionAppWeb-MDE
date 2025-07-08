package model;

public class Libro {
		private String ISBN;
		private String FechaSalida;
		private int copias;
		private String titulo;

	public Libro(){
	}

	public Libro(
		String ISBN,
		String FechaSalida,
		int copias,
		String titulo
	){	
		this.ISBN = ISBN;
		this.FechaSalida = FechaSalida;
		this.copias = copias;
		this.titulo = titulo;
	}

		public String getISBN(){
			return this.ISBN;
		} 

		public void setISBN(String ISBN){
			this.ISBN = ISBN;
		}
		public String getFechaSalida(){
			return this.FechaSalida;
		} 

		public void setFechaSalida(String FechaSalida){
			this.FechaSalida = FechaSalida;
		}
		public int getCopias(){
			return this.copias;
		} 

		public void setCopias(int copias){
			this.copias = copias;
		}
		public String getTitulo(){
			return this.titulo;
		} 

		public void setTitulo(String titulo){
			this.titulo = titulo;
		}
}
