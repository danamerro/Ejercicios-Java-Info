package com.nivel3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ejercicio04 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Long> lista2;
        lista2 = palabras.stream()
                .distinct()
                .map(lis->LongStream.rangeClosed(1,lis)
                .reduce(1,(long a, long b)->a*b))
                .collect(Collectors.toList());
        System.out.println(lista2);
    }
}
/*-Debo crear una lista con objetos con atributos
    -generar un map<String,Integer> donde la clave del map será apellido concatenado con nombre y el value será la edad
    del alumno.

 */