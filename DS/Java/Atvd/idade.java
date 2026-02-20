import java.util.Scanner;

public class idade {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe sua idade: ");
    int idade = sc.nextInt();

    if (idade <= 12) {
        System.out.println("Você é criança.");
    } else if (idade <= 17) {
        System.out.println("Você é adolescente.");
    } else if (idade < 60 ) {
        System.out.println("Você é adulto.");
    } else {
        System.out.println("Você está perto de morrer.");
    }
    sc.close();
    
}
}
