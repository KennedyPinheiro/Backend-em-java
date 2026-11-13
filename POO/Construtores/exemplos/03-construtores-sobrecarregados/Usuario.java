public class Usuario {

    String nome;
    String email;
    int idade;

    // Construtor sem parâmetros
    public Usuario() {
        nome = "Não informado";
        email = "Não informado";
        idade = 0;
    }

    // Construtor com nome e email
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        idade = 0;
    }

    // Construtor com todos os parâmetros
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}