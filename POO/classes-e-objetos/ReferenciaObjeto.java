public class ReferenciaObjeto {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Kennedy";
        aluno1.idade = 22;

        Aluno aluno2 = aluno1;

        aluno2.nome = "Maria";

        System.out.println(aluno1.nome);
    }
}