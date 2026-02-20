import java.util.Scanner;

public class atvd2 {
    public static void main (String[] args ) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um número: ");
       double numero = sc.nextDouble();
    
       System.out.println("Digite um número: ");
       double numero2 = sc.nextDouble();

       System.out.println("Digite um número: ");
       double numero3 = sc.nextDouble();
       
       double media = numero + numero2 +numero3;
       double resultado = media / 3;

       if (resultado >= 5) {
        System.out.println("Aprovado");
       } else {
        System.out.println("Reprovado");  
       }
       
       System.out.println("Nota 1: " + numero);
       System.out.println("Nota 2: " + numero2);
       System.out.println("Nota 3: " + numero3);
       System.out.println("Média: " + resultado);
       sc.close();
    }
    
}
