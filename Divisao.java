public class Divisao {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        int resultado;

        try {
            resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero não permitida.");
        } finally {
            System.out.println("Finalizando programa...");
        }
    }
}