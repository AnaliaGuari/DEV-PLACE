package com.company;
import java.lang.reflect.Array;


public class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public void ordenarFila(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void mostrarFila(String[] array){
        for (int i=0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }
}
