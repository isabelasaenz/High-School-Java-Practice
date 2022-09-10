package caixa;

import impressao.Impressora;
import impressao.Imprimivel;
import pagamento.Cartao;
import pagamento.Operadora;

/*
 @author Isabela Saenz Cardoso
 */

public class Checkout {
    
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }
    
    public void fecharCompra (Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra, cartao);
        
        if (autorizado){
            this.impressora.imprimir((Imprimivel) compra);
        } else {
            System.out.println("Pagamento foi negado");
        }
    }
}
