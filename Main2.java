public class Main2 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Picles", 4, "Labrador");
            Gato gato = new Gato("Tonico", 4, "Siamês");
    
            System.out.println("Detalhes do Cachorro: "+cachorro.getNome());
            cachorro.exibirSom();
    
            System.out.println("\nDetalhes do Gato: "+gato.getNome());
            gato.exibirSom();
    }
}