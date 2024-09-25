package br.com.wsilva.ifelse;

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
        if(animal.equals("DOG") || animal.equals("CAT")){
            result = "Domestic animal";
        } else if (animal.equals("LION")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}


