public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 120.00;
        produto1.quantidade = 10;

        produto2.nome = "Mouse";
        produto2.preco = 75.50;
        produto2.quantidade = 20;

        produto1.apresentarDados();

        System.out.println("----------------");

        produto2.apresentarDados();
    }
}
