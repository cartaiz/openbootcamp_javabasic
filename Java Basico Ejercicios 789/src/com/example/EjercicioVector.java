package com.example;
// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.
import java.util.Vector;

public class EjercicioVector {

    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");
        vector.add("Cinco");

        System.out.println("Datos iniciales del vector: " + vector);

        vector.remove(2);
        vector.remove(1);


        System.out.println("Eliminamos el 2º y 3º elemento: " + vector);
    }
}

/* Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
si tuviésemos 1000 elementos para ser añadidos al mismo.
 */

// Se desperdicia memoria porque cada vez que ampliamos se duplican los arrays subyacentes.