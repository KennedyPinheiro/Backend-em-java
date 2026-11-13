public class Main {

    public static void main(String[] args) {

        System.out.println("Criando primeira conta:");

        ContaBancaria conta1 = new ContaBancaria("Kennedy", 1500.00);

        conta1.apresentarDados();

        System.out.println("\n------------------------");

        System.out.println("Criando segunda conta:");

        ContaBancaria conta2 = new ContaBancaria("Carlos", 3000.00);

        conta2.apresentarDados();

    }

}