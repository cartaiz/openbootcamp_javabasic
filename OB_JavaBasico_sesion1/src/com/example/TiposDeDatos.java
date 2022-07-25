package com.example;

public class TiposDeDatos {

    public static void main(String[] args) {

        // Java es un lenguaje fuertemente tipado, siempre tenemos que especificar el tipo de dato
        // Las clases empiezan en mayúscula
        // Las variables empiezan en minúscula
        //Tipos de datos:
        // primitivos - empiezan en minúscula - no pueden tener un valor null (nulo)

        // 1. numéricos

        // 1.1 enteros
        byte variable1 = 5;
        System.out.println(variable1);
        short variable2 = 10;
        System.out.println(variable2);
        int variable3 = 30;
        System.out.println(variable3);
        long numeroTelefono = 677522100;
        System.out.println(numeroTelefono);

         // 1.2 decimales
        float variable5 = 5.5f;
        System.out.println(variable5);
        double precioSilla = 6.6d;
        System.out.println(precioSilla);

        // 2. booleano
        boolean variable7 = false;
        System.out.println(variable7);
        boolean variable8 = true;
        System.out.println(variable8);

        // 3. texto
        char variable9 = 'a';
        System.out.println(variable9);
        String variable10 = "Lorem ipsum..."; // String es una clase u objeto y por eso se escribe en mayúscula
        System.out.println(variable10);
        // palabras reservadas: no las podemos utilizar como nombres para nuestras variables

    }
}
