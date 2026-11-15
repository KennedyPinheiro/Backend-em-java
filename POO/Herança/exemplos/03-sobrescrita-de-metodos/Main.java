public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");
        Vaca vaca = new Vaca("Mimosa");

        System.out.println("===== SONS DOS ANIMAIS =====");

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();

        System.out.println("\n===== NOMES DOS ANIMAIS =====");

        cachorro.exibirNome();
        gato.exibirNome();
        vaca.exibirNome();
    }
}