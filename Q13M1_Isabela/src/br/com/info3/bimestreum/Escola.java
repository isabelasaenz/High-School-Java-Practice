package br.com.info3.bimestreum;

import java.util.Scanner;

/*
@author Isabela Saenz Cardoso
 */
public class Escola {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois valores numéricos: ");
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        
        Matematica operacao = new Matematica(a, b);
        
        System.out.println("Resultado soma: " + operacao.soma());
        System.out.println("Resultado subtracao: " + operacao.subtracao());
        System.out.println("Resultado divisão: " + operacao.divisao());
        System.out.println("Resultado multiplicação: " + operacao.produto());
    }
    
}
