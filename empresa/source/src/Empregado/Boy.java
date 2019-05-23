/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado;

/**
 *
 * @author mackleaps
 */
public class Boy extends EmpregadoComAdicional {

    public Boy(int id, int departamento, String nome, double salario) {
        this.id = id;
        this.departamento = departamento;
        this.nome = nome;
        this.salario = salario;
        this.previdencia = 0.05; // Desconto fixo de um sistemade previdência da empresa
        this.desconto = 0.02;
    }

}
