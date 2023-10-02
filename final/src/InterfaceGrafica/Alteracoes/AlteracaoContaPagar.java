package InterfaceGrafica.Alteracoes;

import Classes.*;
import InterfaceGrafica.TratamentoDeErros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AlteracaoContaPagar extends JFrame {
    JComboBox<ContaPagar> alteracao;
    JComboBox<String> campoAlterar;
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JTextField txtfield = new JTextField();
    private static ContaPagar item_selecionado;

    public AlteracaoContaPagar(){
        setTitle("Alteração de Contas à Pagar");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Alteração de Contas à Pagar");
        titulo.setBounds(330, 20, 300, 50);
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
        for(ContaPagar contaPagar : App.ContasPagar ){
            alteracao.addItem(contaPagar);
        }
        add(alteracao);

        //Botão de seleção do item a ser alterado---------
        campoAlterar = new JComboBox<>();
        campoAlterar.setBounds(20, 130, 300, 20);
        campoAlterar.addItem("Valor");
        campoAlterar.addItem("Observação");
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
            item_selecionado = (ContaPagar) alteracao.getSelectedItem();
            txt1.setText("Atual:");
            txt2.setText("Novo:");
            add(txtfield);

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Valor":
                    txt3.setText(Double.toString(item_selecionado.getValor()));
                    break;

                case "Observação":
                    txt3.setText(item_selecionado.getObs());
                    break;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btn2(ActionEvent ActionEvent){
        try {
            item_selecionado = (ContaPagar) alteracao.getSelectedItem();

            switch ((String) campoAlterar.getSelectedItem()) {
                case "Valor":
                    try {
                        String testaErros = txtfield.getText();
                        double parseDouble = TratamentoDeErros.parseDouble(testaErros);
                        item_selecionado.setValor(parseDouble);

                        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                        this.dispose();


                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro de formato", JOptionPane.ERROR_MESSAGE);

                    }

                    break;

                case "Observação":
                    item_selecionado.setObs(txtfield.getText());

                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    this.dispose();

                    break;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Nenhum item selecionado!", "Item nulo.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
