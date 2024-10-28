package org.example.basics;

public class ForLoop {
    public static void main(String[] args){


        for ( byte numero= 5; numero <= 10; numero++){
            System.out.println("Iteracion: " + numero);
        }


    //Imprimir solamente numeros pares
        for ( byte numerito= 5; numerito <= 10; numerito++){
            if (numerito % 2 == 0){
        System.out.println("numerito: " + numerito);}
    }
    }
}

