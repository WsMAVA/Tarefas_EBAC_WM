package br.com.wsilva.forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {
    public static void main(String[] args) {
        List <Integer> valores = new ArrayList<>();
        for (int i = 0; i<10; i++){
            System.out.println("Linha"+i);
            valores.add(i);//usa contador e sabemos a quantidade de registros que tem aqui
        }
        for (Integer i: valores){
            System.out.println("Linha"+i);//usa coleções e não sabemos a quantidade de registros que tem aqui
        }
        valores.forEach(i->System.out.println("Linha"+ i ));//usa coleções lambda e quase a mesma coisa do acima
    }
}
