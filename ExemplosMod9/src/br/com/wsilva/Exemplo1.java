package br.com.wsilva;

public class Exemplo1 {

    public static void main (String []args){

        //BOXING
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf= Long.valueOf(123456);
        Long cpf1 = 12312312l;

        //UNBOXING
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(12312);

    }
}
