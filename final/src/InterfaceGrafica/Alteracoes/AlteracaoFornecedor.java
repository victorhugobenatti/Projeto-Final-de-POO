package InterfaceGrafica.Alteracoes;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AlteracaoFornecedor extends JFrame {
    JComboBox<Fornecedor> alteracao;
    JComboBox<String> campoAlterar;
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JTextField txtfield = new JTextField();
    private static Fornecedor item_selecionado;

    public AlteracaoFornecedor(){
        setTitle("Alteração de Fornecedor");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Alteração de Fornecedor");
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
        for(Fornecedor fornecedor : App.Fornecedores ){
            alteracao.addItem(fornecedor);
        }
        add(alteracao);

        //Botão de seleção do item a ser alterado---------
        campoAlterar = new JComboBox<>();
        campoAlterar.setBounds(20, 130, 300, 20);
        campoAlterar.addItem("Nome Fantasia");
        campoAlterar.addItem("CNPJ");
        campoAlterar.addItem("Telefone");
        campoAlterar.addItem("E-mail");

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
            item_selecionado = (Fornecedor) alteracao.getSelectedItem();
            txt1.setText("Atual:");
            txt2.setText("Novo:");
            add(txtfield);

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Nome Fantasia":
                    txt3.setText(item_selecionado.getNomeFantasia());
                    break;

                case "CNPJ":
                    txt3.setText(item_selecionado.getCnpj());
                    break;

                case "Telefone":
                    txt3.setText(item_selecionado.getTelefone());
                    break;

                case "E-mail":
                    txt3.setText(item_selecionado.getEmail());
                    break;

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btn2(ActionEvent ActionEvent) {
        try {
            item_selecionado = (Fornecedor) alteracao.getSelectedItem();

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Nome Fantasia":
                    item_selecionado.setNomeFantasia(txtfield.getText());
                    break;

                case "CNPJ":
                    item_selecionado.setCnpj(txtfield.getText());
                    break;

                case "Telefone":
                    item_selecionado.setTelefone(txtfield.getText());
                    break;

                case "E-mail":
                    item_selecionado.setEmail(txtfield.getText());
                    break;

            }

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
