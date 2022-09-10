package pagamento.operadoras;

import pagamento.Autorizavel;
import pagamento.Cartao;
import pagamento.Operadora;

/*
 * @author Isabela Saenz Cardoso
 */

public class RedeCard implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456")
                && autorizavel.getValorTotal() < 200;
    }
    
}
