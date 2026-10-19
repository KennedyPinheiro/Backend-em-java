import java.util.ArrayList;

public class GerenciadorNotas {

    private ArrayList<Nota> notas;

    public GerenciadorNotas() {
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double valor) {
        Nota nota = new Nota(valor);
        this.notas.add(nota);
    }

    public void listarNotas() {

        for (int i = 0; i < this.notas.size(); i++) {
            System.out.println(
                "Nota " + (i + 1) + ": "
                + this.notas.get(i).getNota()
            );
        }
    }

    public double calcularMedia() {

        if (this.notas.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (int i = 0; i < this.notas.size(); i++) {
            soma += this.notas.get(i).getNota();
        }

        return soma / this.notas.size();
    }
}