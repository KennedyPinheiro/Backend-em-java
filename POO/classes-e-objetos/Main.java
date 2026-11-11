public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Kennedy";
        aluno1.idade = 22;
        aluno1.nota = 8.5;

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Maria";
        aluno2.idade = 20;
        aluno2.nota = 9.0;

        aluno1.apresentarDados();

        System.out.println("----------------");

        aluno2.apresentarDados();
    }
}