package org.scanner;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Has escrito: " + input );


        scanner.close();
    }
}
