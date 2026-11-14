import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do aluno não pode ser vazio.");
        }

        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
            return;
        }

        notas.add(nota);
        System.out.println("Nota adicionada com sucesso!");
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7;
    }

    public void exibirInformacoes() {
        System.out.println("\n===== INFORMAÇÕES DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Notas: " + notas);
        System.out.printf("Média: %.2f%n", calcularMedia());

        if (estaAprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}