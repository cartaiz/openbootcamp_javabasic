package com.example.estructurascontrol;
/**
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola
 */
public class EjercicioEstructurasControl {

    public static void main(String[] args) {

        String[] nombres = {"Carlos", "Juan", "Mar", "Sandra", "Abril"};

        for(String nombre : nombres) {
            System.out.print("Su nombre es " + nombre);
        }
    }
}
