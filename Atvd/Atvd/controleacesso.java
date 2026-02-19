import java.util.Scanner;

public class controleacesso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "CV";

        System.out.print("Informe o codigo de acesso: ");
        String codigo = sc.nextLine();

        if (codigo.equals(senha)) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
        }
        sc.close();
    }
    
}
