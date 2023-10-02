package InterfaceGrafica.Consultas;

import InterfaceGrafica.Cadastros.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicialConsultas extends JFrame {

    public TelaInicialConsultas(){
        setTitle("Tela Inicial de Consultas");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);


        setLayout(null);

        JLabel titulo = new JLabel("Consultas");
        titulo.setBounds(350, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        add(titulo);

        JButton Pessoas = new JButton("Pessoas");
        Pessoas.setBounds(150, 150, 200, 50);
        Pessoas.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Pessoas.setForeground(new Color(255,255,255));
        Pessoas.setBackground(new Color(0, 0, 0));
        add(Pessoas);
        Pessoas.addActionListener(this::consultarPessoas);

        JButton Produtos = new JButton("Produtos");
        Produtos.setBounds(150, 205, 200, 50);
        Produtos.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Produtos.setForeground(new Color(255,255,255));
        Produtos.setBackground(new Color(0, 0, 0));
        add(Produtos);
        Produtos.addActionListener(this::consultarProduto);

        JButton Estoque = new JButton("Estoque");
        Estoque.setBounds(150, 260, 200, 50);
        Estoque.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        Estoque.setForeground(new Color(255,255,255));
        Estoque.setBackground(new Color(0, 0, 0));
        add(Estoque);
        Estoque.addActionListener(this::consultarEstoque);

        JButton ContaPagar = new JButton("Conta à Pagar");
        ContaPagar.setBounds(150, 315, 200, 50);
        ContaPagar.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        ContaPagar.setForeground(new Color(255,255,255));
        ContaPagar.setBackground(new Color(0, 0, 0));
        add(ContaPagar);
        ContaPagar.addActionListener(this::consultarContaPagar);

        JButton consultarContaReceber = new JButton("Conta à Receber");
        consultarContaReceber.setBounds(450, 150, 200, 50);
        consultarContaReceber.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultarContaReceber.setForeground(new Color(255,255,255));
        consultarContaReceber.setBackground(new Color(0, 0, 0));
        add(consultarContaReceber);
        consultarContaReceber.addActionListener(this::consultarContaReceber);

        JButton consultarEndereco = new JButton("Endereço");
        consultarEndereco.setBounds(450, 205, 200, 50);
        consultarEndereco.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultarEndereco.setForeground(new Color(255,255,255));
        consultarEndereco.setBackground(new Color(0, 0, 0));
        add(consultarEndereco);
        consultarEndereco.addActionListener(this::consultarEndereco);

        JButton consultarManutencao = new JButton("Manutenção");
        consultarManutencao.setBounds(450, 260, 200, 50);
        consultarManutencao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultarManutencao.setForeground(new Color(255,255,255));
        consultarManutencao.setBackground(new Color(0, 0, 0));
        add(consultarManutencao);
        consultarManutencao.addActionListener(this::consultarManutencao);

        JButton consultarContrato = new JButton("Contrato");
        consultarContrato.setBounds(450, 315, 200, 50);
        consultarContrato.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultarContrato.setForeground(new Color(255,255,255));
        consultarContrato.setBackground(new Color(0, 0, 0));
        add(consultarContrato);
        consultarContrato.addActionListener(this::consultarContrato);

        JButton consultarMaquina = new JButton("Maquina");
        consultarMaquina.setBounds(300, 370, 200, 50);
        consultarMaquina.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultarMaquina.setForeground(new Color(255,255,255));
        consultarMaquina.setBackground(new Color(0, 0, 0));
        add(consultarMaquina);
        consultarMaquina.addActionListener(this::consultarMaquina);
    }

    private void consultarPessoas(ActionEvent actionEvent){
        new EscolhaDePessoaConsultar();

    }

    private void consultarContrato(ActionEvent actionEvent){
        new ConsultarContrato();

    }

    private void consultarContaPagar(ActionEvent actionEvent){
        new ConsultarContaPagar();

    }

    private void consultarContaReceber(ActionEvent actionEvent){
        new ConsultarContaReceber();

    }

    private void consultarEndereco(ActionEvent actionEvent){
        new ConsultarEndereco();

    }

    private void consultarEstoque(ActionEvent actionEvent){
        new ConsultarEstoque();

    }

    private void consultarManutencao(ActionEvent actionEvent){
        new ConsultarManutencao();

    }

    private void consultarMaquina(ActionEvent actionEvent){
        new ConsultarMaquina();

    }

    private void consultarProduto(ActionEvent actionEvent){
        new ConsultarProduto();

    }

}
