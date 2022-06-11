package com.nivel1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner scan= new Scanner(System.in);
        int numero1= scan.nextInt();
        System.out.println("Ingrese un numero");
        int numero2= scan.nextInt();
        int resultado=1;
        if(numero1==0 && numero2==0) {
            System.out.println("No se puede capo");
        }
        else{
            for (int i= numero2; i!=0; i--){
                    resultado=resultado*numero1;
            }
            System.out.println("El resultado es: "+resultado);
        }

    }
}
