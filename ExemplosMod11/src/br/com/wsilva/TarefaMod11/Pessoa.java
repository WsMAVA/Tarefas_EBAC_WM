package br.com.wsilva.TarefaMod11;

public class Pessoa {
    String nome;
    private String mulheres;
    private String homens;
    String sexo;

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
