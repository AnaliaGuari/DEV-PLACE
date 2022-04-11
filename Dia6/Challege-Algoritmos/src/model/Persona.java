package model;

public class Persona {
	private String nombre;
	private String apellido;
	private String estadCivil;
	private int identificacion;
	
	
	public Persona(String nombre, String apellido, String estadCivil, int identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadCivil = estadCivil;
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEstadCivil() {
		return estadCivil;
	}


	public void setEstadCivil(String estadCivil) {
		this.estadCivil = estadCivil;
	}


	public int getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", estadCivil=" + estadCivil
				+ ", identificacion=" + identificacion + "]";
	}

	
	
}
