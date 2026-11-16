public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Mimi");
        Animal animal3 = new Vaca("Mimosa");

        System.out.println("=== SONS DOS ANIMAIS ===");

        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
    }
}