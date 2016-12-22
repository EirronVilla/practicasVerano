/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Vendedor extends Empleado{
    protected double ventas;
    private double salarioFinal;

    public Vendedor(String nombre, int anoIngreso, double salarioBase, double ventas) {
        super(nombre, anoIngreso, salarioBase);
        this.ventas = ventas;
        this.salarioFinal = salarioFinal;
    }

    public Vendedor() {
        super();
        ventas = 0.0;
        salarioFinal = 0.0;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "ventas=" + ventas + ", salarioFinal=" + salarioFinal + '}';
    }

    // METODOS DE CALCULO
    
    public void sumarVentas(double ventas){
        this.ventas += ventas;
    }
    
    public void calcularSalarioFinal(){
        this.salarioFinal = salarioBase + (ventas * 0.20);
    }
}
