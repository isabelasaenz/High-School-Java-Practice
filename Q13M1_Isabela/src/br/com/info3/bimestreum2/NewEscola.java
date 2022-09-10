package br.com.info3.bimestreum2;

import java.util.Scanner;

/*
@author Isabela Saenz Cardoso
 */
public class NewEscola {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois valores numéricos: ");
        
        NewMatematica operacao = new NewMatematica();
        operacao.setA(ler.nextDouble());
        operacao.setB(ler.nextDouble());
        
        System.out.println("Resultado soma: " + operacao.soma());
        System.out.println("Resultado subtracao: " + operacao.subtracao());
        System.out.println("Resultado divisão: " + operacao.divisao());
        System.out.println("Resultado multiplicação: " + operacao.produto());
    }
    
}
