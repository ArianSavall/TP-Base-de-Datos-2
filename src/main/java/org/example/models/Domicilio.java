package org.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class Domicilio extends JsonSerializer{
    private static long contadorId = 0;
    @SerializedName("_id")
    private long idDomicilio;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.idDomicilio = contadorId++;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

}
