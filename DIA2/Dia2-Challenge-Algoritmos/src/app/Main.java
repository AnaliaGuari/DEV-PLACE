package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		boolean salir2 = false;
		int opcion; //Guarda la opcion del usuario
		char opcion2; //Guarda la opcion del usuario
		int num =0;
		int num2 =0;
		int resultado =0;
		char otraop;
	
		
		while(!salir) {
			System.out.println("1. EJERCICIO: Caluladora");
			System.out.println("2. EJERCICIO: Caracteres minusculas ");
			System.out.println("3. EJERCICIO: Ingresar 10 numeros");
			System.out.println("4. SALIR");

			try {
			   System.out.println("Escribe una de las opciones");
		           opcion = scan.nextInt();
		           switch (opcion) {
		           
	               case 1: 
	            	   
	            	   while(!salir2) {
	            			System.out.println("Ingrese un numero:");
	            			num = scan.nextInt();
	            			System.out.println("Ingrese otro numero:");
	            			num2 = scan.nextInt();
	            			
	            			try {
	            				System.out.println("Que operacion desea realizar?");
	            				
	            				System.out.println("A. SUMA: ");
	            				System.out.println("B. RESTA: ");
	            				System.out.println("C. MULTIPLICACION");
		            			System.out.println("D. DIVISION");
		            			System.out.println("E. SALIR");
	            			    
	            		           opcion2 = scan.next().charAt(0);
	            		           switch (opcion2) {
	            	               case 'a':
	            	            	   resultado = num +num2;
	            	            	   System.out.print("El resultado de la suma es \n" + resultado);
	            	            	   System.out.print("\r\n");
	            	            	   System.out.print(" quiere realizar otra cuenta?s/n");
	            	            	   otraop = scan.next().charAt(0);
	            	            	   if (otraop == 'n') {
	            	            		   salir2 = true;
	            	            		   resultado =0;
	            	            	   }

	            	              break;
	            	               case 'b': 
	            	            	   resultado = num-num2;
	            	            	   System.out.print("El resultado de la resta es \n" + resultado);
	            	            	   System.out.print("\r\n");
	            	            	   System.out.print(" quiere realizar otra cuenta?s/n");
	            	            	   otraop = scan.next().charAt(0);
	            	            	   if (otraop == 'n') {
	            	            		   salir2 = true;
	            	            		   resultado =0;
	            	            	   }
	            	            	   break; 
	            	               case 'c':
	            	            	   resultado = num*num2;
	            	            	   System.out.print("El resultado de la multiplicacion es \n" + resultado);
	            	            	   System.out.print("\r\n");
	            	            	   System.out.print(" quiere realizar otra cuenta?s/n");
	            	            	   otraop = scan.next().charAt(0);
	            	            	   if (otraop == 'n') {
	            	            		   salir2 = true;
	            	            		   resultado =0;
	            	            	   }
	            	            	   break; 
	            	               case 'd':
	            	            	   resultado = num/num2;
	            	            	   System.out.print("El resultado de la division es \n" + resultado);
	            	            	   System.out.print("\r\n");
	            	            	   System.out.print(" quiere realizar otra cuenta?s/n");
	            	            	   otraop = scan.next().charAt(0);
	            	            	   if (otraop == 'n') {
	            	            		   salir2 = true;
	            	            		   resultado =0;
	            	            	   }
	            	            	   break; 
	            	               case 'e':   salir2 = true;
	            	                         break;  
	            	               default:
	            	                   System.out.println("Solo letras en pantalla");
	            	           }
	            			}catch(InputMismatchException e) {
	            	            System.out.println("Debes insertar una letra");
	            	            scan.next().charAt(0);
	            	        }		
	            	}
	            	   break;
	               case 2:
	            	   int ini = 'a', fin = 'z';
	           		
	           		for (int i = ini; i <= fin; i++) {
	           			System.out.println((char)i);//casteo porqeu sino nos muestra num asci
	           		}
	            	   break; 
	            	   
	               case 3:   
	            	   Integer [] numeros = {3, 5, 1, 2, -1, 7, 0,10};
	            	   Arrays.sort(numeros, Collections.reverseOrder());                                                                 
	            	   for (int n : numeros) {
	            	          System.out.println(n);                                                                                     
	            	   }
	                   break;  
	                   
	               case 4:   salir = true;
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
