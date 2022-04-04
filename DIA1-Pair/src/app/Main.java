package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean salir = false;
	int opcion; //Guarda la opcion del usuario
	
	
	
	
	while(!salir) {
		System.out.println("1. EJERCICIO: Array suma y media");
		System.out.println("2. EJERCICIO: Calcula cuantas cifras tiene");
		System.out.println("3. EJERCICIO: Calcula Compra");
		System.out.println("4. SALIR");
		
		
		try {
			System.out.println("Escribe una de las opciones");
	           opcion = scan.nextInt();
	           switch (opcion) {
	           
               case 1:
            	   int[] numeros=new int[100]; //creo el arreglo
                   
                 
                   int suma=0;
                   double media;
                    
                   //Recorro el array
                   for(int i=0;i<numeros.length;i++){
                       numeros[i]=i+1;
                       suma+=numeros[i];
                       System.out.println(i);
                   }
                   
                    
                   //muestro la suma
                   System.out.println("La suma es "+suma);
                   //Calculo la media
                   media= suma/numeros.length;
                   //muestro  la media
                   System.out.println("La media es "+media);
                    
               
                   break;
               case 2:
            	       
            	        int numero;
            	        Scanner entrada=new Scanner(System.in);

            	        System.out.print("Ingrese un numero: "); 
            	        numero=entrada.nextInt();
            	        
            	        if(numero < 10){
            	            System.out.println("El numero "+numero+" tiene 1 cifra");
            	        }
            	        else if(numero<100){
            	            System.out.println("El numero "+numero+" tiene 2 cifras");
            	        }
            	        else if(numero < 1000){
            	            System.out.println("El numero "+numero+" tiene 3 cifras");
            	        }
            	        else if(numero < 10000){
            	            System.out.println("El numero "+numero+" tiene 4 cifras");
            	        }
            	        else if(numero < 100000){
            	            System.out.println("El numero "+numero+" tiene 5 cifras");
            	        }         	
                   
                   
                   break;
                   
               case 3:
            	   double valor, descuento, recargo,total;
            	    String tipo_pago;
            	   
            	    
            	    System.out.print("Ingrese el valor de la compra: ");
            	    valor = scan.nextDouble();
            	    System.out.print("Ingrese tipo de pago: ");
            	    tipo_pago=scan.next();
            	    descuento=0.05*valor;
            	    recargo=0.03*valor;
            	    
            	    if(tipo_pago.equalsIgnoreCase("contado")){ //ignora mayusculas y minusculas 
            	        System.out.println("El descuento es: " + descuento);
            	        total= valor - descuento;
            	        System.out.println("El total es: " + total);
            	    }
            	    else{
            	        System.out.println("El recargo es: " + recargo);
            	        total=valor + recargo;
            	        System.out.println("El total es: " + total);
            	    }
            	   
                   break;
                        
              
               case 4:
            	   salir = true;
                   break;  
                  
                   
                   
               default:
                   System.out.println("Solo números en pantalla");
           }
		}catch(InputMismatchException e) {
            System.out.println("Debes insertar un número");
            scan.next();
        }
		
}
	
	}
}

