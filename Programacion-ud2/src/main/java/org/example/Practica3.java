package org.example;

import java.util.Scanner;

public class Practica3 {
    static void main() {
        //hay que hacer un menu 1. Validar ISBN 2. Reparar ISBN 3. Salir
        Scanner teclado = new Scanner(System.in);
        //Bloque variables
        String isbn = "a";
        int longitud = 0;
        char num = 'f';


        System.out.println("Introduce ISBN");

        isbn = teclado.nextLine();
        longitud = isbn.length();

        if (longitud != 10){
            System.out.println("El isbn tienen que ser 10 caracteres");
            return;
        }

//        boolean contiene = isbn.contains("?");

//        String uno = isbn.substring(0,1);
//        String dos = isbn.substring(1,2);
//        String tres = isbn.substring(2,3);
//        String cuatro = isbn.substring(3,4);
//        String cinco = isbn.substring(4,5);
//        String seis = isbn.substring(5,6);
//        String siete = isbn.substring(6,7);
//        String ocho = isbn.substring(7,8);
//        String nueve = isbn.substring(8,9);
//        String diez = isbn.substring(9);

        int numint=0;
        int resultado = 0;
        int resultadofinal=0;
        for (int i = 0,x=longitud; i<=9 ; i++,x--){
            num = isbn.charAt(i);
            numint = Integer.parseInt(String.valueOf(num));
            resultado = numint*x;
            System.out.println(num);
            System.out.println(resultado);
            resultadofinal += resultado;
            System.out.println(resultadofinal);
        }


//0201103311 prueba con este numero

    }
}
