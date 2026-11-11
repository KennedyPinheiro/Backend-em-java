public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Kennedy");
        Pessoa pessoa2 = pessoa1;
        Pessoa pessoa3 = new Pessoa("Kennedy");

        System.out.println(pessoa1 == pessoa2); // true: mesma instância
        System.out.println(pessoa1 == pessoa3); // false: instâncias diferentes
    }
}
