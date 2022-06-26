package com.nivel3;

import java.util.List;
import java.util.stream.Collectors;

public class ejercicio02 {
    public static void main(String[] args) {
        List<Integer> numeros= List.of(1,2,3,4,5);
        List<Integer> nuevosNumeros= numeros.stream().map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(nuevosNumeros);

    }
}
