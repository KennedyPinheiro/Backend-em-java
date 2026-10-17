public class Usuario {

    private String nome;
    private int idade;

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {

        if (idade < 0) {
            throw new IllegalArgumentException(
                    "A idade não pode ser negativa."
            );
        }

        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}