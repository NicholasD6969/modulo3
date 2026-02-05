import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = sc.next();

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);
        sc.close();
}
}
