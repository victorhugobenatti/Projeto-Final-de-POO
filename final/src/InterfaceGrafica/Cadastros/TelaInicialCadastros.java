package InterfaceGrafica.Cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicialCadastros extends JFrame {

    public TelaInicialCadastros(){

        setTitle("Tela Inicial de Cadastros");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);


        setLayout(null);

        JLabel titulo = new JLabel("Cadastros");
        titulo.setBounds(350, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        add(titulo);

        JButton Pessoas = new JButton("Pessoas");
        Pessoas.setBounds(150, 150, 200, 50);
        Pessoas.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Pessoas.setForeground(new Color(255,255,255));
        Pessoas.setBackground(new Color(0, 0, 0));
        add(Pessoas);
        Pessoas.addActionListener(this::cadastrarPessoas);

        JButton Produtos = new JButton("Produtos");
        Produtos.setBounds(150, 205, 200, 50);
        Produtos.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Produtos.setForeground(new Color(255,255,255));
        Produtos.setBackground(new Color(0, 0, 0));
        add(Produtos);
        Produtos.addActionListener(this::cadastrarProduto);

        JButton Estoque = new JButton("Estoque");
        Estoque.setBounds(150, 260, 200, 50);
        Estoque.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Estoque.setForeground(new Color(255,255,255));
        Estoque.setBackground(new Color(0, 0, 0));
        add(Estoque);
        Estoque.addActionListener(this::cadastrarEstoque);

        JButton ContaPagar = new JButton("Conta à Pagar");
        ContaPagar.setBounds(150, 315, 200, 50);
        ContaPagar.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        ContaPagar.setForeground(new Color(255,255,255));
        ContaPagar.setBackground(new Color(0, 0, 0));
        add(ContaPagar);
        ContaPagar.addActionListener(this::cadastrarContaPagar);

        JButton ContaReceber = new JButton("Conta à Receber");
        ContaReceber.setBounds(450, 150, 200, 50);
        ContaReceber.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        ContaReceber.setForeground(new Color(255,255,255));
        ContaReceber.setBackground(new Color(0, 0, 0));
        add(ContaReceber);
        ContaReceber.addActionListener(this::cadastrarContaReceber);

        JButton Endereco = new JButton("Endereço");
        Endereco.setBounds(450, 205, 200, 50);
        Endereco.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Endereco.setForeground(new Color(255,255,255));
        Endereco.setBackground(new Color(0, 0, 0));
        add(Endereco);
        Endereco.addActionListener(this::cadastrarEndereco);

        JButton Manutencao = new JButton("Manutenção");
        Manutencao.setBounds(450, 260, 200, 50);
        Manutencao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Manutencao.setForeground(new Color(255,255,255));
        Manutencao.setBackground(new Color(0, 0, 0));
        add(Manutencao);
        Manutencao.addActionListener(this::cadastrarManutencao);

        JButton Contrato = new JButton("Contrato");
        Contrato.setBounds(450, 315, 200, 50);
        Contrato.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Contrato.setForeground(new Color(255,255,255));
        Contrato.setBackground(new Color(0, 0, 0));
        add(Contrato);
        Contrato.addActionListener(this::cadastrarContrato);

        JButton Maquina = new JButton("Máquina");
        Maquina.setBounds(300, 370, 200, 50);
        Maquina.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Maquina.setForeground(new Color(255,255,255));
        Maquina.setBackground(new Color(0, 0, 0));
        add(Maquina);
        Maquina.addActionListener(this::cadastrarMaquina);
    }

    private void cadastrarPessoas(ActionEvent actionEvent){
        new EscolhaDePessoaCadastro();

    }

    private void cadastrarContrato(ActionEvent actionEvent){
        new CadastroContrato();

    }

    private void cadastrarContaPagar(ActionEvent actionEvent){
       new CadastroContaPagar();

    }

    private void cadastrarContaReceber(ActionEvent actionEvent){
        new CadastroContaReceber();

    }

    private void cadastrarEndereco(ActionEvent actionEvent){
        new CadastroEndereco();

    }

    private void cadastrarEstoque(ActionEvent actionEvent){
        new CadastroEstoque();

    }

    private void cadastrarManutencao(ActionEvent actionEvent){
        new CadastroManutencao();

    }

    private void cadastrarMaquina(ActionEvent actionEvent){
        new CadastroMaquina();

    }

    private void cadastrarProduto(ActionEvent actionEvent){
        new CadastroProduto();

    }
}
