public class Main {

    public static void main(String[] args) {

        String nome = "Kennedy";
        String email = "kennedy@email.com";
        String senha = "12345678";

        boolean cadastroValido = validarCadastro(nome, email, senha);

        if (cadastroValido) {
            System.out.println("Cadastro válido!");
        } else {
            System.out.println("Cadastro inválido!");
        }
    }

    public static boolean validarCadastro(
            String nome,
            String email,
            String senha
    ) {
        return campoPreenchido(nome)
                && campoPreenchido(email)
                && senhaValida(senha);
    }

    public static boolean campoPreenchido(String valor) {
        return valor != null && !valor.isBlank();
    }

    public static boolean senhaValida(String senha) {

        if (senha == null) {
            return false;
        }

        return senha.length() >= 8;
    }
}