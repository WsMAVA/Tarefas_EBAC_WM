package br.com.wsilva.TarefaMod11;

import java.util.*;

public class GeneroNome {

    /**
     * O método main é o ponto de entrada do programa.
     * Ele lê os nomes e sexos das pessoas no formato "Nome-Sexo" e organiza-os
     * em grupos de homens e mulheres.
     *
     * @param args Argumentos de linha de comando (não utilizado).
     */
    public static void main(String[] args) {
        generoNomeOrdenado();
    }


    private static void generoNomeOrdenado() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome e seu sexo (formato:Nome-Sexo; Nome-Sexo; ...): ");
        String input = s.nextLine();

        String[] pessoas = input.split(";");

        List<Pessoa> mulheres = new ArrayList<>();
        List<Pessoa> homens = new ArrayList<>();
        /**
         * Processa cada entrada, estava com um erro aqui o regex tava diferente e tava causando uma confusão na leitura
         */

        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            // Verifica se há pelo menos dois elementos após o split
            if (dados.length == 2) {

                String nome = dados[0].trim();
                String sexo = dados[1].trim();

                if (sexo.equalsIgnoreCase("F")) {
                    mulheres.add(new Pessoa(nome, sexo));
                } else if (sexo.equalsIgnoreCase("M")) {
                    homens.add(new Pessoa(nome, sexo));
                }
            } else {
                System.out.println("Formato inválido: " + pessoa);
            }

            Collections.sort(mulheres, Comparator.comparing(Pessoa::getNome));
            Collections.sort(homens, Comparator.comparing(Pessoa::getNome));
        }
        // tomar cuidado ao utilizar muitos for dentro de 1 loop já, pois mesmo após a leitura vai ficar repetindo essa bomba

            System.out.println("Mulheres: ");
            for (Pessoa mulher : mulheres) {
                System.out.println(mulher.getNome());
            }

            System.out.println("Homens: ");
            for (Pessoa homem : homens) {
                System.out.println(homem.getNome());
            }

            s.close();
        }
}
