package com.nivel1;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Nombre y Apellido");
        Scanner scan= new Scanner(System.in);
        String nombreApellido= scan.nextLine();
        System.out.println("Edad");
        int edad= scan.nextInt();
        System.out.println("Direccion");
        String direccion= scan.next();
        System.out.println("Ciudad");
        String ciudad= scan.next();
        ciudad=scan.next();
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombreApellido);






    }
}
