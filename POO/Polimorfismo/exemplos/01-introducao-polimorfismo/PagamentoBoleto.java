public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.printf("Boleto de R$ %.2f gerado com sucesso.%n", valor);
    }
}