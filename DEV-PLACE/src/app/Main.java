package app;



import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Password;

import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guarda la opcion del usuario
		
		
		
		
		while(!salir) {
			System.out.println("1. EJERCICIO: Buscar num primo");
			System.out.println("2. EJERCICIO: Contraseña");
			System.out.println("3. EJERCICIO: Calcula Salario");
			System.out.println("4. EJERCICIO: Adivinar Numero Aleatorio");
			System.out.println("5. EJERCICIO: Numero al azar");
			System.out.println("6. POO: GENERAR CONTRASEÑA ");
			
			try {
				System.out.println("Escribe una de las opciones");
		           opcion = scan.nextInt();
		           switch (opcion) {
                   case 1:
                	   System.out.println("Ingrese un Numero porfavor");
               			int numP = scan.nextInt();
               			
               			boolean cierto =numeroPrimo(numP);
               			
               			if (cierto==true) {
               				System.out.println("El numero " + numP + " es primo");
               			}else {
               				System.out.println("El numero " + numP + " no es primo");
               			}
                       break;
                   case 2:
                       
                       int cantidad =3;
                       boolean acierto =false;
                      
                       String contraseña;
                       String password;
                       
                       System.out.println("Introduce una contraseña");
                       password = scan.next();
                       
                       for (int i=0; !acierto && i< cantidad ;i++){
                           System.out.println("Introduce nuevamente la contraseña");
                           contraseña = scan.next();
                         
                           if(password.equals(contraseña)){
                        	   System.out.println("Felicitaciones, recordás tu contraseña"); 
                        	   acierto = true;
                           }else {
                        	   System.out.println("Tenes que ejercitar la Memoria");
                           }
                         }
                       
                       
                       break;
                       
                   case 3:
                	   int valorhora =0;
                	   int valorXhora;
                	   String nombre;
                	   int años =0;
                	   int horas =0;
                	   int antiguedad;
                	   
                	   int salario;
                       System.out.println("Ingresa Datos");
                       System.out.println("Ingresa valor hora");
                       valorhora =scan.nextInt();
                       System.out.println("Ingresa Nombre del empleado");
                       nombre = scan.next();
                       System.out.println("Años trabajados");
                       años = scan.nextInt();
                       System.out.println("Cantidad de horas trabajadas en el Mes");
                       horas= scan.nextInt();

                       valorXhora = Multiplicar(valorhora, horas);
                       
                       if(años>10) {
                    	   antiguedad = años*30;
                    	   salario = antiguedad + valorXhora;
                    	   
                       }else {
                    	   salario = valorXhora;
                       }
                       
                       System.out.println("Nombre :" + nombre );
                       System.out.println("Antiguedad " + años );
                       System.out.println("Total a Cobrar " + salario );

                       break;
                       
                       
                   case 4:
                	   
                	   int numAleatorio=0;
                	   int aleatorio =0;
                	   
                	   aleatorio =(int)(Math.random()*1001);
                	   System.out.println(aleatorio);
                	   do {
                		   System.out.println("Ingrese un Numero cualuiera comprendido entre 0 y 1000 porfavor");
             			    numAleatorio = scan.nextInt();
             			 
                         if(numAleatorio!=aleatorio) {
                       	   
                       	   if (numAleatorio>aleatorio) {
                       		   System.out.println("El numero ingresado es mas grande, intente de nuevo");
                       	   }else {
                       		   System.out.println("El numero ingreso es menor, intente de nuevo");
                       	   }
                          }
                   	  
                 	   }while(numAleatorio!=aleatorio);
                	   
                	   if(numAleatorio ==aleatorio) {
             				 System.out.println("felicitaciones has adivinado el numero");
             			 }
                	   
                       break;
                       
                       
                   case 5:
                	   int menor =0;
                  	   int mayor =0;
                  	   int sumaPositivo =0;
                  	   int sumaNegativo =0;
                  	   int num =0;
                  	   
                		
                	   
                	   do {
                		  
                		   
                		   if (menor>=num) {
              				 menor = num;
              			 }
              			 
                		   if(mayor<num) {
              				 mayor=num;
              			 }
              			 
                			 
                			
                			
                		if(num>=0) {
                			sumaPositivo+=num;
                		}else {
                			sumaNegativo+=num;
                		}
                		
                		 System.out.println("Ingrese un Numero porfavor");
              			 num = scan.nextInt();
                		
                	   }while(num!=-1);
                	  
                	   System.out.println("El menor numero introducido es: "+menor);
                	   System.out.println("El mayor numero introducido es: "+mayor);
                	   System.out.println("La suma de los numeros negativos es: "+sumaNegativo);
                	   System.out.println("La sumas de los numero positivos es: "+sumaPositivo);
                	  
              			 
                	   
                      
                       break;
                       
                
                   case 6:
               
                	   String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
                       int tamanio=Integer.parseInt(texto);
                 
                       texto=JOptionPane.showInputDialog("Introduce la longitud del password");
                       int longitud=Integer.parseInt(texto);
                 
                       //Creamos los arrays
                       Password listaPassword[]=new Password[tamanio];
                       boolean fortalezaPassword[]=new boolean[tamanio];
                 
                       
                       for(int i=0;i<listaPassword.length;i++){
                           listaPassword[i]=new Password(longitud);
                           fortalezaPassword[i]=listaPassword[i].esFuerte();
                           System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
                       }
               		
               		 
                	   break;
                   case 7:
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
	
	/*Pide un número por teclado e indica si es un número primo o no. Un número primo es
	aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que
	25 es divisible entre 5, sin embargo, 17 si es primo.*/
	
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
	
	/*Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
		Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
		acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
		recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
		ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
		presione una tecla, luego de esto se cerrará el programa.*/
	
	
	

	/*Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
	nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
	pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
	multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
	tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
	multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.*/
	
	public static int Multiplicar(int num1, int num2) {
		int resultado =0;
		
		resultado = num1*num2;
		
		return resultado;
	}
	
	
	}


