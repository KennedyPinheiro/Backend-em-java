public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Kennedy", 1000.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        System.out.println("\n--- Depósito ---");

        if (conta.depositar(500.00)) {
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- Saque ---");

        if (conta.sacar(300.00)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n--- Tentativa de saque inválido ---");

        if (conta.sacar(2000.00)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}