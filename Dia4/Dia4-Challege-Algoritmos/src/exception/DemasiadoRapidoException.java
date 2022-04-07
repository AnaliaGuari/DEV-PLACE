package exception;

public class DemasiadoRapidoException  extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DemasiadoRapidoException() {
		
	}

	public DemasiadoRapidoException(String mensaje) {
	    super(mensaje);
	}
}