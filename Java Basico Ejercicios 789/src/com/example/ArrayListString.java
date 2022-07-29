package com.example;
// Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
// Recorre ambos mostrando únicamente el valor de cada elemento.
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {

    public static void main(String[] args) {

        ArrayList<String> listaArray = new ArrayList<String>();
        listaArray.add("Elemento A");
        listaArray.add("Elemento B");
        listaArray.add("Elemento C");
        listaArray.add("Elemento D");

        System.out.println(listaArray);

        LinkedList<String> listaLinked = new LinkedList<String>();

        for (int i = 0; i < listaArray.size(); i++) {
            listaLinked.add(i, listaArray.get(i));
        }

        System.out.println("Elementos del Array:");
        for (String elementos : listaArray) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList:");
        for (String elementos : listaLinked) {
            System.out.print(elementos + " ");
        }

    }
}
