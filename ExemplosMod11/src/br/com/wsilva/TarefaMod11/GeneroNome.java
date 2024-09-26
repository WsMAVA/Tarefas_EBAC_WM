package br.com.wsilva.TarefaMod11;

import java.util.*;

public class GeneroNome {
    public static void main(String[] args) {
        generoNomeOrdenado();
    }
    private static void generoNomeOrdenado(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome e seu sexo, necessitamos dos dados para entrada de nosso Hotel.");
        String input = s.nextLine();

        String[] pessoas = input.split("-");

        List<Pessoa> = new ArrayList<>();
        List<Pessoa> = new ArrayList<>();

        for (String pessoa: pessoas){
            String[] dados = pessoas.split("-");
            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            if (sexo.equalsIgnoreCase("F")){
                mulheres.add(new Pessoa(nome,sexo));
            } else if (sexo.equalsIgnoreCase("M")){
                homens.add(new Pessoa(nome,sexo));
            }
        }

        Collections.sort(mulheres, Comparator.comparing(Pessoa::getNome));
        Collections.sort(homens,Comparator.comparing(Pessoa::getNome));

        System.out.println("Mulheres");
        for (Pessoa mulher : mulheres){
            System.out.println(mulher.getNome());
        }

        System.out.println("Homens: ");
        for (Pessoa homem : homens){
            System.out.println(homem.getNome());
        }

        s.close();
    }
}
