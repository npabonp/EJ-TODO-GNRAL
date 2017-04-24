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
public class Nomina {

    private ArrayList<Contrato> contratos;

    public Nomina() {
        this.contratos = new ArrayList<>();
    }

    public void adicionarContrato(Contrato contrato) {
        this.contratos.add(contrato);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Contrato contrato : contratos) {
            salarioTotal += contrato.calcular_salario();
        }
        return salarioTotal;
    }
    
    public void mostrarInfoGeneral(){
        String informacion= " ";
        for (Contrato contrato : contratos){
            informacion +=" "+contrato.mostrarInfo();
        }
    }
}
