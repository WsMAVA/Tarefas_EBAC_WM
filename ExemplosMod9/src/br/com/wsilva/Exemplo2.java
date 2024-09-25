package br.com.wsilva;

public class Exemplo2 {
    public static void main(String[] args) {
        // CASTING
        int num1 = 10;
        Short num2 = (short) num1;

        long numL= 21212222222222222l;
        System.out.println(numL);

        int numI = (int) numL;
        System.out.println(numI);

        int idade = 10;
        long idadeL = idade;

        byte b = 1;
        short s =b;

        byte b1= (byte) s;
        int i =b1;

        int i1 = 1;
        byte s1 = (byte) i1;
        long l = i1;

        long l1 = 1010011;
        short l2 = (short)l1;
        double d = l1;

        double d1 = 1.0d;
        long l3 = (long)d1;



    }
}
