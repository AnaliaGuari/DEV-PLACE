package model;

import exception.DemasiadoRapidoException;

public class Vehiculo {
	private String matricula;
	protected double velocidad;


	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.velocidad = 0;
	}
	
	
	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public void acelerar(double cantidad) throws DemasiadoRapidoException {
	    velocidad += cantidad;
	}
	
	public String toString() {
	    return "El vehículo con matrícula " + matricula + " va a velocidad de " + velocidad + "km/h";   
	}
}
