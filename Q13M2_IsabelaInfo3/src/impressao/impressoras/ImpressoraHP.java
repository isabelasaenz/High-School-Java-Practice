package impressao.impressoras;

import impressao.Impressora;
import impressao.Imprimivel;

/**
 *
 * @author Isabela Saenz Cardoso
 */
public class ImpressoraHP implements Impressora{

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("******************************");
        System.out.println(imprimivel.getCabeçalhoPagina());
        System.out.println("******************************");
        System.out.println();
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("_______________________________");
        System.out.println();
        System.out.println("               HP              ");
        System.out.println("_______________________________");
        
    }
    
}
