package exercicios;

import java.util.Scanner;  

public class E020103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Digite o valor A: ");
            int A = sc.nextInt();
            System.out.println("Digite o valor B: ");
            int B = sc.nextInt();
            System.out.println("Digite o valor C: ");
            int C = sc.nextInt();
                double q1 = Math.pow(A,2);
                double q2 = Math.pow(B,2);
                double q3 = Math.pow(C,2);
        
                    double soma = (q1 + q2 + q3);
     
            
                    System.out.printf("Sua soma é: " +soma);
    }
    
}
