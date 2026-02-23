
import java.util.Scanner;


public class repeticao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=1;i<=5;i++) {
            System.out.println("Informe o "+i+"/° número");
            int numero = sc.nextInt();

            System.out.println("O número iinfromado é "+numero);
        }
        sc.close();
    }
}
