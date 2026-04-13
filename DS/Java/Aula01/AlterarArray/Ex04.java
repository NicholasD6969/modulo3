import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o nome: ");
            String nome = scanner.nextLine();
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode ser vazio.");
            }
            System.out.println("O nome informado foi: " + nome);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, informe um nome válido.");
        } finally {
            System.out.println("Fim do programa.");
            scanner.close();
        }
    }
}
