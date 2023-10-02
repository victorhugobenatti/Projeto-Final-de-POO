package InterfaceGrafica.Exclusoes;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExclusaoFuncionario extends JFrame {
    JComboBox<Funcionario> exclusao = new JComboBox<>();
    JButton btn1 = new JButton();
    private static Funcionario item_selecionado;

    public ExclusaoFuncionario(){
        setTitle("Exclusão de Funcionários");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Exclusão de Funcionários");
        titulo.setBounds(330, 20, 250, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Botão de confirmação do objeto---------
        btn1.setText("Confirma");
        btn1.setBounds(330,100,100,20);
        btn1.setBackground(new Color(100, 100, 100));
        btn1.setForeground(new Color(255,255,255));
        add(btn1);
        btn1.addActionListener(this::btn1);

        //Botão de seleção do objeto a ser excluido---------
        exclusao.setBounds(20, 100, 300, 20);
        for(Funcionario funcionario : App.Funcionarios ){
            exclusao.addItem(funcionario);
        }
        add(exclusao);

    }

    public void btn1(ActionEvent ActionEvent){
        item_selecionado = (Funcionario) exclusao.getSelectedItem();


        if(item_selecionado!=null) {
            App.Funcionarios.remove(item_selecionado);

            JOptionPane.showMessageDialog(null, "Removido do sistema com sucesso!");
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");
        }

    }
}
