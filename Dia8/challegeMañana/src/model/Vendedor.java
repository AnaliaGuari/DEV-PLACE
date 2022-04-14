package model;

public class Vendedor extends Persona {
	private static int idVendedor;
	private int ownId;
	private double salario;

	public Vendedor(String nombre, String apellido, String dni, String direccion, int dia, int mes, int años,
			double salario) {
		super(nombre, apellido, dni, direccion, dia, mes, años);
		idVendedor++;
		ownId = idVendedor;
		this.salario = salario;
	}

	public static int getIdVendedor() {
		return idVendedor;
	}

	public static void setIdVendedor(int vendorId) {
		Vendedor.idVendedor = vendorId;
	}

	public int getIdVendor() {
		return ownId;
	}
	public void setIdVendor(int ownId) {
			this.ownId = ownId;
		}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salary) {
		this.salario = salary;
	}
	

	public int getOwnId() {
		return ownId;
	}

	public void setOwnId(int ownId) {
		this.ownId = ownId;
	}
	
}
