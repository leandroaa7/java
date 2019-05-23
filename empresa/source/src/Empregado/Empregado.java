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
public abstract class Empregado {
    protected int id,departamento;
    protected String nome;
    protected double salario,previdencia,desconto,adicional;
    
    /**
     * altera o valor do desconto
     * @param desconto double com o valor do desconto
     */
    protected void setDesconto(double desconto){
        this.desconto = desconto;
    }
        
    /**
     * Calcula o salário líquido
     * @return retorna double com o valor do salario liquido 
     */
    protected double pagamento(){
        return (this.salario*(1-this.previdencia - this.desconto));
    }
    
    
}
