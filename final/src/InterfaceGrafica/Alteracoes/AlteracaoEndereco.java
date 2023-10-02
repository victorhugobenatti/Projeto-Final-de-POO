package InterfaceGrafica.Alteracoes;

import Classes.*;
import InterfaceGrafica.TratamentoDeErros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AlteracaoEndereco extends JFrame {
    JComboBox<Endereco> alteracao;
    JComboBox<String> campoAlterar;
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JTextField txtfield = new JTextField();
    private static Endereco item_selecionado;

    public AlteracaoEndereco(){
        setTitle("Alteração de Endereço");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Alteração de Endereço");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Botão de confirmação do objeto---------
        btn1.setText("Confirma");
        btn1.setBounds(330,130,100,20);
        btn1.setBackground(new Color(100, 100, 100));
        btn1.setForeground(new Color(255,255,255));
        add(btn1);
        btn1.addActionListener(this::btn1);

        //Botão para alterar os dados-------
        btn2.setText("OK");
        btn2.setBounds(350, 400, 100, 50);
        add(btn2);
        btn2.addActionListener(this::btn2);

        //Botão de seleção do objeto a ser consultado---------
        alteracao = new JComboBox<>();
        alteracao.setBounds(20, 100, 300, 20);
        for(Endereco endereco : App.Enderecos ){
            alteracao.addItem(endereco);
        }
        add(alteracao);

        //Botão de seleção do item a ser alterado---------
        campoAlterar = new JComboBox<>();
        campoAlterar.setBounds(20, 130, 300, 20);
        campoAlterar.addItem("Logradouro");
        campoAlterar.addItem("Bairro");
        campoAlterar.addItem("Cidade");
        campoAlterar.addItem("CEP");
        campoAlterar.addItem("Estado");
        campoAlterar.addItem("Número");
        add(campoAlterar);

        //Recursos necessários para fazer alterações--------
        txt1.setBounds(20, 180, 50, 20);
        add(txt1);

        txt2.setBounds(20, 210, 50, 20);
        add(txt2);

        txt3.setBounds(80, 180, 300, 20);
        add(txt3);

        txtfield.setBounds(80, 210, 300, 20);

    }

    public void btn1(ActionEvent ActionEvent){
        try {
            item_selecionado = (Endereco) alteracao.getSelectedItem();
            txt1.setText("Atual:");
            txt2.setText("Novo:");
            add(txtfield);

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Logradouro":
                    txt3.setText(item_selecionado.getLogradouro());
                    break;

                case "Bairro":
                    txt3.setText(item_selecionado.getBairro());
                    break;

                case "Cidade":
                    txt3.setText(item_selecionado.getCidade());
                    break;

                case "CEP":
                    txt3.setText(item_selecionado.getCep());
                    break;

                case "Estado":
                    txt3.setText(item_selecionado.getEstado());
                    break;

                case "Número":
                    txt3.setText(Integer.toString(item_selecionado.getNumero()));
                    break;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btn2(ActionEvent ActionEvent){
        try {
            item_selecionado = (Endereco) alteracao.getSelectedItem();

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Logradouro":
                    item_selecionado.setLogradouro(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;

                case "Bairro":
                    item_selecionado.setBairro(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;

                case "Cidade":
                    item_selecionado.setCidade(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;

                case "CEP":
                    item_selecionado.setCep(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;

                case "Estado":
                    item_selecionado.setEstado(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;

                case "Número":
                    try {
                        String testaErros = txtfield.getText();
                        int parseInt = TratamentoDeErros.parseInteger(testaErros);
                        item_selecionado.setNumero(parseInt);

                        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                        this.dispose();

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro de formato", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }

    }

}
