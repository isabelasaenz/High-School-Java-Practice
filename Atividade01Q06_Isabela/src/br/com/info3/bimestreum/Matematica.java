package br.com.info3.bimestreum;

import java.text.DecimalFormat;
/*
@author Isabela Saenz Cardoso
 */
public class Matematica {
    public double Resultado;
    public  double a;
    public double b;
    

    public double getA(){
        return this.a;
    }
    public void setA (double numA){
        this.a = numA;
    }
    
    public double getB(){
        return this.b;
    }
    public void setB (double numB){
        this.b = numB;
    }
    
    public double getResultado(){
        return this.Resultado;
    }
    public void setResultado (double Resultado){
        this.Resultado = Resultado;
    }

    
   
    public static void main(String[] args) {
        Matematica m = new Matematica();
        Calculos c = new Calculos();
        m.setA(20);
        m.setB(5);
        
        System.out.println("A= " +m.getA()+ "   B= " +m.getB());
         System.out.println("Soma (A + B) = " +c.soma(m.a, m.b, m.Resultado));
         System.out.println("Subtração (A - B) = " +c.subtracao(m.a, m.b, m.Resultado));
         System.out.println("Multiplicação (A * B)= " +c.multiplicacao(m.a, m.b, m.Resultado));
         System.out.println("Divisão (A/B)= " +new DecimalFormat("#0.##").format(c.divisao(m.a, m.b, m.Resultado)));
         System.out.println("Divisão (B/A)= "+new DecimalFormat("#0.##").format(c.divisao(m.a, m.b)));
         
    }
    
}
