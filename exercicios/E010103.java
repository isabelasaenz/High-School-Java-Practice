package exercicios;

import java.util.Scanner; 

public class E010103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Digite o primeiro numero: ");
            int n1 = sc.nextInt();
            System.out.print("Digite o segundo numero: ");
            int n2 = sc.nextInt();
         int soma = (n1 + n2);  
            System.out.print("Sua soma é: " +soma);
    }
    
}
