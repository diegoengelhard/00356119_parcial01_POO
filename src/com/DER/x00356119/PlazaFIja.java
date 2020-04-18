package com.DER.x00356119;

public class PlazaFIja extends Empleado{
    // Atributos de la clase
    private int extension;

    // Constructor de la clase
    public PlazaFIja(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    // Getters & Setters
    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
