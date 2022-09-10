package pagamento.operadoras;

import pagamento.Autorizavel;
import pagamento.Cartao;
import pagamento.Operadora;

/*
 * @author Isabela Saenz Cardoso
 */

public class Cielo implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
    
}
