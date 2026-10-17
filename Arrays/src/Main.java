
public class Main {

    public static void main(String[] args) {
        double[] notas = {8.0, 7.5, 9.0, 6.5, 10.0};

        double media = calcularMedia(notas);

        System.out.println("Média do aluno: " + media);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
