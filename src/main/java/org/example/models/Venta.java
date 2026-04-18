package org.example.models;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private int nroTicket;
    private LocalDate fecha;
    private METODO_PAGO metodoPago;
    private List<Producto> productos;
    private Cliente comprador;
    private Empleado empleadoAtendio;
    private Empleado empleadoCobro;
}
