/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdetodo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador {

    private ArrayList<Programador> equipo;

    public Lider(ArrayList<Programador> equipo, int id, String nombre, double salario) {
        super(id, nombre, salario);
        this.equipo = equipo;
    }

    public void adicionarProgramador(Programador programador) {
        this.equipo.add(programador);
    }

    public double calcular_salario() {
        double salarioTotal = this.calcular_salario();
        salarioTotal += (salarioTotal * (this.equipo.size() * 0.1));
        return salarioTotal;
    }

    public String mostrarInfo() {
        String informacion = this.mostrarInfo();
        informacion += "-- Equipo --- \n";
        for (Programador programador : equipo) {
            informacion += " " + programador.mostrarInfo();
        }
        return informacion;
    }
}
