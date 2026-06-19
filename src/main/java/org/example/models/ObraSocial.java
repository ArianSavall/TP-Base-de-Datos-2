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

    public ObraSocial(String nombre) {
        this.nombre = nombre;
        this.clientesAfiliados = new ArrayList<>();
        this.empleadosAfiliados = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientesAfiliados() {
        return clientesAfiliados;
    }

    public List<Empleado> getEmpleadosAfiliados() {
        return empleadosAfiliados;
    }
}
