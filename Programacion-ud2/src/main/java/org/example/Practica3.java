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
        int numint=0;
        int multiplicaciones = 0;
        int resultadofinal=0;

        System.out.println("Introduce ISBN");

        isbn = teclado.nextLine();
        longitud = isbn.length();

        if (longitud != 10){
            System.out.println("El isbn tienen que ser 10 caracteres");
            return;
        }

//        boolean contiene = isbn.contains("?");

        for (int i = 0,x=longitud; i<=9 ; i++,x--){ //Hola Patri, no se si se pueden meter 2 variables diferentes en el for porque no lo has explicado, pero es lo único que se me ha ocurrido y parece que funciona :/.No es chatgpt, se me ha ocurrido a mi
            num = isbn.charAt(i); //coge el caracter en la posicion i, cada vuelta la i sube una posicion, empieza en 0
            numint = Integer.parseInt(String.valueOf(num));//el caracter de la posicion i lo transforma a int para poder hacer operaciones con él
            multiplicaciones = numint*x; //x es la longitud del isbn (10), el numero sacado antes se multiplica por x en la primera vuelta, cada vuelta se resta 1.
//            System.out.println(num);
//            System.out.println(resultado);
            resultadofinal += multiplicaciones;//el resultado final es la suma de los resultados que dan las multiplicaciones
        }
        System.out.println(resultadofinal);
        if (resultadofinal%11 == 0){
            System.out.println("El isbn es válido");
        }else {
            System.out.println("Es isbn no es valido");
        }

//0201103311 prueba con este numero

    }
}
