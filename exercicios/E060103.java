package exercicios;

import java.util.Scanner;

public class E060103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Digite a primeira nota: ");
            float n1 = sc.nextFloat();
            System.out.println("Digite o peso da nota");
            float p1 = sc.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float n2 = sc.nextFloat();
            System.out.println("Digite o peso da nota");
            float p2 = sc.nextFloat();
            System.out.print("Digite a terceira nota: ");
            float n3 = sc.nextFloat();
            System.out.println("Digite o peso da nota");
            float p3 = sc.nextFloat();
            
                float total = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        
                 System.out.print("Seu total é: " +total);
    }
    
}
