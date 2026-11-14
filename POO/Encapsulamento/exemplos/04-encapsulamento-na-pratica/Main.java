public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Kennedy");

        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);
        aluno.adicionarNota(9.0);

        // Tentativa de adicionar uma nota inválida
        aluno.adicionarNota(15.0);

        aluno.exibirInformacoes();
    }
}