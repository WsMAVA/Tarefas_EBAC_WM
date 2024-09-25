package br.com.wsilva.switchcase;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um Animal: ");
        String texto = s.next();
        String animal = exampleOfIF(texto);
        System.out.print(animal);
    }

    public static String exampleOfIF(String animal){
        String result;
        switch (animal){
            case "DOG":
            case "CAT":
                  result = "Domestic animal";
                  break;
            case "LION":
                   result = "wild animal";
                   break;
            default:
                   result = "unknown animal";
                   break;
        }
        return result;
    }
}
