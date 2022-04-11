package model;

public class Empleados extends Persona {
	private int a�oInicio;
	private int numDespacho;
	
	


	public Empleados(String nombre, String apellido, String estadCivil, int identificacion, int a�oInicio,
			int numDespacho) {
		super(nombre, apellido, estadCivil, identificacion);
		this.a�oInicio = a�oInicio;
		this.numDespacho = numDespacho;
	}

	public int getA�oInicio() {
		return a�oInicio;
	}

	public void setA�oInicio(int a�oInicio) {
		this.a�oInicio = a�oInicio;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return "Empleados [a�oInicio=" + a�oInicio + ", numDespacho=" + numDespacho + "]";
	}
	
	
	
	
}
