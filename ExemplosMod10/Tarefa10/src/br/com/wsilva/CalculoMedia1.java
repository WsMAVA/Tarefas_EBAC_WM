package br.com.wsilva;

import java.util.Scanner;

public class CalculoMedia1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Classe scanner utiliza para ler dados que o usuário digita
        double soma =0;    //variavel que vai somar tudo

        for (int i = 1; i <=4;i++){
            /**
             * Um laço que repete quatro vezes para ler as quatro notas do usuário.
             * Cada vez que o usuário digita uma nota, ela é adicionada à soma
             * lê a nota
             */
            System.out.println("Digite sua nota "+ i +": ");
            double nota = s.nextDouble();
            soma += nota;
        }
        double media = soma/4; // calcula a media e divide por 4

        System.out.println("Sua média final é: " + media);

        /**
         * Condicionais criadas para verificar se a media do aluno está >= a 7 ou 5
         * é exibido as mensagens aprovado ou recuperação, caso não chegue nesse valor
         * imprime direto reprovado
         */

        if (media >= 7){
            System.out.println("Você está Aprovado!! :) ");
        } else if (media >= 5) {
            System.out.println("Você está de Recuperação T-T");
        }else {
            System.out.println("Você está Reprovado! :( ");
        }
        s.close();
    }
}
