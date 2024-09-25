package br.com.wsilva.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ao contrário do ArrayList, as buscas são lentas e inserções e exclusões são rápidas.
 *
 * @author wallace
 */
public class ExemploLinkedList {
        public static void main(String[] args) {
            exemploListaSimples();
            exemploListaSimplesOrdemAscendente();
        }
        private static void exemploListaSimples(){
            System.out.println("****** exemploListaSimples ******");
            List<String> lista= new ArrayList<>();
            lista.add("Maria de Fátima");
            lista.add("João de Sousa");
            lista.add("Antonio Génesio");
            System.out.println(lista);
            System.out.println("");
            lista.remove(0);
            System.out.println(lista);
            boolean contem = lista.contains("Antonio Génesio");
            System.out.println(contem);

            System.out.println(lista.get(0));

        }
        private static void exemploListaSimplesOrdemAscendente(){
            System.out.println("****** exemploListaSimplesOrdemAscendente ******");
            List<String> lista = new ArrayList <String> ();
            lista.add("Maria de Fátima");
            lista.add("Antonio Génesio");
            lista.add("João de Sousa");
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("");

        }
    }

