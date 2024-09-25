package br.com.wsilva.switchcase;
import java.util.Scanner;

public class ExemploScanner1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.print("\n Digite sua altura: ");
        double altura = s.nextDouble();

        System.out.print(nome + " tem "+ altura + " Wde altura.");
    }
}
