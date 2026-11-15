public class Animal {

    protected String nome;
    protected int idade;

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}