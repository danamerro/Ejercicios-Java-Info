package com.nivel1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese su nombre");
        Scanner scan = new Scanner(System.in);
        String nombre= scan.nextLine();
        System.out.println("HOLA "+nombre+"!!!");
    }

}
