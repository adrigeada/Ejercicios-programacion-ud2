package org.example.Bateria2;

import java.util.Scanner;

public class Ejercicio6_2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("escribe un numero");
        int factorial = teclado.nextInt();
        int resultado= 1;


        for (int i = 2; i<=factorial; i++){

        resultado = resultado*i;

        }
        System.out.println(resultado);




    }
}
