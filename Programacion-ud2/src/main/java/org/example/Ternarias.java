package org.example;

public class Ternarias {
    static void main() {
//        int a = 2, b = 3, c = 4;
//
//       int resultado = c-- == 4 && a > b ? a += b :
//                a++ > 0 && c == b ? a += c :
//                        b == c ? a++ : a--;
//
//        System.out.println(resultado);

        int a = 5;
        int b = 8;
        int c = 10;

        int resultado = a++ == 6 && b-- == 8 ? c + a++ == 10 ? c-- : a++ : a + c++  ;
        System.out.println(resultado);
        System.out.println(c);



    }
}
