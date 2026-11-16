public class Pagamento {

    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento() {
        System.out.println("Realizando pagamento...");
    }
}