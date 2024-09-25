/**
 * @author Wallace
 */
public class Main {
    public static void main (String args []){
        Pessoa pessoa = new Pessoa();
        pessoa.digiteNome("Wallace Silva");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(25);
        System.out.println(pessoa.getIdade());
        pessoa.cadastrarEndereco("Rua Onix, número 280");
        System.out.println(pessoa.getEndereco());
        pessoa.cadastrarCPF("978065865-92");
        System.out.println(pessoa.getCPF());

    }

}
