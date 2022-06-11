package com.Introduccion;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\mauri\\Desktop\\INFO ETAPA 3\\JAVA\\EJERCICIOS\\NombresyApellidos.txt");
            Scanner myReader=new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }


    }
}
