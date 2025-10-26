package org.example;

import java.util.Scanner;

public class Practica3_1 {
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
        int resultadofinal = 0;

        String digitofinal= "i";
        boolean controlx = true;
        int digitofinal_int= 0;
        String isbnarreglo = "o";
        int multinterrgogacion = 0;

        int r = 0;


        System.out.println("Elige que quieres hacer:");
        System.out.println("[1]    Validar ISBN");
        System.out.println("[2]    Reparar ISBN");
        System.out.println("[X]    Salir");
        System.out.println("------------");

        //El modo para salir no lo he puesto dentro del switch case, porque sino siempre te iba a pedir que escribas el isbn aunque quieras salir.
        //Esta parte te hace salir del programa si al elegir modo escribe x o X. Pero si pone algo que no sea uno de los modos te sigue pidiendo el isbn. No se como arreglar eso :/
        modo = teclado.nextLine();
        boolean modox = modo.equalsIgnoreCase("x");
        if (modox){
            System.out.println("¡Hasta pronto!");
            return;
        }

        System.out.println("Introduce ISBN");
        isbn = teclado.nextLine();
        longitud = isbn.length();

        //Controlamos que el isbn tenga una longitud de 10 caracteres. Si no, se sale del programa
        if (longitud != 10){
            System.out.println("El isbn tienen que ser 10 caracteres");
            return;
        }

        //Si el isbn tiene una interrogación, la interrogación se va a cambiar por un 0. Y a partir de ese momento se usará el isbn con la sustitución por 0 en el resto del programa
        boolean isbninterrogacion = isbn.contains("?");
        if (isbninterrogacion){

            int posicion_interrogacion= isbn.indexOf("?");

            multinterrgogacion = 10 - posicion_interrogacion; //con esto calculo por que número hay que multiplicar al numero que estaría en la posicion de la interrogacion. Lo usaremos mas tarde para encontrar el numero por el que se intercambia la ?
            //Voy a reemplazar la interrogacion por 0. Esto me dará el resultado de sumar todas las multiplicaciones menos la del hueco de la interrogacion.
            isbnarreglo = isbn.replace("?", "0");
            isbn = isbnarreglo;
        }

        for (int i = 0,x=longitud; i<=8 ; i++,x--){ //Hola Patri, no se si se pueden meter 2 variables diferentes en el for porque no lo has explicado, pero es lo único que se me ha ocurrido y parece que funciona :/.No es chatgpt, se me ha ocurrido a mi

            num = isbn.charAt(i); //coge el caracter en la posicion i, cada vuelta la i sube una posicion, empieza en 0. Llego hasta el 8 porque en la posicion 9 puede haber una x que se controla fuera del for

            try {
                numint = Integer.parseInt(String.valueOf(num));//el caracter de la posicion i lo transforma a int para poder hacer operaciones con él. Si habia una ?, esta se ha cambiado por un 0 asi que no da error
            }catch (Exception e){
                System.out.println("En el ISBN no pueden haber letras");
                return;
            }

            multiplicaciones = numint*x; //x es la longitud del isbn (10), el numero sacado antes se multiplica por x en la primera vuelta, cada vuelta se resta 1 a x
            resultado += multiplicaciones; //el resultado es la suma de los resultados que dan las multiplicaciones
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

            resultadofinal = resultado + digitofinal_int; //Se suma el ultimo digito a la suma de las multiplicaciones anteriores
        }

        switch (modo){

            //En el modo 1 probamos que si el resto de dividir el resultado final es 0, el isbn es válido, si es diferente a 0, el isbn no es valido
            case "1":

                System.out.println(resultadofinal);
                if (resultadofinal%11 == 0){
                    System.out.println("El isbn es válido");
                }else {
                    System.out.println("Es isbn no es valido");
                }

                break;

                //En el caso 2 hacemos un bucle para encontrar el numero por el que se tiene que multiplicar para que el resto de 0
            case "2":

                for (r=0 ; r<=9 ; r++){ //probamos con numeros del 0 al 9

                    //En este caso el resultado final es al que se le ha sustituido la ? por 0. Como hemos encontrado el hueco donde estaba la ? sabemos por que numero tenemos que multiplicar el numero r que estamos buscando
                    if ((resultadofinal + multinterrgogacion*r)%11 == 0){  //Cuando el resto de esta operación de 0, salta el mensaje
                        System.out.println("El dígito que falta es " +r);
                    }
                    System.out.println(r);
                }

                break;


            default:
                System.out.println("Acción elegida no válida");
                break;
        }


    }
}
