import java.util.Scanner;

public class repeticao4 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1- Cadastro.");
            System.out.println("2- Listar");
            System.out.println("3- Remover");
            System.out.println("4- Sair");
            contador = sc.nextInt();


        } while (contador !=4);

        switch (contador) {
            case 1:
                System.out.println("Cadastro.");
                break;
            case 2:
                System.out.println("Listar.");
                break;
            case 3:
                System.out.println("Remover.");
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalída.");
                break;    
        }
        sc.close();
    }
}
