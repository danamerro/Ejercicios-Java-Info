package com.nivel2;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>(Arrays.asList(350, 345, 550, 600, 320));
        ArrayList<Integer> total = new ArrayList<Integer>();
        int totalFinal=0;
        for (int i = 0; i <horasTrabajadas.size(); i++) {
            total.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        for(int j =0;j<horasTrabajadas.size();j++){
            totalFinal+=total.get(j);
        }

        System.out.println(total);
        System.out.println("Total Final: "+totalFinal);




    }
}
