public class ContaBancaria {

    String titular = "Não informado";
    double saldo = 0.0;
    boolean ativa = true;

    // Bloco de inicialização
    {
        System.out.println("Bloco de inicialização executado!");
    }

    // Construtor
    public ContaBancaria(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;

        System.out.println("Construtor executado!");

    }

    public void apresentarDados() {

        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Ativa: " + ativa);

    }

}