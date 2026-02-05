import java.util.Locale;

public class variavel2 {
    public static void main(String[] args) {
        double x = 10.99;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado: " + x + " metros" );
        System.out.printf("Resultado: %.2f metros%n", x);
    }  
}
