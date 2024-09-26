package br.com.wsilva.TarefaMod11;
//Cria uma classe Pessoa com nome e sexo, que são suas propriedades/atributos
public class Pessoa {
    String nome;
    String sexo;

    /**
     * Construtor da classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param sexo O sexo da pessoa, sendo "M" para masculino e "F" para feminino.
     */
    Pessoa (String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
