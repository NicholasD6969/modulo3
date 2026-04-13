public class Ex02 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array.");
        }
    }
}
