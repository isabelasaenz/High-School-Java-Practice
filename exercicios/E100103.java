package exercicios;

import java.util.Scanner;

public class E100103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira o valor 1");
        int v1 = sc.nextInt();
        System.out.println("Insira o valor 2");
        int v2 = sc.nextInt();
        
        int v3 = v1;
        v1 = v2; 
        v2 = v3;  
        
        System.out.println("O valor 1 é = " +v1);
        System.out.println("O valor 2 é = " +v2);
        
    }
    
}
