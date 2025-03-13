public class Main3 {
    public static void main(String[] args) {

        Forma circulo = new Circulo(5);
        double formatoCirculo = circulo.calcularArea();
        System.out.println("Formato do círculo: " + formatoCirculo);

        Forma retangulo = new Retangulo(4,6);
        double formatoRetangulo = retangulo.calcularArea();
        System.out.println("Formato do retângulo: " + formatoRetangulo);
    }
}