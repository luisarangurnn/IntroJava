package org.example.basics;

public class Arrays {
    public static void main(String[] args) {
        //Definir Arrays de cinco numeros
        int[] numeros = {0, 1, 2, 3, 4};

        //Definir Arrays de cinco ciudades
        String[] ciudades= {"Valencia", "Castellon", "Málaga", "Huelin", "Madrid"};

        //Recorrer los array
        for (int numero : numeros ){
            System.out.println(numero);
        }
        for (String ciudad : ciudades ){
            System.out.println(ciudad);
        }
        System.out.println(java.util.Arrays.toString(ciudades));

    }
}
