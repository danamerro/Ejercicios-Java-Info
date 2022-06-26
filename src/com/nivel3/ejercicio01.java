package com.nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio01 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> listaNueva= palabras.stream()
                .filter(x->x!=null && x!="")
                .collect(Collectors.toList());
        System.out.println(listaNueva);

    }
}
