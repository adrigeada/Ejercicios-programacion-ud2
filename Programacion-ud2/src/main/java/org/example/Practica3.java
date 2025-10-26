package org.example;

import java.util.Scanner;

public class Practica3 {
    static void main() {
        //hay que hacer un menu 1. Validar ISBN 2. Reparar ISBN 3. Salir
        Scanner teclado = new Scanner(System.in);
        //Bloque variables
        String modo = "e";
        String isbn = "a";
        int longitud = 0;
        char num = 'f';
        int numint=0;
        int multiplicaciones = 0;
        int resultado=0;


//        System.out.println("Elige que quieres hacer:");
//        System.out.println("[1]    Validar ISBN");
//        System.out.println("[2]    Reparar ISBN");
//        System.out.println("[X]    Salir");
//        System.out.println("------------");
//
//        modo = teclado.next();
//
//        switch (modo.toLowerCase()){
//
//        }

        System.out.println("Introduce ISBN");

        isbn = teclado.nextLine();
        longitud = isbn.length();

        if (longitud != 10){
            System.out.println("El isbn tienen que ser 10 caracteres");
            return;
        }

//        boolean contiene = isbn.contains("?");

        for (int i = 0,x=longitud; i<=8 ; i++,x--){ //Hola Patri, no se si se pueden meter 2 variables diferentes en el for porque no lo has explicado, pero es lo único que se me ha ocurrido y parece que funciona :/.No es chatgpt, se me ha ocurrido a mi

            num = isbn.charAt(i); //coge el caracter en la posicion i, cada vuelta la i sube una posicion, empieza en 0. Llego hasta el 8 porque en la posicion 9 puede haber una x

            try {
                numint = Integer.parseInt(String.valueOf(num));//el caracter de la posicion i lo transforma a int para poder hacer operaciones con él
            }catch (Exception e){
                System.out.println("En el ISBN no pueden haber letras");
                return;
            }

            multiplicaciones = numint*x; //x es la longitud del isbn (10), el numero sacado antes se multiplica por x en la primera vuelta, cada vuelta se resta 1.
            resultado += multiplicaciones;//el resultado final es la suma de los resultados que dan las multiplicaciones
        }

        //Voy a controlar que el ultimo dígito del isbn puede ser una X. Entonces la x se sustituiría por 10. Se podría hacer con un replace de x por 10 y luego pasarlo a int, pero como el ultimo digito se multiplica por 1, solo lo sumo al resultado anterior.
        String digitofinal = isbn.toLowerCase().substring(9); //Cojo la ultima posicion del isbn y la paso a minusculas para no diferencias x de X
        boolean controlx = digitofinal.equals("x");                     //Hago un control con equals para ver si hay una x
        int resultadofinal = 0;
        int digitofinal_int= 0;

        if (controlx){                                                  //S
            resultadofinal = resultado + 10;
        }else {
            try {
                digitofinal_int = Integer.parseInt(digitofinal);
            }catch (Exception e){
                System.out.println("En el ultimo digito solo puede haber un número o una X");
                return;
            }

            resultadofinal = resultado + digitofinal_int;
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
