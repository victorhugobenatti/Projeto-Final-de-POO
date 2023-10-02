package InterfaceGrafica.Cadastros;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroContrato extends JFrame{
    JLabel prazo = new JLabel("Prazo:");
    JTextField campo_prazo = new JTextField();

    public CadastroContrato(){
        setTitle("Cadastro de Contratos");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Contratos");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Prazo--------------------------------
        prazo.setBounds(20, 100, 100, 20);
        add(prazo);

        campo_prazo.setBounds(110, 100, 590, 20);
        add(campo_prazo);
        //-------------------------------------------------

        JButton confirma = new JButton("OK");
        confirma.setBounds(350, 400, 100, 50);
        add(confirma);
        confirma.addActionListener(this::confirmar);
    }

    void confirmar(ActionEvent actionEvent){
        try {
            //Cria com base nas informações preenchidas.
            Contrato contrato = new Contrato(Integer.parseInt(campo_prazo.getText()));

            //Adiciona ao ArrayList.
            App.Contratos.add(contrato);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Contrato adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite o prazo em números inteiros!", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}
