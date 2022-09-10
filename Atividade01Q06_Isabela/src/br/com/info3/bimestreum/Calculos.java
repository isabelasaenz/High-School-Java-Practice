package br.com.info3.bimestreum;
import java.lang.ArithmeticException;

/**
 *
 * @author Isabela Saenz Cardoso
 */
     public class Calculos extends Matematica {

         
     public double soma(double a, double b, double resultado){
        Resultado = a + b;
            return Resultado;
    }

    public double subtracao(double a, double b, double resultado){
        Resultado = a - b;
            return Resultado;
    }   
    
    public double multiplicacao(double a, double b, double resultado){
        Resultado = a * b;
            return Resultado;
    }  
        
    public double divisao(double a, double b, double resultado){
        try{
        Resultado = a/b;
        if (a % 2 != 0){
            throw new Exception ("Número ímpar, divisão não exata");
            } 
        }

        catch (ArithmeticException e){
             System.out.println("O divisor é igual a zero");
        
    }
        catch (Exception e){
             System.out.println("Número ímpar, divisão não exata");
        
    }
        return Resultado;
    }

    public double divisao(double a, double b) {
    try{
        Resultado = b/a;
        if (b % 2 != 0){
            throw new Exception ("Número ímpar, divisão não exata");
            } 

            }
    
        catch (ArithmeticException e){
             System.out.println("O divisor é igual a zero");
        
    }
    
    catch (Exception e){
             System.out.println("Número ímpar, divisão não exata");   
    }
        return Resultado;
    }
    
    }

