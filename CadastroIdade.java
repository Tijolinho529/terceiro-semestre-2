import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        try {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("A idade deve ser maior que zero.");
            } else {
                System.out.println("Idade cadastrada com sucesso: " + idade);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
            scanner.next();
        } finally {
            System.out.println("Finalizando programa...");
            scanner.close();
        }
    }
}