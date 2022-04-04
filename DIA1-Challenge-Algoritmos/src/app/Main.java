package app;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guarda la opcion del usuario
		
		
		while(!salir) {
			System.out.println("1. EJERCICIO: Calcular indice de masa muscular");
			System.out.println("2. EJERCICIO: cálculo de las raíces");
			System.out.println("3. EJERCICIO: promedio de tres notas");
			System.out.println("4. EJERCICIO: el mayor y el menor de tres valores");
			System.out.println("5. EJERCICIO: es capicúa");
			
			
			try {
				System.out.println("Escribe una de las opciones");
		           opcion = scan.nextInt();
		           switch (opcion) {
                   case 1:
                	    System.out.println("Ingrese su Peso ");
               			float peso = scan.nextFloat();
               			
               			System.out.println("Ingrese su Altura ");
            			float altura = scan.nextFloat();
               			
               	float imc =peso/(altura*altura);		
            	
               			if (imc<20) {
               				System.out.println("\r\n"
               						+ "Mal estado\r\n"
               						+ "\r\n"
               						+ "");
               			}if(imc>=20 && imc<22) {
               				System.out.println("\r\n"
               						+ "Bajo de Peso\r\n"
               						+ "\r\n"
               						+ "");
               			}
               			
               			if(imc>=22 && imc<25) {
               				System.out.println("\r\n"
               						+ "Peso Normal\r\n"
               						+ "\r\n"
               						+ "");
               			}
               			if(imc>=25 && imc<30){
               				System.out.println("\r\n"
               						+ "SobrePesos\r\n"
               						+ "\r\n"
               						+ "");         		
               				}
               			
               			if(imc>=30 && imc<40) {
               				System.out.println("\r\n"
               						+ "SobrePeso Cronico\r\n"
               						+ "\r\n"
               						+ "");  
               			}
               			if(imc>40){
               				System.out.println("\r\n"
               						+ "Hospitalizado\r\n"
               						+ "\r\n"
               						+ ""); 
               			}
               				
               				
                       break;
                   case 2:
                       double co2;//segundo Grado
                       double co1;//primer Grado
                       double co0; //grago cero
                       double discriminante; 
                       double x1; //raiz real
                       double x2; //segunda raiz
                       double real; //parte real
                       double imaginaria; //parte imainaria
                       
                       co2 = Double.parseDouble(args[0]);
                       co1 = Double.parseDouble(args[1]);
                       co0 = Double.parseDouble(args[2]);
                       discriminante = co1*co1 - 4*co1*co0;
                       
                       if(discriminante>0) {
                    	   x1 =(-co1 + Math.sqrt(discriminante) )/(2*co2);
                    	   x2 =(-co1 - Math.sqrt(discriminante) )/(2*co2);
                    	   System.out.print("Soluciones de la ecuacion de segundo grado: ");
                    	   System.out.println(co2 + "x2 + " + co1 + "x + " + co0);
                    	   System.out.println("Tiene dos raices reales");
                    	   System.out.println("La primera raiz es x1 = " + x1);
                    	   System.out.println("La segunda raiz es x2 = " + x2);
                       }
                       else if(discriminante <0) {
                    	   real = (-co1)/(2*co2);
                    	   imaginaria = Math.sqrt(-discriminante)/(2*co1);
                    	   System.out.print("Soluciones de la ecuacion de segundo grado: ");
                    	   System.out.println(co1 + "x2 + " + co2 + "x + " + co0);
                    	   System.out.println("Tiene dos raices complejas");
                    	   System.out.println("La primera raiz es x1 = " + real + "+i" + imaginaria);
                    	   System.out.println("La segunda raiz es x2 = " + real + "-i" + imaginaria);
                       }else {
                    	   x1 =(-co1)/(2*co2);
                    	   System.out.print("Soluciones de la ecuacion de segundo grado: ");
                    	   System.out.println(co2 + "x2 + " + co1 + "x + " + co0);
                    	   System.out.println("Dos raices identicas, x1 = x2 = " + x1);
                    	   }

                       
                    
                                      
                       break;
                       
                   case 3:
                	   System.out.println("ingrese la Primer Nota");
                	   int nota1= scan.nextInt();
                	   System.out.println("ingrese la Segunda Nota");
                	   int nota2= scan.nextInt();
                	   System.out.println("ingrese la Tercer Nota");
                	   int nota3= scan.nextInt();
                	   
                	   int suma = nota1 + nota2 + nota3;
                	   float promedio;
                	   promedio = suma/3;
                	   if (promedio<=10) {
                		   System.out.println("Reprobado");
                	   }
                	   if(promedio>=10 && promedio<15) {
                		   System.out.println("Aprobado");
                	   }else {
                		   System.out.println("eximido");
                	   }
                       break;
                       
                       
                   case 4:
                	   float n1,n2,n3,mayor = 0, menor = 0;
                	   
                	   System.out.println("Ingresar tres numeros distintos:");
                	   System.out.println("Ingrese un numero:");
                	   n1= scan.nextInt();
                	   System.out.println("Ingrese un numero:");
                	   n2= scan.nextFloat();
                	   System.out.println("Ingrese un numero:");
                	   n3= scan.nextFloat();
                	   
                	   if(n1 == n2 || n1 == n3 || n2 == n3){
                			System.out.println("Hay numeros iguales\nIngresar numeros distintos");
                		}
                	   
                	   else{
                			if(n1>n2 && n2>n3){mayor = n1; menor = n3;}
                			if(n1>n3 && n3>n2){mayor = n1; menor = n2;}
                			if(n2>n3 && n3>n1){mayor = n2; menor = n1;}
                			if(n2>n1 && n1>n3){mayor = n2; menor = n3;}
                			if(n3>n2 && n2>n1){mayor = n3; menor = n1;}
                			if(n3>n1 && n1>n2){mayor = n3; menor = n2;}
                	 
                			System.out.println("El mayor es: "+ mayor);
                			System.out.println("El menor es: "+ menor);
                		}
                       break;
                       
                       
                   case 5:
                	   System.out.println("Introduzca un Numero");
                	   String numero= scan.next();
                	   int digitos[]=convierteAArray(numero, numero.length() );
                	   if (EsCapicua(digitos)){
                           System.out.println("El numero "+numero+" es capicua");
                       }else{
                           System.out.println("El numero "+numero+" no es capicua");
                       }
                       break;
                       
                
                   
                   case 6:
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
	public static int[] convierteAArray(String numero, int longitud){
		 
        int digitos[]=new int[longitud];
 
        for(int i=0;i<digitos.length;i++){
            digitos[i]=Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }
	
	 public static boolean EsCapicua (int lista[]){
		 
	       
	        int listaprueba[]=new int [lista.length];
	 
	        
	        for (int i=0, j=1;j<=lista.length;i++, j++){
	            listaprueba[i]=lista[lista.length-j];
	        }
	 
	        
	        if (Arrays.equals(lista, listaprueba)){
	            return true;
	        }
	 
	        return false;
	 
	    }
		
	}
	
	
	
	


