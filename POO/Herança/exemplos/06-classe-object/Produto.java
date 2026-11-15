import java.util.Objects;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Representação textual do objeto
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    // Compara dois produtos pelo código
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produto outro = (Produto) obj;

        return codigo == outro.codigo;
    }

    // Gera o hash baseado no código
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}