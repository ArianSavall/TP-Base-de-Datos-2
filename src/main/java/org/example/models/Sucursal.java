package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Sucursal extends JsonSerializer{
    private char[] nroPuntoVenta = new char[4];
    private List<Empleado> empleados;
    private Empleado encargado;

    public Sucursal(char[] nroPuntoVenta, Empleado encargado) throws Exception {
        setNroPuntoVenta(nroPuntoVenta);
        this.empleados = new ArrayList<>();
        this.encargado = encargado;
    }

    public char[] getNroPuntoVenta() {
        return nroPuntoVenta;
    }

    public void setNroPuntoVenta(char[] nroPuntoVenta) throws Exception{
        if (nroPuntoVenta == null || nroPuntoVenta.length != 4) {
            throw new Exception("El nro de punto de venta ingresado es inválido. Debe ser de 4 números.");
        }

        for (int i = 0; i<nroPuntoVenta.length;i++) {
            if (nroPuntoVenta[i] < '0' || nroPuntoVenta[i] > '9') {
                throw new Exception("Se debe escribir un número del 0000 al 9999.");
            }else{
                this.nroPuntoVenta[i] = nroPuntoVenta[i];
            }
        }
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

    public String formatNroPuntoVenta(){
        return (String.valueOf(nroPuntoVenta[0]) + String.valueOf(nroPuntoVenta[1]) + String.valueOf(nroPuntoVenta[2]) + String.valueOf(nroPuntoVenta[3]));
    }
}
