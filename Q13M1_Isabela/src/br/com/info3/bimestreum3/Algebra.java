package br.com.info3.bimestreum3;
import br.com.info3.bimestreum2.NewMatematica;
/*
@author Isabela Saenz Cardoso
 */

public class Algebra extends NewMatematica{
    
    private double A;
    private double B;
    private double resultado; 
    
    public void divisao(int a, int b){
        try{
            this.resultado = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Divisão por zero");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        finally{
            System.out.println("O resultado da divisão tipo i é: " + this.resultado);
        }
    }
    
    public void divisao(int[] valores){
        
        try {
            this.resultado = valores[0]/valores[1];
        } 
        catch(ArithmeticException e){
            System.out.println("Divisão por zero");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        finally{
            System.out.println("O resultado da divisão tipo i é: " + this.resultado);
        }
    }
}
