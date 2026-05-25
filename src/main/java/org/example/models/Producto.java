package org.example.models;

public class Producto extends JsonSerializer{
    private int codigo;
    private TIPO tipo;
    private String descripcion;
    private float precio;
    private Laboratorio laboratorio;

    public Producto(int codigo, TIPO tipo, String descripcion, float precio, Laboratorio laboratorio) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.laboratorio = laboratorio;
    }
}
