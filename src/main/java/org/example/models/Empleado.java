package org.example.models;

public class Empleado extends JsonSerializer{
    private String nombre;
    private String apellido;
    private int dni;
    private long cuil;
    private Domicilio domicilio;
    private ObraSocial obraSocial;


    public Empleado(String nombre, String apellido, int dni, long cuil, Domicilio domicilio, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
        this.domicilio = domicilio;
        this.obraSocial = obraSocial;
    }

}
