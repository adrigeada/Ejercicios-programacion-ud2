package org.example;

public class Ejercicio3 {
    static void main() {
        //EJERCICIO 3. Programa que quite a una variable numérica N sus m últimas cifras.
        //Por ejemplo, si N = 123456 y m = 2, el nuevo valor de N será 1234.

        final int N = 123456;
        final int m = 2;

        String numero_a_string = Integer.toString(N);
        System.out.println(numero_a_string);

        String trozo = numero_a_string.substring(m);
        System.out.println(trozo);





    }
}
