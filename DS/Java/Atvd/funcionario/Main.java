package funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Gerente("João", 5000);
        Funcionario f2 = new Tecnico("Maria", 3000);

        System.out.println("Nome: " + f1.nome);
        System.out.println("Tipo: " + f1.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f1.getSalario());
        System.out.println("------------------------------");

        System.out.println("Nome: " + f2.nome);
        System.out.println("Tipo: " + f2.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f2.getSalario());
        System.out.println("------------------------------");
    }
}