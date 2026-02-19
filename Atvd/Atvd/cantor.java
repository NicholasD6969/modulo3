import java.util.Scanner;

public class cantor {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int can = 0;
        while (can!= 5) {
            System.out.println("==GOSTO MUSICAL==");
            System.out.println("1- Matuê");
            System.out.println("2- Felipe Ret");
            System.out.println("3- Deivinho Novaes");
            System.out.println("4- Toque Dez");
            System.out.println("5- Sair");
            System.out.println("Escolha o cantor e veja o gst musical: ");
            can = sc.nextInt();

            switch (can){
                case 1:
                    System.out.println("Trap de qualidade. ");
                    break;
                case 2:
                    System.out.println("Trap inspirador. ");
                    break;
                case 3:
                    System.out.println("Pra sofrer por ela.");
                    break;
                case 4:
                    System.out.println("Arrocha pra ir na onda.");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;    
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
            
        }
        sc.close();
    }
}
