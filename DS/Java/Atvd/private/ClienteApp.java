
public class ClienteApp {
    
    public static void main(String[] args) {
       // ClientePf pf = new ClientePf(codigo: 1, nome: "João Silva", endereco: "Rua A, 123", cpf: "123.456.789-00");

       // pf.exibirDados();
       Cliente c1 = new ClientePf(0, null, null, null);
       Cliente c2 = new ClientePj(0, null, null, null);
       c1.exibirDados();
       c2.exibirDados();
    }
}
