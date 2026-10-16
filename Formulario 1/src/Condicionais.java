public class Condicionais {

    public static void main(String[] args) {

        boolean autenticado = true;
        boolean administrador = true;

        if (autenticado) {

            if (administrador) {
                System.out.println("Acesso à área administrativa permitido.");
            } else {
                System.out.println("Você não possui permissão de administrador.");
            }

        } else {
            System.out.println("Você precisa fazer login.");
        }

    }

}
