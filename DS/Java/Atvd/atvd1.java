import java.util.Scanner;

public class atvd1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = sc.nextDouble();

        double soma = numero + numero2;
        double subtracao = numero - numero2;
        double multiplicacao = numero * numero2;
        double divisao = numero / numero2;

        System.out.println("Soma: "+soma+", Subtração: "+subtracao+", Multiplicação: "+multiplicacao+", Divisão: "+divisao);
        sc.close();
    }
}
    
