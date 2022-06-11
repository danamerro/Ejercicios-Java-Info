package com.nivel1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ingrese un numero");
        Scanner scan= new Scanner(System.in);
        int numero1= scan.nextInt();
        System.out.println("Ingrese un numero");
        int numero2= scan.nextInt();
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        int division=numero1/numero2;
        int modulo=numero1%numero2;
        System.out.println("resultados\n"+numero1+"+"+numero2+"="+suma+"\n"+numero1+"-"+numero2+"="+resta+"\n"
                +numero1+"*"+numero2+"="+multiplicacion+"\n"+numero1+"/"+numero2+"="+division+"\n"
                +numero1+"%"+numero2+"="+modulo);



    }
}
