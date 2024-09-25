package br.com.wsilva.list;
/**
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 *
 * @author wallace
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }
    private static void exemploNumeros(){
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
    }
    private static void exemploListaSimples(){
        System.out.println("****** exemploListaSimples ******");
        List<String> lista= new ArrayList<String>();
        lista.add("Maria de Fátima");
        lista.add("João de Sousa");
        lista.add("Antonio Génesio");
        System.out.println(lista);
        System.out.println("");

    }
    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Maria de Fátima");
        lista.add("Antonio Génesio");
        lista.add("João de Sousa");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }
}
