package com.company;

import java.util.Arrays;

public class Administrador {
    private String nombre;

    public Administrador(String nombre){
        this.nombre = nombre;
    }

    public void ordenarFila(String[] array) {
        Arrays.sort(array);
    }

    public void mostrarFila(String[] array){
        for (int i=0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }
}
