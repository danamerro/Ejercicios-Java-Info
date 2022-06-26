package com.nivel3.ejercicio5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(apellido, alumno.apellido) && Objects.equals(fechaDeNacimiento, alumno.fechaDeNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaDeNacimiento);
    }
    public int calcularEdad(){
         int hoy = Calendar.getInstance().getWeekYear();
         int edad= hoy - this.fechaDeNacimiento.getYear();
         return edad;
    }
}
