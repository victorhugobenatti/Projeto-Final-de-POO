package InterfaceGrafica.Cadastros;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroFornecedor extends JFrame {

    JLabel nomeFantasia = new JLabel("Nome Fantasia:");
    JLabel cnpj = new JLabel("CNPJ:");
    JLabel email = new JLabel("E-mail:");
    JLabel telefone = new JLabel("Telefone:");
    JTextField campo_nomeFantasia = new JTextField();
    JTextField campo_cnpj = new JTextField();
    JTextField campo_email = new JTextField();
    JTextField campo_telefone = new JTextField();

    public CadastroFornecedor(){
        setTitle("Cadastro de Fornecedores");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Fornecedores");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

//        //Tipo de Pessoa--------------------------------
//        pessoa.setBounds(20, 130, 50, 20);
//        add(pessoa);
//
//        tipoPessoa.setBounds(80, 130, 100, 20);
//        add(tipoPessoa);
//        //----------------------------------------------

        //Nome do Fornecedor--------------------------------
        nomeFantasia.setBounds(20, 100, 100, 20);
        add(nomeFantasia);

        campo_nomeFantasia.setBounds(110, 100, 590, 20);
        add(campo_nomeFantasia);
        //-------------------------------------------------

        //CNPJ--------------------------------
        cnpj.setBounds(20, 130, 100, 20);
        add(cnpj);

        campo_cnpj.setBounds(110, 130, 590, 20);
        add(campo_cnpj);
        //-------------------------------------------------

        //E-mail--------------------------------
        email.setBounds(20, 160, 100, 20);
        add(email);

        campo_email.setBounds(110, 160, 590, 20);
        add(campo_email);
        //-------------------------------------------------

        //Telefone--------------------------------
        telefone.setBounds(20, 190, 100, 20);
        add(telefone);

        campo_telefone.setBounds(110, 190, 590, 20);
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
            Fornecedor fornecedor = new Fornecedor(campo_telefone.getText(), campo_email.getText(),
                    campo_nomeFantasia.getText(), campo_cnpj.getText());

            //Adiciona ao ArrayList.
            App.Fornecedores.add(fornecedor);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Fornecedor adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Fornecedor não pode ser cadastrado!");
        }
    }
}
