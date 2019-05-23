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
public class FuncionarioSindicalizado extends EmpregadoComAdicional {
    private static double desconto_sindicato;

    public FuncionarioSindicalizado(int id, int departamento, String nome, double salario, double adicional) {
        this.id = id;
        this.departamento = departamento;
        this.nome = nome;
        this.salario = salario;
        this.adicional = adicional;
    }
    
    
    
}
