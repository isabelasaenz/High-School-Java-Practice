package br.com.info3.bimestreum;

/*
@author Isabela Saenz Cardoso
 */
public class Matematica {
    
    private double A;
    private double B;
    private double resultado;
    
    Matematica(double a, double b){
        this.A = a;
        this.B = b;
    }
    public double soma(){
        this.resultado = this.A + this.B;
        return this.resultado;
    }
    public double subtracao(){
        this.resultado = this.A - this.B;
        return this.resultado;
    }
    public double divisao(){
        this.resultado = this.A/this.B;
        return this.resultado;
    }
    public double produto(){
        this.resultado = this.A * this.B;
        return this.resultado;
    }
}
