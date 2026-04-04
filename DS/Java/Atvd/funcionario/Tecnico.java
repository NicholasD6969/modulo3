package funcionario;

public class Tecnico extends Funcionario {
    public Tecnico(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getSalario() {
        return salario + 1000;
    }
    
}
