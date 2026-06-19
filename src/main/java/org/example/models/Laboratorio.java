package org.example.models;

import com.google.gson.annotations.SerializedName;

public class Laboratorio extends JsonSerializer{
    private int codigo;
    private String nombre;

    public Laboratorio(String nombre) {
        this.nombre = nombre;
    }
}
