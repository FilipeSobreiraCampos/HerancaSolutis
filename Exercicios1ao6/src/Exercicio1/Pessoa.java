package Exercicio1;

public class Pessoa {
    // Atributos encapsulados
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor padrão
    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Construtor com nome e telefone
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = ""; // Valor padrão
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
