package org.example;

import java.util.Scanner;

public class Práctica2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double num1 = 0;
        double resultado = 0;
        double num2 = 0;

        System.out.println("Bienvenido a la calculadora rápida");
        System.out.println("Introduce el primer número");

        if (teclado.hasNextDouble()){
            num1 = teclado.nextDouble();
        }else {
            System.out.println("El formato tiene que ser numérico");
            return;
        }

        System.out.println("-----------------");
        System.out.println("[+]  -> Sumar");
        System.out.println("[-]  -> Restar");
        System.out.println("[x]  -> Multiplicar");
        System.out.println("[/]  -> Dividir");
        System.out.println("[R]  -> Raíz cuadrada");
        System.out.println("-----------------");
        System.out.println("Elige una operación");

        //Leemos el operador y lo pasamos a minúsculas
        String operador = teclado.next();
        String operador_min = operador.toLowerCase();
        //Creamos un booleano que diga true si el operador es r o R, false otra cosa
        boolean raiz = operador_min.equals("r");

        //si no es una r se pide y se lee el segundo número
        if (!raiz) {
            System.out.println("Introduce el segundo número");
            try {
                num2 = teclado.nextDouble();
            }catch (Exception e){
                System.out.println("El formato tiene que ser numérico");
                return;
            }
        }
        //si es una r se sale del if y sigue el programa

        //Usamos operador_min porque está pasado a minúsculas y no importará si la x y la r están en mayúsuclas
        switch (operador_min){
            case "+":
                resultado = num1+num2;
                System.out.println(resultado);
                break;

            case "-":
                resultado = num1-num2;
                System.out.println(resultado);
                break;

            case "x":
                resultado = num1*num2;
                System.out.println(resultado);
                break;

            case "/":
                if (num2 == 0){ //No se puede dividir entre 0, asi que hacemos un control por si el segundo numero es 0
                    System.out.println("No se puede dividir entre 0");
                }else {
                    resultado = num1/num2;
                    System.out.println(resultado);
                }
                break;

            case "r":
                if (num1 < 0){
                    System.out.println("Número imaginario");
                }else {
                    resultado = Math.sqrt(num1);
                    System.out.println(resultado);
                }
                break;

            default:
                System.out.println("No has elegido un operador vállido");
                break;
        }







    }
}
