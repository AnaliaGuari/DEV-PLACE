package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guarda la opcion del usuario
		
		//AHORCADO
		final int puntuacionSuperar = 3;
		final int cantErrores = 6;
		final int cantJugadores = 2;	
		final int cantCaracteres = 26;
		
		String jugador[]= new String[cantJugadores];
		int puntos[] = new int[cantJugadores];
		int turno =0, numeroErrores = cantErrores;
		String palabraElegida, pista, palabraAdivinar, palabraUsuario;
        char abecedario[] = generaCaracteres(); // Genera in array con los caracteres de A-Z, no se incluye la ñ
        boolean caracteresInsertados[] = new boolean[cantCaracteres];
        
        
        Stack<String> pila1 = new Stack<String>();
		
		while(!salir) {
			System.out.println("1. EJERCICIO: Paises");
			System.out.println("2. EJERCICIO: Juego Ahorcado");
			System.out.println("3. EJERCICIO: promedio de tres notas");
			System.out.println("4. EJERCICIO: el mayor y el menor de tres valores");
			System.out.println("5. EJERCICIO: es capicúa");
			
			
			try {
				System.out.println("Escribe una de las opciones");
		           opcion = scan.nextInt();
		           switch (opcion) {
                   case 1:
                	   
                	   String [][] arrayMulti =new String[4][4];
           	        String ax="";
           	        

           	        for (int i=0;i<4;i++){
           	            System.out.print("Introduce el nombre del pais "+(i+1)+" : ");
           	            arrayMulti[i][0] = scan.nextLine()+":";         
           	        }
           	        for (int j=0;j<4;j++){
           	            for (int i=1;i<4;i++){
           	                System.out.print("Introduce el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
           	                arrayMulti[j][i] = scan.nextLine();             
           	            }
           	        }
           	        for(int i=0; i<4; i++){
           	            for(int j=0; j<4; j++){
           	                ax+= arrayMulti[i][j]+"   ";
           	            }
           	            ax+="\n";
           	        }
           	        System.out.print(ax);
               				
                       break;
                   case 2:
                      
                	   for (int i = 0; i < jugador.length; i++) {
                           jugador[i] = pedirString(scan, "Escribe el nombre del jugador " + (i + 1));
                       }
                	   while (!fin(puntos, puntuacionSuperar)) {
                		   
                           //Validamos la palabra y la pista
                           palabraElegida = validar(scan,
                                   "Escribe una palabra con solo caracteres y sin espacios, Jugador: " + jugador[turno],
                                   "Error, escribe palabra con solo caracteres y sin espacios y de longitud de mas de 1");
                
                           pista = validar(scan,
                                   "Escribe una pista con solo caracteres y sin espacios, Jugador: " + jugador[turno],
                                   "Error, escribe pista con solo caracteres y sin espacios");
                
                           espacios(30); //añadimos espacios para que el otro jugador no vea
                           //rellenamos la palabraAdivinar con guiones
                           palabraAdivinar = rellenaGuiones(palabraElegida); 
                
                           //ahora toca adivinar la palabra
                           while (!palabraCorrecta(palabraElegida, palabraAdivinar) && numeroErrores > 0) {
                
                               //mostamos la pista, la palabra y los repetidos
                               System.out.println("Pista: " + pista);
                               mostrarPalabra(palabraAdivinar);
                               mostrarRepetidos(abecedario, caracteresInsertados);
                
                               //el jugador escribe
                               palabraUsuario = pedirString(scan, "Escribe una letra, si escribes una palabra "
                                       + "sera como escribir la solucion, Jugador: " + jugador[turno]).toLowerCase();
                
                             
                               if (palabraUsuario.length() == 1) {
                
                                   if (Character.isAlphabetic(palabraUsuario.charAt(0))) {
                
                                       if (caracterIntroducido(caracteresInsertados, palabraUsuario.charAt(0))) {
                                           System.out.println("El caracter ya esta puesto, elige otro");
                                       } else if (numRemplazos(palabraElegida, palabraUsuario.charAt(0)) > 0) {
                                           palabraAdivinar = remplazar(palabraElegida, palabraAdivinar, palabraUsuario.charAt(0));
                                       } else {
                                           numeroErrores--;
                                           System.out.println("Error, te quedan " + numeroErrores + " errores");
                                       }
                                       actualizarInsertados(caracteresInsertados, palabraUsuario.charAt(0));
                                   }
                
                                   //si es mas de una letra, el jugador quiere intentar adivinarlo
                               } else if (!palabraCorrecta(palabraElegida, palabraUsuario)) {
                                   numeroErrores--;
                                   System.out.println("Error, no es la palabra correcta");
                               } else {
                                   //Si entramos aqui, significa que la plabra es correcta, 
                                   //necesitamos asignar la palabra del usuario a la de adivinar
                                   //Otra solucion podria ser poner en la condicion otra llamada 
                                   //al metodo palabraCorrecta
                                   palabraAdivinar = palabraUsuario;
                                   System.out.println("Correcto, has acertado");
                               }
                           }
                         //Si el numero de errores es mayor que cero, significa que hemos acertado la palabra
                           if (numeroErrores > 0) {
                               //Suma puntos el resto de jugadores y se cambia el turno
                               sumaPuntosOtroJugador(puntos, 1, turno);
                               turno = cambiaTurno(turno, jugador.length - 1);
                           } else {
                               //el usuario que puso la palabra suma un punto y continua escribiendo la palabra
                               puntos[turno]++;
                           }
                
                           //Mostramos las puntuaciones de los jugadores
                           mostrarPuntuaciones(jugador, puntos);
                
                           //reiniciamos los errores y los caracteres insertados
                           numeroErrores = cantErrores;
                           actualizarInsertados(caracteresInsertados);
                
                       }
                
                       //Indicamos el ganador
                       mostrarGanador(puntos, jugador, puntuacionSuperar);
                
                       System.out.println("Fin");
                              
                       
                    
                                      
                       break;
                       
                   case 3:
                	   
                       break;
                       
                       
                   case 4:
                	   System.out.println("Insertamos tres elementos en la pila: tomi, ana y daniela");
                       pila1.push("tomi");
                       pila1.push("ana");
                       pila1.push("daniela");
                       System.out.println("Cantidad de elementos en la pila:" + pila1.size());
                       System.out.println("Extraemos un elemento de la pila:" + pila1.pop());
                       System.out.println("Cantidad de elementos en la pila:" + pila1.size());
                       System.out.println("Consultamos el primer elemento de la pila sin extraerlo:" + pila1.peek());
                       System.out.println("Cantidad de elementos en la pila:" + pila1.size());
                       System.out.println("Extraemos uno a un cada elemento de la pila mientras no este vacía:");
                       while (!pila1.isEmpty())
                           System.out.print(pila1.pop() + "-");
                       System.out.println();

                       Stack<Integer> pila2 = new Stack<Integer>();
                       pila2.push(70);
                       pila2.push(120);
                       pila2.push(6);
                       System.out.println("Borramos toda la pila");
                       pila2.clear();
                       System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());
                	   
                	   
                       break;
                       
                       
                   case 5:
                	  
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
	public static char[] generaCaracteres() {
		 
        char[] caracteres = new char[26];
        for (int i = 0, j = 97; i < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
 
        return caracteres;
 
    }
	
	public static String pedirString(Scanner sn, String mensaje) {
		 
        System.out.println(mensaje);
        return sn.next();
 
    }
	
	public static boolean fin(int puntos[], int puntuacionSuperar) {
		 
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] >= puntuacionSuperar) {
                return true;
            }
        }
 
        return false;
 
    }
	
	 public static boolean comprobarAlfabeticos(String cadena) {
		 
	        char caracter;
	 
	        for (int i = 0; i < cadena.length(); i++) {
	            caracter = cadena.charAt(i);
	            if (!Character.isAlphabetic(caracter)) {
	                return true;
	            }
	        }
	 
	        return false;
	 
	    }
	 public static boolean fin1(int puntos[], int puntuacionSuperar) {
		 
	        for (int i = 0; i < puntos.length; i++) {
	            if (puntos[i] >= puntuacionSuperar) {
	                return true;
	            }
	        }
	 
	        return false;
	 
	    }
	 public static String validar(Scanner sn, String mensaje, String mensajeError) {
		 
	        String palabra;
	        boolean correcto;
	        do {
	            correcto=true;
	            palabra = pedirString(sn, mensaje).toLowerCase();
	             
	            if (comprobarAlfabeticos(palabra) || palabra.length() <= 1) {
	                System.out.println(mensajeError);
	                correcto=false;
	            }
	 
	        } while (!correcto);
	 
	        return palabra;
	    }
	 
	 public static void espacios(int numSaltos) {
		 
	        for (int i = 0; i < numSaltos; i++) {
	            System.out.println("");
	        }
	    }
	 
	  
	  // Crea una nueva cadena con guiones para el juego
	  
	    public static String rellenaGuiones(String cadena) {
	 
	        String palabra = "";
	        for (int i = 0; i < cadena.length(); i++) {
	            palabra += "_"; //le pongo el guion
	        }
	 
	        return palabra;
	    }
	 
	   //Muestro una palabra con espacios entre sus caracteres
	   
	    public static void mostrarPalabra(String cadena) {
	 
	        for (int i = 0; i < cadena.length(); i++) {
	            System.out.print(cadena.charAt(i) + " ");
	        }
	 
	        System.out.println("");
	 
	    }
	 
	   // Indica si la palabra insertada por el usuario es correcta
	    
	    public static boolean palabraCorrecta(String palabraOriginal, String palabraUsuario) {
	 
	        return palabraOriginal.equals(palabraUsuario);
	 
	    }
	 
	    // Muestra las palabras que hemos repetido durante el turno de un jugador
	    
	    public static void mostrarRepetidos(char[] abecedario, boolean insertados[]) {
	 
	        System.out.print("Repetidas: ");
	        for (int i = 0; i < insertados.length; i++) {
	            
	            if (insertados[i]) {
	                System.out.print(abecedario[i]);
	            }

	        }
	        System.out.println("");
	    }
	 
	  
	  //    Suma puntos a todos los jugadores excepto a uno
	     
	    public static void sumaPuntosOtroJugador(int[] puntos, int puntosSuperar, int pos_excluida) {
	 
	        for (int i = 0; i < puntos.length; i++) {
	            if (i != pos_excluida) {
	                puntos[i]++;
	            }
	 
	        }
	    }
	 
	    /**
	     * Indica el numero de remplazos a realizar
	     *
	     * @param cadenaOriginal
	     * @param caracter
	     * @return numero de remplazos a realizar
	     */
	    public static int numRemplazos(String cadenaOriginal, char caracter) {
	 
	        int remplazos = 0;
	        char caracterCadena;
	        for (int i = 0; i < cadenaOriginal.length(); i++) {
	            caracterCadena = cadenaOriginal.charAt(i);
	            if (caracterCadena == caracter) {
	                remplazos++;
	            }
	        }
	        return remplazos;
	 
	    }
	 
	    /**
	     * Remplaza los guiones con el caracter dado
	     *
	     * @param cadenaOriginal
	     * @param cadenaRemplazar
	     * @param caracter
	     * @return cadena con guiones remplazados
	     */
	    public static String remplazar(String cadenaOriginal, String cadenaRemplazar, char caracter) {
	 
	        String cadenaRemplazo = "";
	        char caracterCadena;
	        for (int i = 0; i < cadenaOriginal.length(); i++) {
	            caracterCadena = cadenaOriginal.charAt(i);
	 
	            if (caracterCadena == caracter) {
	                cadenaRemplazo += caracter;
	            } else {
	                cadenaRemplazo += cadenaRemplazar.charAt(i);
	            }
	        }
	        return cadenaRemplazo;
	 
	    }
	 
	    /**
	     *
	     * @param insertados
	     * @param caracter
	     * @return
	     */
	    public static boolean caracterIntroducido(boolean[] insertados, char caracter) {
	        return insertados[caracter - 'a'];
	    }
	 
	    public static void actualizarInsertados(boolean[] insertados, char caracter) {
	 
	        insertados[caracter - 'a'] = true;
	 
	    }
	 
	    /**
	     * Cambia el turno del jugador, si llega al final, empieza de cero
	     *
	     * @param turnoActual
	     * @param limite
	     * @return turno del jugador actual
	     */
	    public static int cambiaTurno(int turnoActual, int limite) {
	 
	        if (turnoActual == limite) {
	            return 0;
	        } else {
	            return ++turnoActual; //importante que sea pre-incremento
	        }
	 
	    }
	 
	    /**
	     * Muestra las puntuaciones de los jugadores
	     *
	     * @param jugadores
	     * @param puntos
	     */
	    public static void mostrarPuntuaciones(String[] jugadores, int[] puntos) {
	 
	        for (int i = 0; i < jugadores.length; i++) {
	            System.out.println(jugadores[i] + ": " + puntos[i] + " puntos");
	        }
	        System.out.println("");
	    }
	 
	    /**
	     * Muestra al ganador del juego
	     *
	     * @param puntos
	     * @param jugadores
	     * @param puntosSuperar
	     */
	    public static void mostrarGanador(int[] puntos, String jugadores[], int puntosSuperar) {
	 
	        int indiceGanador = 0;
	        for (int i = 0; i < puntos.length; i++) {
	            if (puntos[i] >= puntosSuperar) {
	                indiceGanador = i; //obtenemos el indice
	                break;
	            }
	        }
	 
	        System.out.println("El ganador es " + jugadores[indiceGanador]);
	 
	    }
	 
	    /**
	     * Reiniciamos los caracteres insertados
	    
	     */
	    public static void actualizarInsertados(boolean insertados[]) {
	 
	        for (int i = 0; i < insertados.length; i++) {
	            insertados[i] = false;
	        }
	 
	    }
	 
	 
}
