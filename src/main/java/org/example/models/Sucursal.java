package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Sucursal extends JsonSerializer{
    private String nroPuntoVenta;
    private List<Empleado> empleados;
    private Empleado encargado;

    public Sucursal(String nroPuntoVenta, Empleado encargado) throws Exception {
        setNroPuntoVenta(nroPuntoVenta);
        this.empleados = new ArrayList<>();
        this.encargado = encargado;
    }

    public String getNroPuntoVenta() {
        return nroPuntoVenta;
    }

    public void setNroPuntoVenta(String nroPuntoVenta) throws Exception{
        if (nroPuntoVenta == null || nroPuntoVenta.length() != 4) {
            throw new Exception("El nro de punto de venta ingresado es inválido. Debe ser de 4 números.");
        }

        for (int i = 0; i<nroPuntoVenta.length();i++) {
            if (nroPuntoVenta.charAt(i) < '0' || nroPuntoVenta.charAt(i) > '9') {
                throw new Exception("Se debe escribir un número del 0000 al 9999.");
            }
        }

        this.nroPuntoVenta = nroPuntoVenta;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public void setEmpleados(List<Empleado> asList) {
    }
}
