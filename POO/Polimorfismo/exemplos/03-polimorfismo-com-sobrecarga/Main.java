public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(10, 20);

        double resultado2 = calculadora.somar(10.5, 20.5);

        int resultado3 = calculadora.somar(10, 20, 30);

        double resultado4 = calculadora.somar(10.5, 5);

        System.out.println("Soma de dois inteiros: " + resultado1);

        System.out.println("Soma de dois decimais: " + resultado2);

        System.out.println("Soma de três inteiros: " + resultado3);

        System.out.println("Soma de decimal com inteiro: " + resultado4);
    }
}