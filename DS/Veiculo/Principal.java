package DS.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<veiculo> lista = new ArrayList<>();

        try {
            System.out.println("Informe o modelo do carro: ");
            String modeloCarro = scanner.nextLine();
            
            System.out.println("Informe o ano do carro: ");
            int anoCarro = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Carro carro = new Carro(modeloCarro, anoCarro);
            lista.add(carro);

            System.out.println("Informe o modelo da moto: ");
            String modeloMoto = scanner.nextLine();
            System.out.println("Informe o ano da moto: ");
            int anoMoto = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Moto moto = new Moto(modeloMoto, anoMoto);
            lista.add(moto);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, informe os dados corretamente.");
        } finally {
            System.out.println("Fim do programa.");
            scanner.close();
        }
    }
}
