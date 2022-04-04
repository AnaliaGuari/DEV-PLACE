package app;
import model.Triangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Triangulo tri = new Triangulo(6,6,6);
		System.out.println(tri.quienSoy());
		int numero;
		
		do {
			System.out.println("ingrese un numero entre el 1 y el 14");
		   numero = scan.nextInt();
			if(numero>14 || numero<1) {
				System.out.println("el numero ingresado no esta entre  1 y el 14");
			}
			
		}while(numero>14||numero<1);
		
		boolean cierto =numeroPrimo(numero);
			
			if (cierto==true) {
				System.out.println("El numero " + numero + " es primo");
			}else {
				System.out.println("El numero " + numero + " no es primo");
			}
	    
		
	}

	public static boolean numeroPrimo(int num) {
		boolean primo = false;
		if (num<=1) { // los numeros menores a 1 no son numeros primos  
			primo = false;
		}else {
 
            //
            int divisor = (int) Math.sqrt(num);
            int cont = 0;
 
            
            for (int i = divisor; i > 1; i--) {
                if (num % i == 0) {
                    cont++;
                }
            }
            
            if (cont < 1) {
               primo = true;
            } else {
                primo = false;
            }
 
        }
		return primo;
	}
}
