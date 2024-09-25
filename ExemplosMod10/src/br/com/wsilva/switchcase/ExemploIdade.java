package br.com.wsilva.switchcase;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.print(idadeSt);
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:

                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "Você é uma criança";
                break;
            case 11:
            case 18:
                result = "Você é uma adolescente";
                break;
            default:
                result = "Você é um adulto";
                break;
        }
       return result;

    }
}