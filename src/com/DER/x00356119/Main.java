package com.DER.x00356119;

import java.util.Scanner;

public class Main {
    static Scanner in =  new  Scanner(System.in);

    public static void main(String[] args) {
        String nombre, puesto;
        double salario;
        int mesesContrato, extension;

        try{
            System.out.println("------ Servicio Profesional -------");
            System.out.print("Digite un Nombre:");
            nombre = in.nextLine();
            System.out.print("Digite un Puesto:");
            puesto = in.nextLine();
            System.out.print("Digite un Salario:");
            salario = in.nextDouble(); in.nextLine();
            System.out.print("Digite los Meses de Contrato:");
            mesesContrato = in.nextInt(); in.nextLine();

            ServicioProfesional unServicio = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
            CalculadoraImpuestos.calcularPago(unServicio);
            System.out.println("\nEmpleado: " + unServicio.getNombre() + "\n Puesto: " + unServicio.getPuesto()
             + "\nSalario: " + unServicio.getSalario() + "Meses de Contrato: " + unServicio.getMesesContrato() + "Impuestos: " + CalculadoraImpuestos.mostrarTotales());


            System.out.println("\n\n------ Plaza Fija -------");
            System.out.print("Digite un Nombre:");
            nombre = in.nextLine();
            System.out.print("Digite un Puesto:");
            puesto = in.nextLine();
            System.out.print("Digite un Salario:");
            salario = in.nextDouble(); in.nextLine();
            System.out.print("Digite su Extension:");
            extension = in.nextInt(); in.nextLine();

            PlazaFIja unaPlaza = new PlazaFIja(nombre, puesto, salario, extension);
            CalculadoraImpuestos.calcularPago(unaPlaza);
            System.out.println("\nEmpleado: " + unaPlaza.getNombre() + "\n Puesto: " + unaPlaza.getPuesto()
                    + "\nSalario: " + unaPlaza.getSalario() + "Extension: " + unaPlaza.getExtension() + "Impuestos: " + CalculadoraImpuestos.mostrarTotales());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
