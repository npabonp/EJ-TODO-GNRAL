/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdetodo;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado_TC{
    protected String lenguaje;

    public Programador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }
    
    public double calcular_salario(){
        double bonificacion = 0;
        if(this.lenguaje.equals("java")){
            bonificacion = this.salario*(0.2);
        }
        return this.salario + bonificacion;
    }

    @Override
    public String mostrarInfo() {
        return "Programador";
    }
    

}
