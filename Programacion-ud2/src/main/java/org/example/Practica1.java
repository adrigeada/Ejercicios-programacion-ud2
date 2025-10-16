package org.example;

import java.util.Scanner;

public class Practica1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fechanacimiento = teclado.nextLine();

        int longitud = fechanacimiento.length();
        if (longitud != 10){
            System.out.println("La fecha introducida tiene que tener 10 carácteres");
        }else {
            String dia = fechanacimiento.substring(0,2);  //Localizo las posiciones de dia mes y año
            String mes = fechanacimiento.substring(3,5);
            String anyo = fechanacimiento.substring(6,10);
            String barra1 = fechanacimiento.substring(2,3);
            String barra2 = fechanacimiento.substring(5,6);

            boolean barratest1 = barra1.equals("/"); //¿en el espacio de barra1 es /?
            boolean barratest2 = barra2.equals("/");
            System.out.println(barratest2);
            System.out.println(barratest1);
            int diaint = 0;
            int mesint = 0;
            int anyoint = 0;


            if (barratest1 == false || barratest2 == false){
                System.out.println("El formato está mal");
            }else{
                try{
                    diaint = Integer.parseInt(dia);
                    mesint = Integer.parseInt(mes);
                    anyoint = Integer.parseInt(anyo);       //las paso a numero entero, si lo que hay en esa posicion no son numeros salta error, el try catch controla ese error
                }catch (Exception e){                       //el try catch controla el fallo de java y lo atrapa para poder poner un mensaje en vez de el fallo con letras rojas
                    System.out.println("letras en el dia");
                }
                System.out.println(diaint);
                if (diaint <= 0 || diaint > 31){

                }





            }

        }



















    }
}
