package InterfaceGrafica.Consultas;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConsultarFuncionario extends JFrame {
    JComboBox<Funcionario> consulta = new JComboBox<>();
    JLabel txt1 = new JLabel();
    JLabel txt2 = new JLabel();
    JLabel txt3 = new JLabel();
    JLabel txt4 = new JLabel();
    JLabel txt5 = new JLabel();
    JLabel txt6 = new JLabel();
    JButton btn1 = new JButton();
    private static Funcionario item_selecionado;

    public ConsultarFuncionario(){
        setTitle("Consulta de Funcionários");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Consulta de Funcionários");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Botão de seleção do objeto a ser consultado---------
        consulta.setBounds(20, 100, 300, 20);
        for(Funcionario funcionario : App.Funcionarios ){
            consulta.addItem(funcionario);
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
        add(txt4);
        add(txt5);
        add(txt6);
    }

    public void btn1(ActionEvent ActionEvent) {
        try {
            item_selecionado = (Funcionario) consulta.getSelectedItem();

            txt1.setBounds(20, 130, 700, 20);
            txt1.setText("Nome: " + item_selecionado.getNome());

            txt2.setBounds(20, 160, 700, 20);
            txt2.setText("ID do Chefe: " + item_selecionado.getIdFuncionarioChefe());

            txt3.setBounds(20, 190, 700, 20);
            txt3.setText("Data de Nascimento: " + item_selecionado.getDtaNascimento());

            txt4.setBounds(20, 220, 700, 20);
            txt4.setText("CPF: " + item_selecionado.getCpf());

            txt5.setBounds(20, 250, 700, 20);
            txt5.setText("E-mail: " + item_selecionado.getEmail());

            txt6.setBounds(20, 280, 700, 20);
            txt6.setText("Telefone: " + item_selecionado.getTelefone());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");
        }
    }
}
