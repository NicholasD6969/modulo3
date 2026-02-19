import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é impar.");
        }
        sc.close();
    }
    
    
}
