package InterfaceGrafica.Consultas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EscolhaDePessoaConsultar extends JFrame{

    public EscolhaDePessoaConsultar(){
        setTitle("Escolher o tipo de pessoa.");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);


        setLayout(null);

        JLabel titulo = new JLabel("Escolha o Tipo de Pessoa:");
        titulo.setBounds(250, 20, 300, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        add(titulo);

        JButton funcionario = new JButton("Funcionário");
        funcionario.setBounds(150, 150, 150, 50);
        funcionario.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        funcionario.setForeground(new Color(255,255,255));
        funcionario.setBackground(new Color(0, 0, 0));
        add(funcionario);
        funcionario.addActionListener(this::Funcionario);

        JButton fornecedor = new JButton("Fornecedor");
        fornecedor.setBounds(150, 205, 150, 50);
        fornecedor.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        fornecedor.setForeground(new Color(255,255,255));
        fornecedor.setBackground(new Color(0, 0, 0));
        add(fornecedor);
        fornecedor.addActionListener(this::Fornecedor);

        JButton cliente = new JButton("Cliente");
        cliente.setBounds(150,260, 150, 50);
        cliente.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        cliente.setForeground(new Color(255,255,255));
        cliente.setBackground(new Color(0, 0, 0));
        add(cliente);
        cliente.addActionListener(this::Cliente);
    }

    private void Funcionario(ActionEvent actionEvent){
        new ConsultarFuncionario();

    }

    private void Fornecedor(ActionEvent actionEvent){
        new ConsultarFornecedor();

    }

    private void Cliente(ActionEvent actionEvent){
        new ConsultarCliente();

    }
}
