package exercicios;

import java.util.Scanner;

public class E070103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Digite o nome do piloto: ");
            String piloto = sc.nextLine();
            System.out.println("Digite a distância percorrida em KM: ");
            float km = sc.nextInt();
            System.out.println("Digite o tempo em horas");
            float hrs = sc.nextFloat();
            
            float velocidade = km/hrs;
            
                System.out.printf("A velocidade média do piloto " + piloto + "foi " + velocidade + "km/h");
    }
    
}
