package com.nivel2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("ingrese un numero");
            int numero1= scan.nextInt();
            System.out.println("ingrese un numero");
            int numero2= scan.nextInt();
            if(numero1<numero2){
                fizzBuzz(numero1,numero2);
                break;
            }
        }



    }
    public static void fizzBuzz(int numeroMenor, int numeroMayor){
        for (int i = numeroMenor; i <numeroMayor ; i++) {
            if (i % 2==0 && i%3==0){
                System.out.println("FizzBuzz");

            }else if(i %2 ==0 && i%3!=0){
                System.out.println("Fizz");

            }else if(i %3 ==0 && i%2!=0){
                System.out.println("Buzz");

            }else{
                System.out.println(i);
            }
        }

    }
}