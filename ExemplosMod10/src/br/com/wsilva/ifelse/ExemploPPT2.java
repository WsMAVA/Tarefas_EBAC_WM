package br.com.wsilva.ifelse;

import java.util.Scanner;

public class ExemploPPT2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu número: ");

        int result = s.nextInt();

        if (result > 1 && result < 5 ){
            System.out.print("Resultado maior que 1");
        } else if (result >= 5 && result < 8 ) {
            System.out.print("Resultado maior ou igual a 5");
            
        } else {
            System.out.print("Resultado menor que 1");
        }
    }
}
