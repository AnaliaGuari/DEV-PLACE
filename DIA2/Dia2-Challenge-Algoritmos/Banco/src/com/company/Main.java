package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        String array[]={"Martinez", "Alonso", "Rock", "Gili", "Lazarte"};

        Empleado e1 = new Empleado("Franco");
        Administrador a1 = new Administrador("Gerardo");

        System.out.println("El empleado ordena a los clientes por cantidad de letras.");
        System.out.println("El Administrador ordena a los clientes alfabeticamente.\n");
        Scanner sc = new Scanner(System.in);
        int op;
        boolean exit = true;


        while(exit) {
            System.out.println("Quien va a ordenar a los clientes?\n 1.Empleado.\n 2.Administrador.\n 3. Salir.\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    e1.ordenarFila(array);
                    e1.mostrarFila(array);
                    break;
                case 2:
                    a1.ordenarFila(array);
                    a1.mostrarFila(array);
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }






    }
}
