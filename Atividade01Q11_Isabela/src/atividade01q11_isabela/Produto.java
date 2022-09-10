/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01q11_isabela;

/*
 @author Isabela Saenz Cardoso
 */

class Produto {
    public String nomeloja;
    public double preço;
    public String descrição;

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        String desc = "Produto de informática";
        this.descrição = desc;
    }    


public static class Mouse extends Produto{
    
    public String tipo;


        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        Mouse(String tipo) {
           this.tipo = tipo;
           
        }
    @Override
    public String getDescrição() {
        return tipo;
    }    
 

   }

public static class Livro extends Produto{
    
    public String autor;


        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
        
    Livro(String autor) {
           this.autor = autor;
           
        }
    
    @Override
    public String getDescrição() {
         return autor;
    } 
    

}

}