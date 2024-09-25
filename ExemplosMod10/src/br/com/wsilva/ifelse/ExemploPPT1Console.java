package br.com.wsilva.ifelse;

import java.util.Scanner;

public class ExemploPPT1Console {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu número: ");

        int result = s.nextInt();

        if (result > 1){
            System.out.print("Resultado maior que 1");
        } else {
            System.out.print("Resultado menor que 1");
        }
    }

}

