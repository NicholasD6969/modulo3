import java.util.Scanner;

public class positivonegativp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Esse número é positivo.");         
        } else  {
            System.out.println("Esse número é negativo.");
        }

        sc.close();
    }
}
