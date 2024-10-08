package br.com.wsilva.list;

import br.com.wsilva.domain.Aluno;
import br.com.wsilva.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();

    }

    private static void exemploListaSimplesOrdenadaClasseExterna(){
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Guilherme","Linux",0);
        Aluno b = new Aluno("Victor","Analise de sistemas",0);
        Aluno c = new Aluno("Diego","Direito",0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno(){
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Guilherme","Linux",20);
        Aluno b = new Aluno("Victor","Analise de sistemas",30);
        Aluno c = new Aluno("Diego","Direito",10);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação"+lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação"+lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista,comparaNotaAluno);
        System.out.println("Lista com ordenação por nota"+lista);

        System.out.println("");
    }
}
