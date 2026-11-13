public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        Usuario usuario2 = new Usuario(
            "Kennedy",
            "kennedy@email.com"
        );

        Usuario usuario3 = new Usuario(
            "Carlos",
            "carlos@email.com",
            25
        );

        System.out.println("Usuário 1:");
        System.out.println(usuario1.nome);
        System.out.println(usuario1.email);
        System.out.println(usuario1.idade);

        System.out.println("\nUsuário 2:");
        System.out.println(usuario2.nome);
        System.out.println(usuario2.email);
        System.out.println(usuario2.idade);

        System.out.println("\nUsuário 3:");
        System.out.println(usuario3.nome);
        System.out.println(usuario3.email);
        System.out.println(usuario3.idade);

    }

}