package org.example.Bateria2;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = teclado.next();
        int letras = palabra.length();
        for (int i=letras-1 ;i>=0 ;i--){        //i = 0 porque es la posicion inicial de la palabra.
            System.out.println(palabra.charAt(i));
        }


    }
}
