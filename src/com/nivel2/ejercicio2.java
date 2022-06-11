package com.nivel2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList();
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("ingrese un numero");
            int numeroRequerido= scan.nextInt();
            numero.add(numeroRequerido);
        }
        for (int i:numero) {
            System.out.print(i+" ");
        }
        System.out.println("");
        int lengtViejo= numero.size();
        System.out.println(lengtViejo);
        System.out.println("ingrese el numero que va a ir al principio");
        int numeroPrincipioAgregado= scan.nextInt();
        numero.add(0,numeroPrincipioAgregado);
        System.out.println("ingrese el numero que va a ir al final");
        int numeroFinal= scan.nextInt();
        numero.add(numero.size(),numeroFinal);
        for (int i:numero) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println(numero.size());
        /* formas de iterar una lista
        for (int i =0;i < numero.size();i++){
            System.out.print(numero.get(i)+" ");
        }
        System.out.println(numero); */
    }
}
