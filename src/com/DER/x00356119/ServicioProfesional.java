package com.DER.x00356119;

public class ServicioProfesional extends Empleado{
    // Atributos de la clase
    private int mesesContrato;

    // Constructor de la clase
    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    // Getters & Setters
    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
