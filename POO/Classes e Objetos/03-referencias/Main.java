public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Kennedy";
        pessoa1.idade = 22;

        // pessoa2 recebe a referência do objeto apontado por pessoa1.
        // Nenhum novo objeto é criado nesta atribuição.
        Pessoa pessoa2 = pessoa1;

        pessoa2.nome = "Maria";

        System.out.println("Nome acessado por pessoa1: " + pessoa1.nome);
        System.out.println("Nome acessado por pessoa2: " + pessoa2.nome);

        System.out.println("É o mesmo objeto? " + (pessoa1 == pessoa2));
    }
}
