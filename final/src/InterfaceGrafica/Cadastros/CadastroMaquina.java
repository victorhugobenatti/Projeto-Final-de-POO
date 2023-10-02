package InterfaceGrafica.Cadastros;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroMaquina extends JFrame{
    JLabel dtaCompra = new JLabel("Data da Compra:");
    JLabel obs = new JLabel("Observação:");
    JTextField campo_dtaCompra = new JTextField();
    JTextField campo_obs = new JTextField();

    public CadastroMaquina(){
        setTitle("Cadastro de Maquinas");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Maquina");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Data da Compra--------------------------------
        dtaCompra.setBounds(20, 100, 110, 20);
        add(dtaCompra);

        campo_dtaCompra.setBounds(120, 100, 580, 20);
        add(campo_dtaCompra);
        //-------------------------------------------------

        //Observação--------------------------------
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
            Maquina maquina = new Maquina(campo_obs.getText(), campo_dtaCompra.getText());

            //Adiciona ao ArrayList.
            App.Maquinas.add(maquina);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Maquina adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Maquina não pode ser cadastrado!");
        }
    }
}
