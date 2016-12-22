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
public class Gerente extends Empleado {
    private double bonificacion;
    private double salarioFinal;

    public Gerente(String nombre, int anoIngreso, double salarioBase, double bonificacion) {
        super(nombre, anoIngreso, salarioBase);
        this.bonificacion = bonificacion;
    }

    public Gerente() {
        super();
        bonificacion = 0.0;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonificacion=" + bonificacion + ", salarioFinal=" + salarioFinal + '}';
    }
    
    // METODOS DE CALCULO
    
    public void sumarBonificacion(double bonificacion){
        this.bonificacion += bonificacion;
    }
    
    public void calcularSalarioFinal(){
        this.salarioFinal = this.salarioBase + this.bonificacion;
    }
}
