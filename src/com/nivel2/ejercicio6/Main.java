package com.nivel2.ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("dana","erro",123456,8,40);
        Empleado empleado2= new Empleado("adriel","erro",654321,7,35);
        Empleado empleado3= new Empleado("melina","vallejos",789456,9,45);
        Empleado empleado4= new Empleado("mauricio","gutierrez",789123,10,50);

        HashSet<Empleado> listaEmpleados=new HashSet<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        //el primer Integer es el key(dni) y el 2do es el value(calcularSueldo)
        Map<Integer,Integer> mapaEmpleado= new HashMap<>();
        //la e hace referencia a la i para guardar el objeto(empleado1,empleado2,etc)
        for (Empleado e:listaEmpleados) {
            mapaEmpleado.put(e.getDni(),e.calcularSueldo());
        }

        System.out.println(mapaEmpleado);
    }

}
