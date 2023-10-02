package InterfaceGrafica.Consultas;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConsultarProduto extends JFrame {
    JComboBox<Produto> consulta = new JComboBox<>();
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();
    JButton btn1 = new JButton();
    private static Produto item_selecionado;

    public ConsultarProduto(){
        setTitle("Consulta de Produtos");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Consulta de Produtos");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Botão de seleção do objeto a ser consultado---------
        consulta.setBounds(20, 100, 300, 20);
        for(Produto produto : App.Produtos ){
            consulta.addItem(produto);
        }
        add(consulta);

        //Botão de confirmação do objeto---------
        btn1.setText("Confirma");
        btn1.setBounds(330,100,100,20);
        btn1.setBackground(new Color(100, 100, 100));
        btn1.setForeground(new Color(255,255,255));
        add(btn1);
        btn1.addActionListener(this::btn1);

        //Textos que aparecem na consulta
        add(txt1);
        add(txt2);
        add(txt3);
    }

    public void btn1(ActionEvent ActionEvent) {
        try {
            item_selecionado = (Produto) consulta.getSelectedItem();

            txt1.setBounds(20, 130, 700, 20);
            txt1.setText("ID-Produto: " + item_selecionado.getIdProduto());

            txt2.setBounds(20, 160, 700, 20);
            txt2.setText("Nome: " + item_selecionado.getNome());

            txt3.setBounds(20, 190, 700, 20);
            txt3.setText("Observação: " + item_selecionado.getObs());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");
        }
    }
}
