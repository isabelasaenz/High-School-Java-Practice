package br.com.info3.bimestreum2;

/*
@author Isabela Saenz Cardoso
 */
public class NewMatematica {

    private double A;
    private double B;
    private double resultado;  
    
    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    public double soma(){
        this.resultado = getA() + getB();
        return this.resultado;
    }
    public double subtracao(){
        this.resultado = getA() - getB();
        return this.resultado;
    }
    public double divisao(){
        this.resultado = getA()/getB();
        return this.resultado;
    }
    public double produto(){
        this.resultado = getA() * getB();
        return this.resultado;
    }
}
