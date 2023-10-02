package InterfaceGrafica.Cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import Classes.*;

public class CadastroFuncionario extends JFrame{

//    JLabel pessoa = new JLabel("Pessoa:");
//    String[] tipos = {"Física", "Jurídica"};
//    JComboBox tipoPessoa = new JComboBox(tipos);
    JLabel nome = new JLabel("Nome:");
    JLabel id_chefe = new JLabel("ID do Chefe:");
    JLabel cpf = new JLabel("CPF:");
    JLabel dataDeNascimento = new JLabel("Data de Nascimento:");
    JLabel email = new JLabel("E-mail:");
    JLabel telefone = new JLabel("Telefone:");
    JTextField campo_nome = new JTextField();
    JTextField campo_id_chefe = new JTextField();
    JTextField campo_cpf = new JTextField();
    JTextField campo_dataDeNascimento = new JTextField();
    JTextField campo_email = new JTextField();
    JTextField campo_telefone = new JTextField();


    public CadastroFuncionario(){
        setTitle("Cadastro de Funcionários");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Funcionários");
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

        //Nome da Pessoa--------------------------------
        nome.setBounds(20, 100, 100, 20);
        add(nome);

        campo_nome.setBounds(110, 100, 590, 20);
        add(campo_nome);
        //-------------------------------------------------

        //ID do Chefe--------------------------------
        id_chefe.setBounds(20, 130, 100, 20);
        add(id_chefe);

        campo_id_chefe.setBounds(110, 130, 590, 20);
        add(campo_id_chefe);
        //-------------------------------------------------

        //CPF--------------------------------
        cpf.setBounds(20, 160, 100, 20);
        add(cpf);

        campo_cpf.setBounds(110, 160, 590, 20);
        add(campo_cpf);
        //-------------------------------------------------

        //Data de Nascimento--------------------------------
        dataDeNascimento.setBounds(20, 190, 140, 20);
        add(dataDeNascimento);

        campo_dataDeNascimento.setBounds(150, 190, 550, 20);
        add(campo_dataDeNascimento);
        //-------------------------------------------------

        //E-mail--------------------------------
        email.setBounds(20, 220, 100, 20);
        add(email);

        campo_email.setBounds(110, 220, 590, 20);
        add(campo_email);
        //-------------------------------------------------

        //Telefone--------------------------------
        telefone.setBounds(20, 250, 100, 20);
        add(telefone);

        campo_telefone.setBounds(110, 250, 590, 20);
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
            Funcionario funcionario = new Funcionario(campo_telefone.getText(), campo_email.getText(),
                    campo_nome.getText(), campo_cpf.getText(), campo_dataDeNascimento.getText(),
                    Integer.parseInt(campo_id_chefe.getText()));

            //Adiciona ao ArrayList.
            App.Funcionarios.add(funcionario);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "ID do Chefe deve ser um número inteiro!", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}
