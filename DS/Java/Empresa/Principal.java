package DS.Java.Empresa;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empresa> lista = new ArrayList<>();

        try {
            System.out.println("Informe o nome do gerente: ");
            String nomeGerente = scanner.nextLine();
            System.out.println("Informe o salário base do gerente: ");
            double salarioBaseGerente = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            Gerente gerente = new Gerente(nomeGerente, salarioBaseGerente);
            lista.add(gerente);

            System.out.println("Informe o nome do vendedor: ");
            String nomeVendedor = scanner.nextLine();
            System.out.println("Informe o salário base do vendedor: ");
            double salarioBaseVendedor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            Vendedor vendedor = new Vendedor(nomeVendedor, salarioBaseVendedor);
            lista.add(vendedor);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, informe os dados corretamente.");
        } finally {
            for (Empresa emp : lista) {
                emp.exibirInformacoes();
                System.out.println("-----------------------");
            }
            System.out.println("Fim do programa.");
            scanner.close();
        }
    }
}
