public class Pessoa {
    /**
     * Criada uma classe Pessoa com suas propriedades e metodos conforme pedido, segue abaixo:
     */

    public String nome;
    public int idade;
    public String endereco;
    public String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void cadastrarEndereco (String endereco){
        setEndereco(endereco);
    }
    public void digiteNome (String nome){
        setNome(nome);
    }
    public void digiteIdade(int idade){
        setIdade(idade);
    }
    public void cadastrarCPF(String CPF){
        setCPF(CPF);
    }
}
