package model;

public class Entidad_libro {
		private String Nombre;
		private String Fecha;

	public Entidad_libro(){
	}

	public Entidad_libro(
		String Nombre,
		String Fecha
	){	
		this.Nombre = Nombre;
		this.Fecha = Fecha;
	}

		public String getNombre(){
			return this.Nombre;
		} 

		public void setNombre(String Nombre){
			this.Nombre = Nombre;
		}
		public String getFecha(){
			return this.Fecha;
		} 

		public void setFecha(String Fecha){
			this.Fecha = Fecha;
		}
}
