package teste;

import caixa.Checkout;
import caixa.Compra;
import impressao.Impressora;
import pagamento.Cartao;
import pagamento.Operadora;
import pagamento.operadoras.Cielo;
import impressao.impressoras.ImpressoraEpson;
import impressao.impressoras.ImpressoraHP;
import pagamento.operadoras.RedeCard;

/*
 * @author Isabela Saenz Cardoso
 */

public class TesteCheckout {

    public static void main(String[] args) {
        
        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraEpson();
        
        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M. Couves");
        cartao.setNumeroCartao("123");
        
        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.5);
        
        Checkout checkout = new Checkout (operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
    
}
