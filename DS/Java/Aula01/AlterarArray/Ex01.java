public class Ex01 {
    
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero."); 
        }
        finally {
            System.out.println("Fim do programa.");
        }
    }
}
