public class Excecao {

    public static void main(String[] args) {

        int [] Array  = {10, 20, 30, 40};
        int indece = 5;

        try {
            System.out.println("Elemento do índice: "+indece+":" + +Array[indece]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Elemento não pertence ao indece");

        } finally {
            System.out.println("Finalizando...");
            
        }
    }
}