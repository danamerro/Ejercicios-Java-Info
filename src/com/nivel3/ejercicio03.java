package com.nivel3;

import java.util.List;
import java.util.stream.Collectors;

public class ejercicio03 {
    public static void main(String[] args) {
        List<String> palabras= List.of("Batman","Aquaman","Flash","Batgirl","Wonder Woman","brainiac");

        Long listaNueva= palabras.stream()
                .filter(x->x.startsWith("b")||x.startsWith("B"))
                .count();

        System.out.println(listaNueva);
    }
}
