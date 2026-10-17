
public class Main {

    public static void main(String[] args) {

        exibirMensagem();
        exibirMensagem();
        exibirMensagem();

    }

    public static void exibirMensagem() {
        System.out.println("Olá, mundo!");
    }

    public static boolean senhaValida(String senha) {

    if (senha == null) {
        return false;
    }

    return senha.length() >= 8;
}
}
