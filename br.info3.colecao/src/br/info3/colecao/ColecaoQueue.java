package br.info3.colecao;

import java.util.LinkedList;
import java.util.Queue;

/*
@author Isabela Saenz Cardoso
 */
public class ColecaoQueue {

    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        fila.add("Ricardo");
        fila.add("Sandra");
        fila.offer("Beatriz");
        System.out.println(fila);
        
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);
        
        /*outros métodos em linkedlist*/
        LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("Caio");
        f.addLast("Julia");
        System.out.println(f);
        
        System.out.println(f.peekFirst());
        System.out.println(f.peekLast());
        f.pollFirst();
        f.pollLast();
        System.out.println(f);
    }
    
}
