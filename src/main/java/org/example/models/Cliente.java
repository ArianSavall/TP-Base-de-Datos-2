package org.example.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Cliente extends JsonSerializer {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private int dni;

    public Cliente(String nombre, String apellido, Domicilio domicilio, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
    }


}
