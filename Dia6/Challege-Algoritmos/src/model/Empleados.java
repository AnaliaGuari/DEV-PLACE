package model;

public class Empleados extends Persona {
	private int añoInicio;
	private int numDespacho;
	
	


	public Empleados(String nombre, String apellido, String estadCivil, int identificacion, int añoInicio,
			int numDespacho) {
		super(nombre, apellido, estadCivil, identificacion);
		this.añoInicio = añoInicio;
		this.numDespacho = numDespacho;
	}

	public int getAñoInicio() {
		return añoInicio;
	}

	public void setAñoInicio(int añoInicio) {
		this.añoInicio = añoInicio;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return "Empleados [añoInicio=" + añoInicio + ", numDespacho=" + numDespacho + "]";
	}
	
	
	
	
}
