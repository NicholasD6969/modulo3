package DS.Java.Pokemon;
import java.util.Scanner;
import java.util.ArrayList;

public class InicialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Inicial> pokemons = new ArrayList<>();

        pokemons.add(new Charmander());
        pokemons.add(new Squirtle());
        pokemons.add(new Bulbassauro());

        System.out.println("Escolha um Pokémon inicial:");
        System.out.println("1. Charmander");
        System.out.println("2. Squirtle");
        System.out.println("3. Bulbassauro");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                pokemons.get(0).emitirSom();
                break;
            case 2:
                pokemons.get(1).emitirSom();
                break;
            case 3:
                pokemons.get(2).emitirSom();
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                break;

        }
        scanner.close();
    }
}
