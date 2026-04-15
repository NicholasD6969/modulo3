package DS.Java.Empresa;

public class Gerente extends Empresa {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000.0; // Gerente recebe um bônus fixo de 2000
    }
    
}
