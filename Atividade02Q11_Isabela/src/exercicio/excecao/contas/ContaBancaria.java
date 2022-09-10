package exercicio.excecao.contas;


/*
 * @author Isabela Saenz Cardoso
 */

public class ContaBancaria {
    private double saldo;
    private double limite;
    private double total;
    
    public ContaBancaria(double valorSaldo, double valorLimite){
    
    }

    ContaBancaria() {
    }
    
    public double getSaldo(){
    return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double getLimite(){
    return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }


    public double getSaldoComLimite(){
    return (this.saldo + this.limite);
    }

    public boolean sacar(double valor) throws ContaException {
   
    if (valor > 500){
        throw new ContaException("Saque inválido. Tente um valor abaixo de  R$ 500,00");
    }    
    
    else if (getSaldoComLimite() < valor){
        throw new ContaException("Valor insuficiente");
    }
    

    else {
            this.saldo -= valor;
            return true;
        }
    }

    public void depositar(double valor) throws ContaException {
    saldo += valor;
    
    if (valor > 1000){
        throw new ContaException("Depósito inválido. Tente um valor abaixo de R$ 1.000,00");       
    }
    else {
        saldo += valor;
            }
    }
    
    public class ContaException extends Exception {
	private String mensagem;
        
	public ContaException (String mensagem) {
            super(mensagem);
            this.mensagem = mensagem;
        }     
    } 
}
