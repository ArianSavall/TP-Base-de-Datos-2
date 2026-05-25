package org.example.models;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ObraSocial extends JsonSerializer{
    @SerializedName("_id")
    private int codigo;
    private String nombre;
    private List<Cliente> clientesAfiliados;
    private List<Empleado> empleadosAfiliados;
    //private List<Persona> afiliados; OTRA POSIBLE FORMA DE HACERLO


    public ObraSocial(String nombre) {
        this.nombre = nombre;
        this.clientesAfiliados = new ArrayList<>();
        this.empleadosAfiliados = new ArrayList<>();
    }
}
