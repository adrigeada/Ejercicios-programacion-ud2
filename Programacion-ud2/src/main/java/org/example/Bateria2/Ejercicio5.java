package org.example.Bateria2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe numero");
        int num = teclado.nextInt();

        for (int i = 0; i<=10; i++){
            System.out.println(i*num);


        }


    }
}
