import java.util.Scanner;

public class embalagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emb = 0;
        while (emb!= 4) {
            System.out.println("Menu de embalagens.");
            System.out.println("Caixa de papelão.");
            System.out.println("Sacola plástica.");
            System.out.println("Embalagem de vidros.");
            System.out.println("Sair.");
            System.out.print("Qual opção você deseja: ");
            emb = sc.nextInt();

            switch (emb) {
                case 1:
                    System.out.println("Ideal pra transporte e armazenamento.");
                    break;
                case 2:
                    System.out.println("Leve a prática, mas pouco sustentavel.");
                    break;
                case 3:
                    System.out.println("Resistente e reutilizável.");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");    
                    break;
                default:
                    System.out.println("Opção invalída.");
            }
            

            
        }
        sc.close();
    }
}
