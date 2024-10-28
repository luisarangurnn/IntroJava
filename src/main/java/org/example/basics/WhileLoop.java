package org.example.basics;

public class WhileLoop {
    public static void main(String[] args) {
        //Imprimir por consola los numeros de 5 a 1 usando while
        byte i = 5;
        while (i <= 10){
            System.out.println("Numeros=" + i);
            i++;
        }


//Imprimir por consola numeros impares de 5 a 10 usando while
        byte p = 5;
        while (p <= 10){
            if (p % 2 != 0){
            System.out.println("Numerosimpares=" + p);
            p++;
            }
        }
    }
}
