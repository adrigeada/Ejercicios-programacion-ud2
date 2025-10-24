package org.example.Bateria2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe numero");
        int num = teclado.nextInt();

        for (int i = num, contador = 0, resultado = i*contador; resultado < i*10; contador++ ){
            System.out.println(i*contador);


        }


    }
}
