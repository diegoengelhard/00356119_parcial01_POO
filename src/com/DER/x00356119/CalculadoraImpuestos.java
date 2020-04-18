package com.DER.x00356119;


public class CalculadoraImpuestos {
    // Atributos de la clase
    private static double totalRenta, totalISSS, totalAFP;

    // Constructor de la clase
    private CalculadoraImpuestos() {}

    public static double calcularPago(Empleado unEmpleado){
        double Renta = 0, ISSS, AFP, pagoEmpleado, restante;

        if(unEmpleado instanceof ServicioProfesional){
            Renta = 0.1 * unEmpleado.getSalario();
            totalRenta += Renta;
            pagoEmpleado = unEmpleado.getSalario() - Renta;
            return pagoEmpleado;
        }
        else if(unEmpleado instanceof PlazaFIja){
            AFP = 0.0625 * unEmpleado.getSalario();
            totalAFP += AFP;

            ISSS = 0.03 * unEmpleado.getSalario();
            totalISSS += ISSS;

            restante = unEmpleado.getSalario() - AFP - ISSS;

            if(restante >= 0.01 && restante <= 472.00)
                Renta = 0;
            else if(restante >= 472.01 && restante <= 895.24)
                Renta = 0.1 * (restante - 472) + 17.67;
            else if(restante >= 895.25 && restante <= 2038.10)
                Renta = 0.2 * (restante - 895.24) + 60;
            else if(restante >= 2038.11)
                Renta = 0.3 * (restante - 2038.10) + 288.57;

            totalRenta += Renta;
            pagoEmpleado = restante - Renta;

            return pagoEmpleado;
        }
        else
            return 0;
    }

    public static String mostrarTotales() {
        return "Datos Totales {" +
                "totalRenta = " + totalRenta +
                ", totalISSS = " + totalISSS +
                ", totalAFP = " + totalAFP +
                 '}';
    }
}
