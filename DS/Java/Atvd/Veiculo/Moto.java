package Veiculo;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, int ano, int cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}