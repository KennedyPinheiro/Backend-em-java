public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        // Modificando os atributos através dos setters
        produto.setNome("Notebook");
        produto.setPreco(3500.00);

        // Consultando os atributos através dos getters
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        // Modificando novamente o preço
        produto.setPreco(3200.00);

        System.out.println("\nNovo preço: R$ " + produto.getPreco());

    }

}