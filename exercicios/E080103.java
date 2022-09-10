package exercicios;

import java.util.Scanner;

public class E080103 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
            System.out.println("Informe a medida do primeiro lado");
            float lado1 = sc.nextFloat();
            System.out.println("Informe a medida do segundo lado");
            float lado2 = sc.nextFloat();
            
         float area = (lado1 * lado2);
         
         System.out.println("A área do quadrado é: " +area);
    }

    
    
}
