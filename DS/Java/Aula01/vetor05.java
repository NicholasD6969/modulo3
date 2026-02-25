
import java.util.Scanner;

public class vetor05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String [] nomes = new String [3];

        for (int i=1;i<nomes.length;i++){
            System.out.println("Informe o "+i+"° nome");
            nomes[i] = sc.nextLine();

            System.out.println("O nome é "+nomes[i]);
        }
        for (String n: nomes){
            System.out.println(n);
        }
}
}