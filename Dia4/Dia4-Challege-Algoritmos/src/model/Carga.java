package model;

import exception.DemasiadoRapidoException;

public class Carga extends Vehiculo{
	private Remolque remolque;
	
	

	public Carga(String matricula) {
		super(matricula);
		remolque = null;
		// TODO Auto-generated constructor stub
	}

	public void ponRemolque(Remolque rem) {
	    remolque = rem;
	}
	 
	public void quitaRemolque() {
	    remolque = null;
	}

	@Override
	public void acelerar(double cantidad) throws DemasiadoRapidoException {
		if (remolque != null && getVelocidad() + cantidad > 100) {
	        throw new DemasiadoRapidoException();
	    }
		super.acelerar(cantidad);
	}
	
	@Override
	public String toString() {
	    if (remolque != null) {
	        return super.toString() + ". Lleva un remolque: " + remolque.toString();
	    } else {
	        return super.toString();
	    }
	}
}
