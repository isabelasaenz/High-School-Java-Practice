package exercicios;

import java.util.Scanner;

public class E090103 {

   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite uma hora formada por horas e minutos");
        float hrs = sc.nextFloat();
        float mins = (hrs * 60);
        
        System.out.println("A sua hora é igual a " + mins + "minutos");
    }
    
}
