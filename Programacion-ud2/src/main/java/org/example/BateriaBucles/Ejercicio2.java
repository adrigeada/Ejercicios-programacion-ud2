package org.example.BateriaBucles;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {

        //Imprime los números del N (introducido por el usuario) al 1 en orden descendente.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número");
        int n = teclado.nextInt();

       for (int i=n; i>0 ; i--){
           System.out.println(i);

       }
    }
}
