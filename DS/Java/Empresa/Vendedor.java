package DS.Java.Empresa;

public class Vendedor extends Empresa {

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 300; // Vendedor recebe um bônus fixo de 3000
    }
    
}
