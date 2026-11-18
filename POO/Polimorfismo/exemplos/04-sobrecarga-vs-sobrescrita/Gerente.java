public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // SOBRESCRITA: redefine o comportamento herdado
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}