public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Rex";
        cachorro.idade = 3;

        System.out.println("===== INFORMAÇÕES =====");

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade + " anos");

        System.out.println("\n===== COMPORTAMENTOS =====");

        cachorro.comer();
        cachorro.dormir();
        cachorro.emitirSom();
        cachorro.latir();
    }
}