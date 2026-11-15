public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(
        String nome,
        int idade,
        String cargo,
        double salario,
        String linguagemPrincipal,
        String nivel
    ) {

        super(nome, idade, cargo, salario);

        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public void exibirDesenvolvedor() {

        exibirFuncionario();

        System.out.println("Linguagem principal: " + linguagemPrincipal);
        System.out.println("Nível: " + nivel);
    }

    public void programar() {
        System.out.println(nome + " está programando em " + linguagemPrincipal + ".");
    }
}