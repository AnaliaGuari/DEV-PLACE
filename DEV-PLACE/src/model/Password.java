package model;

public class Password {
	
private final static int LONG_DEF = 8;


private int longitud;
private String contrase�a;

public Password() {
	this.longitud = LONG_DEF;
}

public Password(int longitud) {
	this.longitud = longitud;
	contrase�a = generarPassword();
}

public void setLongitud(int longitud) {

	this.longitud = longitud;

}

public int getLongitud() {

	return this.longitud;

}

public String getContrase�a() {
	return this.contrase�a;
}

public void setContrase�a(String contrase�a) {
	this.contrase�a= contrase�a;
}

public String generarPassword() {

	String contrase�a = "";
	for (int i = 0; i < longitud; i++) {

		switch ((int) (Math.random() * 3)) {
		case 0:
			contrase�a += (char) (Math.random() * 26 + 'A');
			break;
		case 1:
			contrase�a += (char) (Math.random() * 26 + 'a');
			break;
		case 2:
			contrase�a += (char) (Math.random() * 10 + '0');
			break;
		}
	}

	return contrase�a;
}

public boolean esFuerte() {
	int Contmayusculas = 0, Contminusculas = 0, Contnumeros = 0;

	for (int i=0;i<contrase�a.length();i++){
        if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
        	Contminusculas+=1;
        }else{
            if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
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


