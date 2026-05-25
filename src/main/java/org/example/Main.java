package org.example;

import org.example.models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ==========================================
        // 1. DOMICILIOS (10)
        // ==========================================
        Domicilio dom1 = new Domicilio("Av. Cabildo", 1500, "Belgrano", "CABA");
        Domicilio dom2 = new Domicilio("San Martin", 320, "Quilmes", "Buenos Aires");
        Domicilio dom3 = new Domicilio("Rivadavia", 5500, "Caballito", "CABA");
        Domicilio dom4 = new Domicilio("Belgrano", 123, "Moron", "Buenos Aires");
        Domicilio dom5 = new Domicilio("Corrientes", 348, "Centro", "CABA");
        Domicilio dom6 = new Domicilio("Santa Fe", 2100, "Recoleta", "CABA");
        Domicilio dom7 = new Domicilio("Mitre", 450, "Avellaneda", "Buenos Aires");
        Domicilio dom8 = new Domicilio("Sarmiento", 999, "Lanús", "Buenos Aires");
        Domicilio dom9 = new Domicilio("Las Heras", 1020, "Palermo", "CABA");
        Domicilio dom10 = new Domicilio("Lavalle", 777, "Centro", "CABA");

        // ==========================================
        // 2. CLIENTES (5) - Usan domicilios del 1 al 5
        // ==========================================
        Cliente cli1 = new Cliente("Juan", "Perez", dom1, 30111222);
        Cliente cli2 = new Cliente("Maria", "Gomez", dom2, 31222333);
        Cliente cli3 = new Cliente("Carlos", "Lopez", dom3, 32333444);
        Cliente cli4 = new Cliente("Ana", "Martinez", dom4, 33444555);
        Cliente cli5 = new Cliente("Lucia", "Fernandez", dom5, 34555666);

        // ==========================================
        // 3. LABORATORIOS (2)
        // ==========================================
        Laboratorio lab1 = new Laboratorio("Bayer");
        Laboratorio lab2 = new Laboratorio("Roemmers");

        // ==========================================
        // 4. PRODUCTOS (10)
        // ==========================================
        Producto prod1 = new Producto(101, TIPO.MEDICINA, "Aspirina 500mg", 500.50f, lab1);
        Producto prod2 = new Producto(102, TIPO.MEDICINA, "Ibuprofeno 400mg", 800.00f, lab1);
        Producto prod3 = new Producto(103, TIPO.PERFUMERIA, "Shampoo Anticaspa", 1200.75f, lab2);
        Producto prod4 = new Producto(104, TIPO.MEDICINA, "Amoxicilina 500mg", 1500.00f, lab2);
        Producto prod5 = new Producto(105, TIPO.MEDICINA, "Paracetamol 1g", 650.25f, lab1);
        Producto prod6 = new Producto(106, TIPO.PERFUMERIA, "Desodorante en aerosol", 950.00f, lab2);
        Producto prod7 = new Producto(107, TIPO.MEDICINA, "Clonazepam 2mg", 2500.00f, lab1);
        Producto prod8 = new Producto(108, TIPO.MEDICINA, "Vitamina C", 1100.50f, lab2);
        Producto prod9 = new Producto(109, TIPO.PERFUMERIA, "Crema Hidratante", 3200.00f, lab1);
        Producto prod10 = new Producto(110, TIPO.MEDICINA, "Loratadina 10mg", 780.00f, lab2);


        // ==========================================
        // 5. EMPLEADOS (5) - Usan domicilios del 6 al 10
        // ==========================================
        Empleado emp1 = new Empleado("Roberto", "Sanchez", 25111222, 20251112228L, dom6);
        Empleado emp2 = new Empleado("Elena", "Diaz", 26222333, 27262223339L, dom7);
        Empleado emp3 = new Empleado("Mario", "Ruiz", 27333444, 20273334441L, dom8);
        Empleado emp4 = new Empleado("Sofía", "Castro", 28444555, 27284445552L, dom9);
        Empleado emp5 = new Empleado("Diego", "Alvarez", 29555666, 20295556663L, dom10);

        // ==========================================
        // 6. SUCURSALES (3)
        // Usamos el validador de char[] de 4 posiciones que vimos antes
        // ==========================================
        // Instanciamos con listas vacías y null temporalmente para romper la dependencia circular
        Sucursal suc1 = null;
        Sucursal suc2 = null;
        Sucursal suc3 = null;

        try{
            suc1 = new Sucursal(new char[]{'0','0','0','1'}, emp1);
            suc2 = new Sucursal(new char[]{'0','0','0','2'}, emp2);
            suc3 = new Sucursal(new char[]{'0','0','0','3'}, emp3);
        }catch(Exception e){
            e.printStackTrace();
        }

        // (Opcional) Aquí deberías usar los setters de Sucursal para asignar los empleados y el encargado
        suc1.getEmpleados().add(emp4);
        suc2.getEmpleados().add(emp4);
        suc3.getEmpleados().add(emp5);
        // ==========================================
        // 7. VENTAS (5)
        // ==========================================
        Venta venta1 = new Venta(
                LocalDate.now(),
                METODO_PAGO.EFECTIVO,
                Arrays.asList(prod1, prod5),
                cli1,
                suc1
        );

        Venta venta2 = new Venta(
                LocalDate.now().minusDays(1),
                METODO_PAGO.TARJETA,
                Arrays.asList(prod3, prod6, prod9),
                cli2,
                suc1
        );

        Venta venta3 = new Venta(
                LocalDate.now().minusDays(2),
                METODO_PAGO.DEBITO,
                Arrays.asList(prod2, prod4),
                cli3,
                suc2
        );

        Venta venta4 = new Venta(
                LocalDate.now().minusDays(5),
                METODO_PAGO.EFECTIVO,
                Arrays.asList(prod10, prod3, prod1),
                cli4,
                suc3
        );

        Venta venta5 = new Venta(
                LocalDate.now().minusWeeks(1),
                METODO_PAGO.TARJETA,
                Arrays.asList(prod7, prod8, prod1, prod2),
                cli5,
                suc3
        );

        System.out.println(venta5.convertirAJson());
    }
}