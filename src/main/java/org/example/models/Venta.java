package org.example.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Venta extends JsonSerializer{
    private String nroTicket;
    private LocalDate fecha;
    private METODO_PAGO metodoPago;
    private List<Producto> productos;
    private Cliente comprador;
    private Sucursal sucursal;
    private Empleado empleadoAtendio;
    private Empleado empleadoCobro;

    public Venta(LocalDate fecha, METODO_PAGO metodoPago, List<Producto> productos, Cliente comprador, Sucursal sucursal) {
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.productos = productos;
        this.comprador = comprador;
        this.sucursal = sucursal;
        this.empleadoAtendio = sucursal.getEmpleados().get((new Random()).nextInt(this.sucursal.getEmpleados().size()));
        this.empleadoCobro = sucursal.getEmpleados().get((new Random()).nextInt(this.sucursal.getEmpleados().size()));
        generarNroTicket();
    }

    private void generarNroTicket(){
        this.nroTicket = this.sucursal.getNroPuntoVenta() + "-" + (new Random()).nextInt(10000);
    }

    public String getNroTicket() {
        return nroTicket;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public METODO_PAGO getMetodoPago() {
        return metodoPago;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Empleado getEmpleadoAtendio() {
        return empleadoAtendio;
    }

    public Empleado getEmpleadoCobro() {
        return empleadoCobro;
    }
}
