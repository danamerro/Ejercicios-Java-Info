package com.nivel3;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class introduccion {
    public static void main(String[] args) {
        Collection<String> vocales= Arrays.asList("a","e","i","o","u");
        /*Collection<String> vocalesStream=
                vocales.stream()
                        .filter(x->x.equals("a")||x.equals("o"))
                        .collect(Collectors.toList());*/
        Collection<String> vocalesStream=
                vocales.stream().collect(Collectors.toList());
        System.out.println(vocalesStream);
    }
}
