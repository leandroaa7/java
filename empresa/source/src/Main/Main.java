/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author 31616720
 */
public class Main {

    private static void mostrarMenu() {
        System.out.println("Bem-Vindo, Selecione uma opção");
        System.out.println("1) Adicionar um funcionário");
        System.out.println("2) Remover um funcionário");
        System.out.println("3) Calcular pagamento do funcionário");
        System.out.println("4) Alterar o desconto do funcionário");
        System.out.println("5) Listar os funcionários da empresa");
        System.out.println("0) Sair");
    }

    /**
     * Adicionar um funcionário em uma posição da lista de usuários da classe
     * empresa
     */
    private static void adicionarFunc() {
        System.out.println("opc1");
    }

    /**
     * remover um funcionário em uma posição da lista de usuários da classe
     * empresa
     */
    private static void removerFunc() {
        System.out.println("opc2");
    }

    /**
     * Calcular pagamento do usuário
     */
    private static void calcularPagamentoFunc() {
        System.out.println("opc3");
    }

    /**
     * Alterar o desconto do funcionário
     */
    private static void alterarDescontoFunc() {
        System.out.println("opc4");
    }

    /**
     * listar os funcionários da empresa
     */
    private static void listarFunc() {
        System.out.println("opc5");
    }

    /**
     * recebe a opção do usuário
     * @return retorna a opção do usuário
     */
    private static int receberOpcao() {
        int opc = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        mostrarMenu();
        try {
            opc = sc.nextInt();
            while (opc < 0 || opc > 5) {
                System.out.println("Opção Inválida, tente novamente");
                opc = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Erro! digite apenas valores inteiros");
        }
        return opc;
    }

    /**
     * realiza a opção selecionada pelo usuário
     * @param opc inteiro com o valor da opção do usuário
     * @return retorna a opção do usuário
     */
    private static int realizarOpcao(int opc) {
        switch (opc) {
            case 1:
                adicionarFunc();
                break;
            case 2:
                removerFunc();
                break;
            case 3:
                calcularPagamentoFunc();
                break;
            case 4:
                alterarDescontoFunc();
                break;
            case 5:
                listarFunc();
                break;
        }
        return opc;
    }

    public static void main(String[] args) {
        while (realizarOpcao(receberOpcao()) != 0) {
        }
    }

}
