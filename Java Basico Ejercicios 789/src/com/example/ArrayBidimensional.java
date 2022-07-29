package com.example;
// Crea un array bidimensional de enteros y recórrelo,
// mostrando la posición y el valor de cada elemento en ambas dimensiones.
public class ArrayBidimensional {

    public static void main(String[] args) {

        int arrayBidi[][] = {{1, 2, 3, 4}, {10, 20, 30, 40}};

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Posición: i = " + i + ",j =" + j);
                System.out.println("Valor: " + arrayBidi[i][j]);
            }
        }


    }
}
