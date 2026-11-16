public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.printf("Pagamento de R$ %.2f realizado via PIX.%n", valor);
    }
}