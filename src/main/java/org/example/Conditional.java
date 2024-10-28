package org.example;

public class Conditional {
    public static void main(String[] args){
        boolean isActive = true;

        //Imprimir el usuario si está activo
    if (isActive == true){
        System.out.println( "Sí está activo");
    }
        //Imprimir el usuario si no está activo
    else {
        System.out.println("No esta activo");
    }

    //Variable Edad usuario, minima memoria posible
        byte edad = 19;
        //imprimir el usuario es mayor de edad si tiene 18 o mas
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }
        //o es menor si tiene 17 o menos
        else {
            System.out.println("Es menor de edad"); }

    }
}
