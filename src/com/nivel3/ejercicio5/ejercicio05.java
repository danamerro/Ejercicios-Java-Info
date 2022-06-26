package com.nivel3.ejercicio5;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ejercicio05 {
    public static void main(String[] args) {
        Alumno alumno1= new Alumno("pepe","gonzales", LocalDate.of(2000,5,10));
        Alumno alumno2= new Alumno("melisa","perez", LocalDate.of(1990,3,20));
        Alumno alumno3= new Alumno("dana","erro", LocalDate.of(2000,9,26));
        Alumno alumno4= new Alumno("melina","vallejos", LocalDate.of(2010,9,6));
        Alumno alumno5= new Alumno("cosme","fulanito", LocalDate.of(1970,4,5));

        List<Alumno> listaAlumnos= List.of(alumno1,alumno2,alumno3,alumno4,alumno5);

        Map<String,Integer> mapAlumno= listaAlumnos.stream()
                .collect(Collectors.toMap(x->x.getApellido()+" "+x.getNombre(),y->y.calcularEdad()));

        System.out.println(mapAlumno);
    }

}
