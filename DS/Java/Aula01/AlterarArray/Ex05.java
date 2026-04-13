import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int op = 1;

        while (op != 0) {
            try {
                System.out.println("=== Menu ===");
                System.out.println("1. Adicionar");
                System.out.println("2. Listar");
                System.out.println("3. Remover");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                op = Integer.parseInt(scanner.nextLine());
                switch (op) {
                    case 1:
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();
                    lista.add(nome);
                    break;
                    case 2:
                    System.out.println("Lista de nomes: ");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (String item : lista) {
                            System.out.println(item);
                        }
                    }
                    break;
                    case 3:
                    System.out.println("Digite o nome a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (lista.remove(nomeRemover)) {
                        System.out.println("Nome removido com sucesso.");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;
                    case 0:
                    System.out.println("Saindo do programa.");
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa a entrada inválida
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice fora dos limites da lista.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                scanner.nextLine(); // Limpa a entrada inválida
            }
}
    }
}