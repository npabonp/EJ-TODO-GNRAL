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
public class Consultor implements Contrato{
    
    protected int id;
    protected String labor;

    public Consultor(int id, String labor) {
        this.id = id;
        this.labor = labor;
    }

    @Override
    public double calcular_salario() {
        return 200;
    }

    @Override
    public String mostrarInfo() {
        return "Consultor";
    }
    
    
    
}
