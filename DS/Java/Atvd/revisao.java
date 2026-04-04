import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] onibus = new int[4];
        int [] assentos = new int[4];
        int [] passageiros = new int[20];
        int [] reservasonibus = new int[20];
        int buzu = 0;

        while (buzu!= 6) {
            
        
        System.out.println("--MENU--");
        System.out.println("1- Registrar o número de cada ônibus.");
        System.out.println("2- Registrar o quantitativo de assentos disponíveis em cada ônibus.");
        System.out.println("3- Reservar passagem.");
        System.out.println("4- Consultar por ônibus.");
        System.out.println("5- Consultar por passageiro.");
        System.out.println("6- Sair.");
        System.out.print("Escolha uma opção: ");
        buzu = scanner.nextInt();
        switch (buzu) {
            case 1:
                for (int i =0; i < onibus.length; i++) {
                    System.out.print("Digite o número do ônibus " + (i+1) + ": ");
                    onibus[i] = scanner.nextInt();
                }
            case 2:
                for (int i =0; i < assentos.length; i++) {
                    System.out.print("Digite o número de assentos disponíveis para o ônibus " + onibus[i] + ": ");
                    assentos[i] = scanner.nextInt();
                    
                }
            case 3:
                System.out.print("Digite o número do ônibus para reservar a passagem: ");
                  
                
        }
    }
        
    }
        }
    