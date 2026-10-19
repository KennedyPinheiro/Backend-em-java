public class Main {

    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int resultado = somarMatriz(numeros);

        System.out.println("Soma: " + resultado);
    }

    public static int somarMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}