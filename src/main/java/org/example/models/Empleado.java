package org.example.models;

public class Empleado extends JsonSerializer{
    private String nombre;
    private String apellido;
    private int dni;
    private long cuil;
    private Domicilio domicilio;

    public Empleado(String nombre, String apellido, int dni, long cuil, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
        this.domicilio = domicilio;
    }

}
