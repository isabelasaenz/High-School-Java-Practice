package exercicio.excecao.contas;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Isabela Saenz Cardoso
 */

public class TesteConta {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.setSaldo(100);
        conta.setLimite(500);
        
        
        
        try {
            conta.sacar(100);
        } catch (ContaBancaria.ContaException ex) {
            System.err.println(ex.getMessage());
        }
        
       try {
            conta.depositar(340);
        } catch (ContaBancaria.ContaException ex) {
            System.err.println(ex.getMessage());
        } 
       
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo + limite: " + conta.getSaldoComLimite());
    }
    
}
