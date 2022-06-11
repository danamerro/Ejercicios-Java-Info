package com.nivel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese el nombre y apellido del alumno");
            String alumnoLista=scan.nextLine();
            alumnos.add(alumnoLista);
        }
        List<String>curso1=alumnos.subList(0,4);
        List<String>curso2=alumnos.subList(4,8);
        List<String>curso3=alumnos.subList(8,12);
        System.out.println("En el curso 1 van a estar"+curso1);
        System.out.println("En el curso 2 van a estar"+curso2);
        System.out.println("En el curso 3 van a estar"+curso3);
    }
}
