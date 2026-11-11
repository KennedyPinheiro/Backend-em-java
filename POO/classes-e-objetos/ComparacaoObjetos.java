public class ComparacaoObjetos {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        Aluno aluno2 = aluno1;

        Aluno aluno3 = new Aluno();

        System.out.println(aluno1 == aluno2);

        System.out.println(aluno1 == aluno3);
    }
}