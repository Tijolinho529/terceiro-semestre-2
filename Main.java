public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("Anderson", 25, 1550);

        Gerente ger = new Gerente("Carlos", 25, 2000, 300);

        System.out.println("O nome do gerente é: "+ger.getNome());
        System.out.println("O nome do funconário é: "+func.getNome);
    }
}