package com.nivel1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner scan = new Scanner(System.in);
        int numeroIngresadoPorUsuario = scan.nextInt();

        for(int i=1;i<=numeroIngresadoPorUsuario;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
}
