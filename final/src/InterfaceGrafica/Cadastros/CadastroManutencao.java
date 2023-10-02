package InterfaceGrafica.Cadastros;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroManutencao extends JFrame {
    JLabel dtaManutencao = new JLabel("Data de Manutenção:");
    JLabel obs = new JLabel("Observação:");
    JTextField campo_dtaManutencao = new JTextField();
    JTextField campo_obs = new JTextField();

    public CadastroManutencao(){
        setTitle("Cadastro de Manutenções");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Manutenção");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Data da Manutenção--------------------------------
        dtaManutencao.setBounds(20, 100, 150, 20);
        add(dtaManutencao);

        campo_dtaManutencao.setBounds(160, 100, 540, 20);
        add(campo_dtaManutencao);
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
            Manutencao manutencao = new Manutencao(campo_dtaManutencao.getText(), campo_obs.getText());

            //Adiciona ao ArrayList.
            App.Manutencoes.add(manutencao);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Manutenção adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Manutenção não pode ser cadastrado!");
        }
    }
}
