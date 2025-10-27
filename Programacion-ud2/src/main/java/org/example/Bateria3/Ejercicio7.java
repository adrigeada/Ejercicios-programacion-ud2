package org.example.Bateria3;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int secuencia = 0;
        int num1 = 0;
        int num2 = 1;
        int resultado = 0;

        System.out.println("introduce num");
        secuencia = teclado.nextInt();

        for (int i=1 ; i<= secuencia ; i++){

            System.out.println(num1);

            resultado = num1+num2;  
            num1 = num2;
            num2 = resultado;


        }


    }
}
