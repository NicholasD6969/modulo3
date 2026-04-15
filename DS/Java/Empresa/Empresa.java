package DS.Java.Empresa;

public abstract class Empresa {
    protected String nome;
    protected double salarioBase;

    public Empresa(String nome, double salarioBase) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário base não pode ser negativo.");
            
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Total: " + calcularSalario());
    }
    
}
