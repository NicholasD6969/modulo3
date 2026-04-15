package DS.Veiculo;

public class Carro extends veiculo {

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public double calcularValor() {
        return 30000.0; // Valor fixo para carros
    }
    
}
