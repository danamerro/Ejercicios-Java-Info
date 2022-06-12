package com.POO;

import java.util.HashSet;

public class main {
    public static void main(String[] args){
        HashSet<String> lista = new HashSet<>();
        lista.add("pepe");
        lista.add("casa");
        lista.add("flor");

        lista.add("casa");
        lista.add("perro");
        lista.add("pepe");

        System.out.println(lista);
    }
    
}
