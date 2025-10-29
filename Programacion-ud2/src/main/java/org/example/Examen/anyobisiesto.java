package org.example.Examen;

import java.time.LocalDateTime;
import java.util.Scanner;

public class anyobisiesto {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        System.out.println("escribe año");
        int anyo = teclado.nextInt();
        int contador = 0;

        for (int i=anyo ; i<= anyo_actual; i++){

            if (anyo%4 == 0 && anyo%100 !=0){
//                System.out.println("bisiesto");
                contador++;
            } else if (anyo%4 == 0 && anyo%100 == 0 && anyo%400 == 0) {
//                System.out.println("Bisisesto");
                contador++;


            }else {
//                System.out.println("No bisiesto");
            }
            anyo++;
//            System.out.println(anyo);
//            System.out.println(contador);
        }
        System.out.println(contador);





    }




}
