public class Produto {

    String nome;
    double preco;
    int quantidade;

    void apresentarDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
