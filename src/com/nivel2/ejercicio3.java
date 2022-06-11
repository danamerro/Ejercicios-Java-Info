package com.nivel2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<>();
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(9);
        cartas.add(10);
        for (int i : cartas) {
            System.out.print(i + " ");
        }
        System.out.println("");
        Collections.reverse(cartas);
        for (int i : cartas) {
            System.out.print(i + " ");
        }
        System.out.println("");
        Collections.shuffle(cartas);
        for (int i : cartas) {
            System.out.print(i + " ");
        }
        System.out.println("");


    }
}