package br.com.info3.bimestreum3;

import java.util.Scanner;

/*
@author Isabela Saenz Cardoso
 */
public class Ifgoiano {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Algebra operacao = new Algebra();
        System.out.println("Digite dois valores numéricos: ");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int[] val = new int[2];
        val[0] = a;
        val[1] = b;
        
        operacao.divisao(a,b);
        
        operacao.divisao(val);
       
    }
    
}
