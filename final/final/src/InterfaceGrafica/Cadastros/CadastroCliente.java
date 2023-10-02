package InterfaceGrafica.Cadastros;

import Classes.App;
import Classes.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

    JLabel nome = new JLabel("Nome:");
    JLabel cpf = new JLabel("CPF:");
    JLabel dataDeNascimento = new JLabel("Data de Nascimento:");
    JLabel email = new JLabel("E-mail:");
    JLabel telefone = new JLabel("Telefone:");
    JTextField campo_nome = new JTextField();
    JTextField campo_cpf = new JTextField();
    JTextField campo_dataDeNascimento = new JTextField();
    JTextField campo_email = new JTextField();
    JTextField campo_telefone = new JTextField();
    public CadastroCliente(){
        setTitle("Cadastro de Clientes");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Clientes");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Nome da Pessoa--------------------------------
        nome.setBounds(20, 100, 100, 20);
        add(nome);

        campo_nome.setBounds(110, 100, 590, 20);
        add(campo_nome);
        //-------------------------------------------------

        //CPF--------------------------------
        cpf.setBounds(20, 130, 100, 20);
        add(cpf);

        campo_cpf.setBounds(110, 130, 590, 20);
        add(campo_cpf);
        //-------------------------------------------------

        //Data de Nascimento--------------------------------
        dataDeNascimento.setBounds(20, 160, 140, 20);
        add(dataDeNascimento);

        campo_dataDeNascimento.setBounds(150, 160, 550, 20);
        add(campo_dataDeNascimento);
        //-------------------------------------------------

        //E-mail--------------------------------
        email.setBounds(20, 190, 100, 20);
        add(email);

        campo_email.setBounds(110, 190, 590, 20);
        add(campo_email);
        //-------------------------------------------------

        //Telefone--------------------------------
        telefone.setBounds(20, 220, 100, 20);
        add(telefone);

        campo_telefone.setBounds(110, 220, 590, 20);
        add(campo_telefone);
        //-------------------------------------------------

        JButton confirma = new JButton("OK");
        confirma.setBounds(350, 400, 100, 50);
        add(confirma);
        confirma.addActionListener(this::confirmar);
    }

    void confirmar(ActionEvent actionEvent){
        try {
            //Cria com base nas informações preenchidas.
            Cliente cliente = new Cliente(campo_telefone.getText(), campo_email.getText(),
                    campo_nome.getText(), campo_cpf.getText(), campo_dataDeNascimento.getText());

            //Adiciona ao ArrayList.
            App.Clientes.add(cliente);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não pode ser cadastrado!");
        }
    }
}
