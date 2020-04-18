package com.DER.x00356119;

public class PlazaFIja extends Empleado{
    private int extension;

    public PlazaFIja(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
