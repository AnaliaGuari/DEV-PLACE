package model;

public class Profesores extends Empleados{
	private String departamento;

	public Profesores(String nombre, String apellido, String estadCivil, int identificacion, int añoInicio,
			int numDespacho, String departamento) {
		super(nombre, apellido, estadCivil, identificacion, añoInicio, numDespacho);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesores [departamento=" + departamento + "]";
	}
	
	
	
	
}
