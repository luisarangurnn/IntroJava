package org.example;

public class Strings {

    public static void main(String[] args){
        String name = "Luis";

        String surname = new String( "Aranguren");

        String mensaje = "Mi nombre es " + name + " " + surname;

        System.out.println(mensaje);

        if (name.equals("Luis")) {
            System.out.println("El nombre es Luis");
        }

        if (name.equalsIgnoreCase("luis")) {
            System.out.println("El nombre es Luis (Si importar mayuscula)");
        }

    }
}
