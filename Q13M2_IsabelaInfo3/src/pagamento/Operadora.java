package pagamento;

/*
@author Isabela Saenz Cardoso
 */

public interface Operadora {
    
    boolean autorizar(Autorizavel autorizavel, Cartao cartao);
    
}
