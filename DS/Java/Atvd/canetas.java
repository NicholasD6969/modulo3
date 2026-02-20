import java.util.Scanner;

public class canetas {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
         int can = 0;

         while (can!= 4) {
            System.out.println("== MENU DE CANETAS ==");
            System.out.println("CANETA ESTEROGRÁFICA");
            System.out.println("CANETA TINTEIRO");
            System.out.println("CANETA GEL");
            System.out.println("SAIR.");
            System.out.print("Escolha opção: ");
            can = sc.nextInt();

            switch (can) {
                case 1:
                    System.out.println("Economia e de longa duração.");
                    break;
                case 2:
                    System.out.println("Clássica e elegante, usada para o curso de caligráfia.");
                    break;
                case 3:
                    System.out.println("Tinta mais pigmentada e escrita suave.");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
         }
         sc.close();
    }
    
}
