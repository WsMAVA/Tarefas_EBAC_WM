/**
 * @author wallace
 *Aula da EBAC explicando todos os tipos de operadores tem alguns comentários explicando cada parte, olhe!
 */
public class Operadores {
    public static void main (String args[]){
        OperadoresAritmeticos();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicas();


    }

    private static void operacoesLogicas() {
        System.out.println("**** operacoesLogicas ****");
        int num1=10;
        int num2=10;
        //1...10
        boolean isDentro10 = num1 >= 1 && num1 <= 9; // AND Basicamente precisa que as 2 informações sejam verdadeiras para dar true
        System.out.println("isDentro10: "+ isDentro10);

        //1...10
        boolean isDentro_10 = num1 >= 1 || num1 <= 9; // OR Basicamente precisa que as 1 informações seja verdadeira para dar true, só 1
        System.out.println("isDentro_10: "+ isDentro_10);

        boolean isNot = num1 >= 1; // NOT ! Basicamente inverte, se for true vira false e assim vice-versa
        System.out.println("isNot: "+ !isNot);

    }

    private static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");
        int num1=10;
        int num2=10;
        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior );

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: "+ isIgual);

        boolean isDiff = num1 != num2;
        System.out.println("isDiff: "+ isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("isMaiorIgual: "+ isMaiorIgual);



    }

    public static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremento ****");
        int num1 = 10;
        System.out.println(num1);

        num1++; // contador basicamente, ele sempre vai adicionando +1, conhecido como incremento
        System.out.println(num1);

        num1--;// decremento sempre subtrai 1
        System.out.println(num1);
        /**
         * No caso de int x = --num1;, o pré-decremento ocorre. Isso significa que a variável num1 será decrementada primeiro, e o valor decrementado será atribuído à variável x.
         * int num1 = 5;
         * int x = --num1;  // Pré-decremento: num1 é decrementado para 4, e 4 é atribuído a x
         * System.out.println(x);    // Saída: 4
         * System.out.println(num1); // Saída: 4
         * -num1 começa como 5.
         * -O operador -- primeiro decrementa num1 para 4.
         * -O valor 4 (novo valor de num1) é então atribuído à variável x.
         *  PÓS DECREMENTO
         * No caso de int x = num1--;, o pós-decremento ocorre. Isso significa que o valor original de num1 será atribuído à variável x antes que num1 seja decrementado.
         * int num1 = 5;
         * int x = num1--;  // Pós-decremento: num1 (5) é atribuído a x, depois num1 é decrementado para 4
         * System.out.println(x);    // Saída: 5
         * System.out.println(num1); // Saída: 4
         * -num1 começa como 5.
         * -O valor 5 é primeiro atribuído à variável x.
         * -Em seguida, num1 é decrementado para 4.
         *
         */


    }

    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes ****");
        int numero1 = 10; // atribui o valor de 10 a variavel numero 1
        int numero2 = 10; // atribui o valor de 10 a variavel numero 2
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3; //aqui o += pega o valor do numero3 ele soma com ele mesmo e vira 40
        int numero4 = numero3 +20;
        System.out.println(numero3);
        System.out.println(numero4);
        // -= -> Subtrai o valor da variável e atribui o resultado à própria variável
        // *= -> Multiplica a variável pelo valor e atribui o resultado à variável.
        // /= -> Divide a variável pelo valor e atribui o resultado à própria variável.
        // Esses exemplos comentados são feitos igual ao += que teve aí acima.

        

    }

    public static void OperadoresAritmeticos(){
        System.out.println("**** OperadoresAritmeticos ****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2; // soma dois valores
        int num4 = num1 - num2; // subtrai dois valores
        int num5 = num1 / num2; // divide dois valores
        int num6 = num1 * num2; // multiplica dois valores
        int num7 = (10 +10)/2; // conta basica, soma e divide

        System.out.println("O valor é: " + num3); // imprime na tela
        System.out.println("O valor é: " + num4);
        System.out.println("O valor é: " + num5);
        System.out.println("O valor é: " + num6);
        System.out.println("O valor é: " + num7);

    }
}
