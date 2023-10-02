package InterfaceGrafica.Cadastros;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroEndereco extends JFrame{
    JLabel cep = new JLabel("CEP:");
    JLabel estado = new JLabel("Estado:");
    JLabel cidade = new JLabel("Cidade:");
    JLabel bairro = new JLabel("Bairro:");
    JLabel logradouro = new JLabel("Logradouro:");
    JLabel numero = new JLabel("Número:");
    JTextField campo_cep = new JTextField();
    JTextField campo_estado = new JTextField();
    JTextField campo_cidade = new JTextField();
    JTextField campo_bairro = new JTextField();
    JTextField campo_logradouro = new JTextField();
    JTextField campo_numero = new JTextField();

    public CadastroEndereco(){
        setTitle("Cadastro de Endereços");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Endereços");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //CEP--------------------------------
        cep.setBounds(20, 100, 100, 20);
        add(cep);

        campo_cep.setBounds(110, 100, 590, 20);
        add(campo_cep);
        //-------------------------------------------------

        //Estado--------------------------------
        estado.setBounds(20, 130, 100, 20);
        add(estado);

        campo_estado.setBounds(110, 130, 590, 20);
        add(campo_estado);
        //-------------------------------------------------

        //Cidade--------------------------------
        cidade.setBounds(20, 160, 140, 20);
        add(cidade);

        campo_cidade.setBounds(110, 160, 590, 20);
        add(campo_cidade);
        //-------------------------------------------------

        //Bairro--------------------------------
        bairro.setBounds(20, 190, 100, 20);
        add(bairro);

        campo_bairro.setBounds(110, 190, 590, 20);
        add(campo_bairro);
        //-------------------------------------------------

        //Logradouro--------------------------------
        logradouro.setBounds(20, 220, 100, 20);
        add(logradouro);

        campo_logradouro.setBounds(110, 220, 590, 20);
        add(campo_logradouro);
        //-------------------------------------------------

        //Numero--------------------------------
        numero.setBounds(20, 250, 100, 20);
        add(numero);

        campo_numero.setBounds(110, 250, 590, 20);
        add(campo_numero);
        //-------------------------------------------------

        JButton confirma = new JButton("OK");
        confirma.setBounds(350, 400, 100, 50);
        add(confirma);
        confirma.addActionListener(this::confirmar);
    }

    void confirmar(ActionEvent actionEvent){
        try {
            //Cria com base nas informações preenchidas.
            Endereco endereco = new Endereco(campo_logradouro.getText(), Integer.parseInt(campo_numero.getText()),
                    campo_bairro.getText(), campo_cidade.getText(), campo_estado.getText(), campo_cep.getText());

            //Adiciona ao ArrayList.
            App.Enderecos.add(endereco);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Endereço adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite o número do endereço usando números inteiros! (Use 0 para S/N)", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}
