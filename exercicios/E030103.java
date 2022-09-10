package exercicios;

import java.util.Scanner;


public class E030103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Digite o valor em celsius");
            int c = sc.nextInt();
            
        int f = (int) (c * (9.0 /5.0)+32.0);
        
        System.out.println("Seu valor em Fahrenheit é: " +f);
    }
    
}
