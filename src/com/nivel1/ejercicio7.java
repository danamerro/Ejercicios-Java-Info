package com.nivel1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        int i,n;
        char c;
        String z="";
        for (i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c>=97&&c<=122){
                n=c-32;
                c=(char) n;
            }
            z=z+c;
        }
        System.out.println( s+" = "+ z);
        z="";
        for(i = 0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c >= 65 && c<= 90){
                n=c+32;
                c=(char) n;
            }
            z=z+c;
        }
    }
}
