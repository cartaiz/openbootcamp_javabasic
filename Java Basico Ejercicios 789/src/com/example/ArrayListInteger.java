package com.example;
// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.
import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args) {

        ArrayList<Integer> listaArrayInt = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            listaArrayInt.add(i);
        }

        System.out.println("Lista original: " + listaArrayInt);

        for (int j = 0; j < listaArrayInt.size(); j++) {

            if (listaArrayInt.get(j) % 2 == 0) {
                listaArrayInt.remove(j);
            }
        }

        System.out.println("Lista menos números pares: " + listaArrayInt);
    }
}


