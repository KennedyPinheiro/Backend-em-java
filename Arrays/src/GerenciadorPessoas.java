import java.util.ArrayList;

public class GerenciadorPessoas {

    private ArrayList<Pessoa> pessoas;

    public GerenciadorPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastrar(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public boolean remover(String nome) {

        for (int i = 0; i < this.pessoas.size(); i++) {

            Pessoa pessoa = this.pessoas.get(i);

            if (pessoa.getNome().equalsIgnoreCase(nome)) {

                this.pessoas.remove(i);

                return true;
            }
        }

        return false;
    }

    public void listar() {

        if (this.pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE PESSOAS =====");

        for (Pessoa pessoa : this.pessoas) {
            System.out.println(pessoa.apresentar());
        }
    }

    public int quantidade() {
        return this.pessoas.size();
    }
}