package org.example;

import java.util.Scanner;

public class Practica3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //Bloque variables
        String modo = "e";
        String isbn = "a";
        int longitud = 0;

        char num = 'f';
        int numint=0;
        int multiplicaciones = 0;
        int resultado=0;

        String digitofinal= "i";
        boolean controlx = true;
        int resultadofinal = 0;
        int digitofinal_int= 0;

        int r = 0;



        System.out.println("Elige que quieres hacer:");
        System.out.println("[1]    Validar ISBN");
        System.out.println("[2]    Reparar ISBN");
        System.out.println("[X]    Salir");
        System.out.println("------------");

        modo = teclado.nextLine();

        switch (modo.toLowerCase()){

            case "1":
                //Esta parte la queria poner fuera del switch case porque isbn y longitud se usan en los dos casos, pero al ponerla fuera el case X no me funcionaba correctamente
                System.out.println("Introduce ISBN");

                isbn = teclado.nextLine();
                longitud = isbn.length();

                if (longitud != 10){
                    System.out.println("El isbn tienen que ser 10 caracteres");
                    return;
                }


                for (int i = 0,x=longitud; i<=8 ; i++,x--){ //Hola Patri, no se si se pueden meter 2 variables diferentes en el for porque no lo has explicado, pero es lo único que se me ha ocurrido y parece que funciona :/.No es chatgpt, se me ha ocurrido a mi

                    num = isbn.charAt(i); //coge el caracter en la posicion i, cada vuelta la i sube una posicion, empieza en 0. Llego hasta el 8 porque en la posicion 9 puede haber una x que se controla fuera del for

                    try {
                        numint = Integer.parseInt(String.valueOf(num));//el caracter de la posicion i lo transforma a int para poder hacer operaciones con él
                    }catch (Exception e){
                        System.out.println("En el ISBN no pueden haber letras");
                        return;
                    }

                    multiplicaciones = numint*x; //x es la longitud del isbn (10), el numero sacado antes se multiplica por x en la primera vuelta, cada vuelta se resta 1 a x
                    resultado += multiplicaciones;//el resultado es la suma de los resultados que dan las multiplicaciones
                }

                //Voy a controlar que el ultimo dígito del isbn puede ser una X. Entonces la x se sustituiría por 10. Se podría hacer con un replace de x por 10 y luego pasarlo a int, pero como el ultimo digito se multiplica por 1, solo lo sumo al resultado anterior.

                digitofinal = isbn.toLowerCase().substring(9); //Cojo la ultima posicion del isbn y la paso a minusculas para no diferenciar x de X
                controlx = digitofinal.equals("x");                     //Hago un control con equals para ver si hay una x


                if (controlx){                                                  //Si el ultimo digito es una x, el resultado anterior se suma a 10, porque sería 10*1
                    resultadofinal = resultado + 10;
                }else {
                    try {                                                       //Si no es una x, se pasa a int y se suma al resultado anterior.
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

                break;

            case "2":

                System.out.println("Introduce ISBN");

                isbn = teclado.nextLine();
                longitud = isbn.length();

                if (longitud != 10){
                    System.out.println("El isbn tienen que ser 10 caracteres");
                    return;
                }

                int posicion_interrogacion= isbn.indexOf("?");
                int multinterrgogacion = 10 - posicion_interrogacion; //con esto calculo por que número hay que multiplicar el numero que debe estaría en la posicion de la interrogacion
                //Voy a reemplazar la interrogacion por 0. Esto me dará el resultado de sumar todas las multiplicaciones menos la del hueco de la interrogacion.
                String isbnarreglo = isbn.replace("?", "0");

                for (int i = 0,x=longitud; i<=8 ; i++,x--){

                    num = isbnarreglo.charAt(i);

                    try {
                        numint = Integer.parseInt(String.valueOf(num));
                    }catch (Exception e){
                        System.out.println("En el ISBN no pueden haber letras");
                        return;
                    }

                    multiplicaciones = numint*x;
                    resultado += multiplicaciones;

                }

                digitofinal = isbn.toLowerCase().substring(9);
                controlx = digitofinal.equals("x");

                if (controlx){
                    resultadofinal = resultado + 10;
                }else {
                    try {
                        digitofinal_int = Integer.parseInt(digitofinal);
                    }catch (Exception e){
                        System.out.println("En el ultimo digito solo puede haber un número o una X");
                        return;
                    }

                    resultadofinal = resultado + digitofinal_int;//En este caso el resultado final es la suma de todos las multiplicaciones menos la del hueco de la interrogacion
                }
                System.out.println(resultadofinal);

                for (r=0 ; r<=9 ; r++){

                    if ((resultadofinal + multinterrgogacion*r)%11 == 0){
                        System.out.println("El dígito que falta es " +r);
                    }
                    System.out.println(r);
                }
                
                break;

            case "x":
                System.out.println("¡Hasta pronto!");
                return;

            default:
                System.out.println("Acción elegida no válida");
                break;
        }






//0201103311 prueba con este numero

    }
}
