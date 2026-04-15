package DS.Veiculo;

public class Moto extends veiculo {

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public double calcularValor() {
        return 15000.0; // Valor fixo para motos
    }
    
}
