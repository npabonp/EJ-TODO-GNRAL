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
public class Administrador extends Empleado_TC {

    public Administrador(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    public double calcular_salario() {
        return 200;
    }
    
    public String mostrarInfo(){
        return "Administrador";
    }
    
}
