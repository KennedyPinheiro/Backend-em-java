public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Notebook", 3500.00);

        Produto produto2 = new Produto(1, "Notebook Gamer", 4500.00);

        Produto produto3 = new Produto(2, "Mouse", 120.00);

        // toString()
        System.out.println("=== REPRESENTAÇÃO DOS OBJETOS ===");

        System.out.println(produto1);

        // equals()
        System.out.println("\n=== COMPARAÇÃO DE OBJETOS ===");

        System.out.println("Produto 1 é igual ao produto 2? "
                + produto1.equals(produto2));

        System.out.println("Produto 1 é igual ao produto 3? "
                + produto1.equals(produto3));

        // hashCode()
        System.out.println("\n=== HASH CODE ===");

        System.out.println("Hash do produto 1: " + produto1.hashCode());

        System.out.println("Hash do produto 2: " + produto2.hashCode());

        System.out.println("Hash do produto 3: " + produto3.hashCode());

        // getClass()
        System.out.println("\n=== CLASSE DOS OBJETOS ===");

        System.out.println("Produto 1 pertence à classe: "
                + produto1.getClass().getSimpleName());
    }
}