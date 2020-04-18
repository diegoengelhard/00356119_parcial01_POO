package com.DER.x00356119;

public class CalculadoraImpuestos {
    private double totalRenta, totalISSS, totalAFP;

    private CalculadoraImpuestos() {}

    public void calcularPago(Empleado unEmpleado){
        //cambiar void a double
    }

    public String mostrarTotales() {
        return "Datos Totales{" +
                "totalRenta=" + totalRenta +
                ", totalISSS=" + totalISSS +
                ", totalAFP=" + totalAFP +
                '}';
    }
}
