package com.example;
// Escribe el código que devuelva una cadena al revés.
// Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
import java.util.Scanner;

public class ReverseText {

    public static void main(String[] args) {

        System.out.println("----------- \n Cadena al Revés\n-----------");

        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto: ");
        texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();

        System.out.println(texto);
    }


}
