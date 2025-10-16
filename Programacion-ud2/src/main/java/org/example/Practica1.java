package org.example;

import java.util.Scanner;

public class Practica1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fechanacimiento = teclado.nextLine();

        int longitud = fechanacimiento.length();
        if (longitud != 10){
            System.out.println("La fecha introducida tiene que tener 10 carácteres contando las barras");
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
            int mesint = 0; //inicializar las varables para poder usarlas fuera del trycatch
            int anyoint = 0;



            if (barratest1 == false || barratest2 == false){
                System.out.println("Recuerda usar barras para separar los datos introducidos");
            }else{
                try{
                    diaint = Integer.parseInt(dia);
                    mesint = Integer.parseInt(mes);
                    anyoint = Integer.parseInt(anyo);   //las paso a numero entero, si lo que hay en esa posicion no son numeros salta error, el try catch atrapa ese error
                }catch (Exception e){                       //el try catch controla el fallo de java y lo atrapa para poder poner un mensaje en vez de el fallo con letras rojas
                    System.out.println("El formato dd/mm/aaaa está mal introducido");
                }
                if (diaint <= 0 || diaint > 31){
                    System.out.println("Los días no pueden ser negativos o mayores que 31");
                } else if (mesint <= 0 || mesint > 12) {
                    System.out.println("Los meses no pueden ser negativos o mayores que 12");
                } else if (anyoint <= 1900 || anyoint > 2025) {
                    System.out.println("Año introducido incorrecto");
                }else {
                    //una vez comprobado que los datos introducidos entran dentro de nuestros parámetros podemos calcular el resultado
                    int resultado = diaint+mesint+anyoint;
                    System.out.println(diaint+"+"+mesint+"+"+anyoint+"="+resultado);

                    //transformar int resultado en string para poder separar los numeros

                    String resultado_string = Integer.toString(resultado);

                    //Separar los caracteres de resultado un diferentes Strings para luego transformarlos en numeros int

                    String millares = resultado_string.substring(0,1);
                    String centenas = resultado_string.substring(1,2);
                    String decenas = resultado_string.substring(2,3);
                    String unidades = resultado_string.substring(3);

                    //Transformar los string creados en numeros enteros para poder sumarlos

                    int millaresint = Integer.parseInt(millares);
                    int centenasint = Integer.parseInt(centenas);
                    int decenasint = Integer.parseInt(decenas);
                    int unidadesint = Integer.parseInt(unidades);

                    int resultadofinal = millaresint+centenasint+decenasint+unidadesint;

                    System.out.println(millares+"+"+centenas+"+"+decenas+"+"+unidades+"="+resultadofinal);


                }


            }

        }



















    }
}
