package InterfaceGrafica.Exclusoes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicialExclusao extends JFrame {

    public TelaInicialExclusao(){
        setTitle("Tela Inicial de Exclusão");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);


        setLayout(null);

        JLabel titulo = new JLabel("Exclusão");
        titulo.setBounds(350, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        add(titulo);

        JButton Pessoas = new JButton("Pessoas");
        Pessoas.setBounds(150, 150, 200, 50);
        Pessoas.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Pessoas.setForeground(new Color(255,255,255));
        Pessoas.setBackground(new Color(0, 0, 0));
        add(Pessoas);
        Pessoas.addActionListener(this::exclusaoPessoas);

        JButton Produtos = new JButton("Produtos");
        Produtos.setBounds(150, 205, 200, 50);
        Produtos.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Produtos.setForeground(new Color(255,255,255));
        Produtos.setBackground(new Color(0, 0, 0));
        add(Produtos);
        Produtos.addActionListener(this::exclusaoProduto);

        JButton Estoque = new JButton("Estoque");
        Estoque.setBounds(150, 260, 200, 50);
        Estoque.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Estoque.setForeground(new Color(255,255,255));
        Estoque.setBackground(new Color(0, 0, 0));
        add(Estoque);
        Estoque.addActionListener(this::exclusaoEstoque);

        JButton ContaPagar = new JButton("Conta à Pagar");
        ContaPagar.setBounds(150, 315, 200, 50);
        ContaPagar.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        ContaPagar.setForeground(new Color(255,255,255));
        ContaPagar.setBackground(new Color(0, 0, 0));
        add(ContaPagar);
        ContaPagar.addActionListener(this::exclusaoContaPagar);

        JButton ContaReceber = new JButton("Conta à Receber");
        ContaReceber.setBounds(450, 150, 200, 50);
        ContaReceber.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        ContaReceber.setForeground(new Color(255,255,255));
        ContaReceber.setBackground(new Color(0, 0, 0));
        add(ContaReceber);
        ContaReceber.addActionListener(this::exclusaoContaReceber);

        JButton Endereco = new JButton("Endereço");
        Endereco.setBounds(450, 205, 200, 50);
        Endereco.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Endereco.setForeground(new Color(255,255,255));
        Endereco.setBackground(new Color(0, 0, 0));
        add(Endereco);
        Endereco.addActionListener(this::exclusaoEndereco);

        JButton Manutencao = new JButton("Manutenção");
        Manutencao.setBounds(450, 260, 200, 50);
        Manutencao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Manutencao.setForeground(new Color(255,255,255));
        Manutencao.setBackground(new Color(0, 0, 0));
        add(Manutencao);
        Manutencao.addActionListener(this::exclusaoManutencao);

        JButton Contrato = new JButton("Contrato");
        Contrato.setBounds(450, 315, 200, 50);
        Contrato.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Contrato.setForeground(new Color(255,255,255));
        Contrato.setBackground(new Color(0, 0, 0));
        add(Contrato);
        Contrato.addActionListener(this::exclusaoContrato);

        JButton Maquina = new JButton("Máquina");
        Maquina.setBounds(300, 370, 200, 50);
        Maquina.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Maquina.setForeground(new Color(255,255,255));
        Maquina.setBackground(new Color(0, 0, 0));
        add(Maquina);
        Maquina.addActionListener(this::exclusaoMaquina);
    }

    private void exclusaoPessoas(ActionEvent actionEvent){
        new EscolhaDePessoaExclusao();

    }

    private void exclusaoContrato(ActionEvent actionEvent){
        new ExclusaoContrato();

    }

    private void exclusaoContaPagar(ActionEvent actionEvent){
        new ExclusaoContaPagar();

    }

    private void exclusaoContaReceber(ActionEvent actionEvent){
        new ExclusaoContaReceber();

    }

    private void exclusaoEndereco(ActionEvent actionEvent){
        new ExclusaoEndereco();

    }

    private void exclusaoEstoque(ActionEvent actionEvent){
        new ExclusaoEstoque();

    }

    private void exclusaoManutencao(ActionEvent actionEvent){
        new ExclusaoManutencao();

    }

    private void exclusaoMaquina(ActionEvent actionEvent){
        new ExclusaoMaquina();

    }

    private void exclusaoProduto(ActionEvent actionEvent){
        new ExclusaoProduto();

    }

}
