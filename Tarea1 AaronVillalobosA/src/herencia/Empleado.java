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
public class Empleado {
    private final int ANNO_ACTUAL = 2016;
    protected String nombre;
    protected int anoIngreso;
    protected double salarioBase;
    private int anosEmpresa;

    public Empleado(String nombre, int anoIngreso, double salarioBase) {
        this.nombre = nombre;
        this.anoIngreso = anoIngreso;
        this.salarioBase = salarioBase;
    }

    public Empleado() {
        this.nombre = "";
        this.anoIngreso = 0;
        this.salarioBase = 0.0;
    }

    public int getANNO_ACTUAL() {
        return ANNO_ACTUAL;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosEmpresa() {
        return anosEmpresa;
    }

    public void setAnosEmpresa(int anosEmpresa) {
        this.anosEmpresa = anosEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ANNO_ACTUAL=" + ANNO_ACTUAL + ", nombre=" + nombre + ", anoIngreso=" + anoIngreso + ", salarioBase=" + salarioBase + ", anosEmpresa=" + anosEmpresa + '}';
    }
    
    //METODOS DE CALCULO
    
    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void calcularAnosEmpresa(){
        this.anosEmpresa = this.ANNO_ACTUAL - this.anoIngreso;
    }
    
    
}
