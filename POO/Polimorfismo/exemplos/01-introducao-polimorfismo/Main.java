public class Main {

    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoPix(150.00);

        Pagamento pagamento2 = new PagamentoCartao(250.00);

        Pagamento pagamento3 = new PagamentoBoleto(350.00);

        System.out.println("=== SISTEMA DE PAGAMENTOS ===");

        pagamento1.realizarPagamento();

        pagamento2.realizarPagamento();

        pagamento3.realizarPagamento();
    }
}