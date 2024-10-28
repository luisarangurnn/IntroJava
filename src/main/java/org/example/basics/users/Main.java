package org.example.basics.users;

public class Main {

    public static void main(String[] args) {

        User user1 = new User( "leandra", "Garcia");
        User user2 = new User( "Pedro", "Perez");
        User user3 = new User( "Raul", "Quintero");


        User [] NewUsuarios = {user1, user2, user3};

        for (User usuarios : NewUsuarios) {
            System.out.println("Los nombres son " + usuarios);
        }
    }
    //utilizando un bucle, imprime los fullname de 3 usuarios diferentes


}
