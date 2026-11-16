public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.printf("Pagamento de R$ %.2f realizado via cartão de crédito.%n", valor);
    }
}