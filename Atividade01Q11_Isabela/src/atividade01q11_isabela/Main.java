package atividade01q11_isabela;

import atividade01q11_isabela.Produto.Livro;
import atividade01q11_isabela.Produto.Mouse;
import java.util.ArrayList;

/*
 @author Isabela Saenz Cardoso
 */

public class Main{

    public static void main(String[] args) {
        Mouse m1 = new Mouse("Mouse ótico, Saída USB. 1.600 dpi ");
        Mouse m2 = new Mouse("Mouse laser, Saída USB. 3.200 dpi ");
        Mouse m3 = new Mouse("Mouse ótico, sem fio. 1.200 dpi ");
        Livro l1 = new Livro("Machado de Assis");
        Livro l2 = new Livro ("Clarice Lispector");
        Livro l3 = new Livro ("Graciliano Ramos");
        
        
        
        ArrayList<Produto> carrinho = new ArrayList();
        
        carrinho.add(m1);
        carrinho.add(m2);
        carrinho.add(m3);
        carrinho.add(l1);
        carrinho.add(l2);
        carrinho.add(l3);

       

        for (int i=0; i < carrinho.size(); i++) {
            System.out.println((i+1)+"-" + carrinho.get(i).getDescrição());
   
         } 
        
   }
}
   
