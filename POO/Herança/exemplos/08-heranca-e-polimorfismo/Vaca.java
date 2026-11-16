public class Vaca extends Animal {

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está mugindo: Muuu!");
    }
}