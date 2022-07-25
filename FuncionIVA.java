package com.example;
// Crear una función que reciba un precio y devuelva el precio con el IVA incluido.

import java.util.Scanner;

public class FuncionIVA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un precio: ");

        double precio = scanner.nextDouble();

        double iva = precio * 0.21;

        double precioFinal = getPrecioFinal(precio, iva);

        System.out.println("El precio con IVA incluido es: " + precioFinal);
    }

    public static double getPrecioFinal(double precio, double iva) {
        return precio + iva;
    }




}
