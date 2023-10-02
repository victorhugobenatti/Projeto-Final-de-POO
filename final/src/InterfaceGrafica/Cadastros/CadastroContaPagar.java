package InterfaceGrafica.Cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import Classes.*;

public class CadastroContaPagar extends JFrame {
    JLabel valor = new JLabel("Valor:");
    JLabel obs = new JLabel("Observação:");
    JTextField campo_valor = new JTextField();
    JTextField campo_obs = new JTextField();

    public CadastroContaPagar(){

        setTitle("Cadastro de Contas à Pagar");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Contas à Pagar");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Valor--------------------------------
        valor.setBounds(20, 100, 100, 20);
        add(valor);

        campo_valor.setBounds(110, 100, 590, 20);
        add(campo_valor);
        //-------------------------------------------------

        //Obs--------------------------------
        obs.setBounds(20, 130, 100, 20);
        add(obs);

        campo_obs.setBounds(110, 130, 590, 20);
        add(campo_obs);
        //-------------------------------------------------

        JButton confirma = new JButton("OK");
        confirma.setBounds(350, 400, 100, 50);
        add(confirma);
        confirma.addActionListener(this::confirmar);
    }

    void confirmar(ActionEvent actionEvent){
        try {
            //Cria com base nas informações preenchidas.
            ContaPagar contaPagar = new ContaPagar(Double.parseDouble(campo_valor.getText()), campo_obs.getText());

            //Adiciona ao ArrayList.
            App.ContasPagar.add(contaPagar);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Conta adicionada com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite o valor em números reais!", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
    }

}
