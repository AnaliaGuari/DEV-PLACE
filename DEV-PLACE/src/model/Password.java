package model;

public class Password {
	
private final static int LONG_DEF = 8;


private int longitud;
private String contraseña;

public Password() {
	this.longitud = LONG_DEF;
}

public Password(int longitud) {
	this.longitud = longitud;
	contraseña = generarPassword();
}

public void setLongitud(int longitud) {

	this.longitud = longitud;

}

public int getLongitud() {

	return this.longitud;

}

public String getContraseña() {
	return this.contraseña;
}

public void setContraseña(String contraseña) {
	this.contraseña= contraseña;
}

public String generarPassword() {

	String contraseña = "";
	for (int i = 0; i < longitud; i++) {

		switch ((int) (Math.random() * 3)) {
		case 0:
			contraseña += (char) (Math.random() * 26 + 'A');
			break;
		case 1:
			contraseña += (char) (Math.random() * 26 + 'a');
			break;
		case 2:
			contraseña += (char) (Math.random() * 10 + '0');
			break;
		}
	}

	return contraseña;
}

public boolean esFuerte() {
	int Contmayusculas = 0, Contminusculas = 0, Contnumeros = 0;

	for (int i=0;i<contraseña.length();i++){
        if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
        	Contminusculas+=1;
        }else{
            if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
            	Contmayusculas+=1;
        }else{
        	Contnumeros+=1;
            }
        }
	
}
	if (Contnumeros>=3 && Contminusculas>=1 && Contmayusculas>=2){
        return true;
    }else{
        return false;
    }
}
}


