package veiculo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaCarros {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao;

        do {
            String menu = """
                    1 - Cadastrar Carro
                    2 - Listar Carros
                    3 - Detalhar Carro
                    4 - Alterar Carro
                    5 - Remover Carro
                    6 - Gravar em Arquivo
                    7 - Sair
                    """;

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {

                case 1: // Cadastrar
                    String marca = JOptionPane.showInputDialog("Marca:");
                    String modelo = JOptionPane.showInputDialog("Modelo:");
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));

                    listaCarros.add(new Carro(marca, modelo, ano));
                    JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                    break;

                case 2: // Listar
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        String lista = "";
                        for (int i = 0; i < listaCarros.size(); i++) {
                            Carro c = listaCarros.get(i);
                            lista += i + " - " + c.getMarca() + " " + c.getModelo() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 3: // Detalhar
                    int idxDetalhe = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro:"));
                    if (idxDetalhe >= 0 && idxDetalhe < listaCarros.size()) {
                        JOptionPane.showMessageDialog(null, listaCarros.get(idxDetalhe).exibirDetalhes());
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido!");
                    }
                    break;

                case 4: // Alterar
                    int idxAlterar = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro:"));

                    if (idxAlterar >= 0 && idxAlterar < listaCarros.size()) {
                        String novaMarca = JOptionPane.showInputDialog("Nova Marca:");
                        String novoModelo = JOptionPane.showInputDialog("Novo Modelo:");
                        int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Novo Ano:"));

                        listaCarros.set(idxAlterar, new Carro(novaMarca, novoModelo, novoAno));
                        JOptionPane.showMessageDialog(null, "Carro atualizado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido!");
                    }
                    break;

                case 5: // Remover
                    int idxRemover = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro:"));

                    if (idxRemover >= 0 && idxRemover < listaCarros.size()) {
                        listaCarros.remove(idxRemover);
                        JOptionPane.showMessageDialog(null, "Carro removido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido!");
                    }
                    break;

                case 6: // Gravar em arquivo
                    try {
                        FileWriter writer = new FileWriter("carros.txt");

                        for (Carro c : listaCarros) {
                            writer.write("Marca: " + c.getMarca() + "\n");
                            writer.write("Modelo: " + c.getModelo() + "\n");
                            writer.write("Ano: " + c.getAno() + "\n");
                            writer.write("----------------------\n");
                        }

                        writer.close();
                        JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo.");
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 7);
    }
}