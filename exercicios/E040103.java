package exercicios;

import java.util.Scanner;

public class E040103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Digite o valor do seu salario: ");
            double salario =  sc.nextDouble(); 
            
            double novosalario = salario + (salario * 25/100);
            
            System.out.println("Seu novo salario é: " + novosalario);
    }
    
}
