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
public abstract class EmpregadoComAdicional extends Empregado {

    protected double adicional;

    /**
     * adiciona novo valor ao percentual
     * @param novo_percentual double com valor do novo percentual
     */
    protected void setAdicional(double novo_percentual) {
        adicional = novo_percentual;
    }

}
