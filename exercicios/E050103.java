package exercicios;

import java.util.Scanner;

public class E050103 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
            System.out.print("Digite a primeira nota: ");
            float n1 = sc.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float n2 = sc.nextFloat();
            System.out.print("Digite a terceira nota: ");
            float n3 = sc.nextFloat();
            System.out.print("Digite a quarta nota: ");
            float n4 = sc.nextFloat();
            System.out.print("Digite a quinta nota: ");
            float n5 = sc.nextFloat();
            
            float media = (n1+n2+n3+n4+n5)/5;
            System.out.println("Sua média é: " +media);
    }
    
}
