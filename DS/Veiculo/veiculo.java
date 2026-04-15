package DS.Veiculo;

public abstract class veiculo {
    protected String modelo;
    protected int ano;

    public veiculo(String modelo, int ano) {
        if (modelo.isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        }
        if (ano < 2000) {
            throw new IllegalArgumentException("O ano deve ser maior ou igual a 2000.");
        }
        this.modelo = modelo;
        this.ano = ano;


    }
    public abstract double calcularValor();

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + calcularValor());
    }

    
}
