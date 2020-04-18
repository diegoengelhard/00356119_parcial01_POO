package com.DER.x00356119;

import java.util.Scanner;

public class Main {
    static Scanner in =  new  Scanner(System.in);

    public static void main(String[] args) {
        // Declaracion de multiples variables
        String nombre, puesto;
        double salario;
        int mesesContrato, extension;

        try{
            // Input de datos de Servicio Profesional
            System.out.println("------ Servicio Profesional -------");
            System.out.print("Digite un Nombre: ");
            nombre = in.nextLine();
            System.out.print("Digite un Puesto: ");
            puesto = in.nextLine();
            System.out.print("Digite un Salario: $");
            salario = in.nextDouble(); in.nextLine();
            System.out.print("Digite los Meses de Contrato: ");
            mesesContrato = in.nextInt(); in.nextLine();

            // Instancia de objeto Servicio Profesional
            ServicioProfesional unServicio = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
            CalculadoraImpuestos.calcularPago(unServicio);

            // Impresion de datos de Servicio Profesional
            System.out.println("\nEmpleado: " + unServicio.getNombre() + "\n Puesto: " + unServicio.getPuesto()
             + "\nSalario: $" + unServicio.getSalario() + "\nMeses de Contrato: " + unServicio.getMesesContrato() + "\nImpuestos: " + CalculadoraImpuestos.mostrarTotales());


            // Input de datos de Plaza Fija
            System.out.println("\n\n------ Plaza Fija -------");
            System.out.print("Digite un Nombre: ");
            nombre = in.nextLine();
            System.out.print("Digite un Puesto: ");
            puesto = in.nextLine();
            System.out.print("Digite un Salario: $");
            salario = in.nextDouble(); in.nextLine();
            System.out.print("Digite su Extension: ");
            extension = in.nextInt(); in.nextLine();

            // Instancia de objeto Plaza Fija
            PlazaFIja unaPlaza = new PlazaFIja(nombre, puesto, salario, extension);
            CalculadoraImpuestos.calcularPago(unaPlaza);

            // Impresion de datos de Plaza Fija
            System.out.println("\nEmpleado: " + unaPlaza.getNombre() + "\nPuesto: " + unaPlaza.getPuesto()
                    + "\nSalario: $" + unaPlaza.getSalario() + "\nExtension: " + unaPlaza.getExtension() + "\nImpuestos: " + CalculadoraImpuestos.mostrarTotales());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
