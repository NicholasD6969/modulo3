
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o numero: ");
            int numero = scanner.nextInt();
            System.out.println("O numero informado foi: " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, informe um número inteiro.");
        } finally {
            System.out.println("Fim do programa.");
            scanner.close();
        }
    }
}
