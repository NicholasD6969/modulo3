package funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double getSalario() {
        return salario + 2000;
    }   
    
}
