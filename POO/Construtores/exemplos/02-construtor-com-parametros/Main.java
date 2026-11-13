public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 80.00, 10);

        System.out.println("Produto: " + produto1.nome);
        System.out.println("Preço: R$ " + produto1.preco);
        System.out.println("Quantidade: " + produto1.quantidade);

        System.out.println("--------------------");

        System.out.println("Produto: " + produto2.nome);
        System.out.println("Preço: R$ " + produto2.preco);
        System.out.println("Quantidade: " + produto2.quantidade);

    }

}