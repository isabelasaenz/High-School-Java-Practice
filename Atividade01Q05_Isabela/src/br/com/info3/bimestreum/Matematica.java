package br.com.info3.bimestreum;
/*
@author Isabela Saenz Cardoso
 */
public class Matematica {

    private double Resultado;
    private static double a;
    private static double b;
    
    public Matematica(){
        a = 10;
        b = 20;
        Resultado = 0;
    }


     public double soma(){
        Resultado = a + b;
            return Resultado;
    }

    public double subtracao(){
        Resultado = a - b;
            return Resultado;
    }   
    
    public double multiplicacao(){
        Resultado = a * b;
            return Resultado;
    }  
    
    public double divisao(){
        Resultado = a / b;
            return Resultado;
    }      
    
    public static void main(String[] args) {
        Matematica m = new Matematica();
        
        System.out.println("A= " +a+ "   B= " +b);
         System.out.println("Soma (A + B) = " +m.soma());
         System.out.println("Subtração (A - B) = " +m.subtracao());
         System.out.println("Multiplicação (A * B)= " +m.multiplicacao());
         System.out.println("Divisão (A/B)= " +m.divisao());
         
    }
    
}
