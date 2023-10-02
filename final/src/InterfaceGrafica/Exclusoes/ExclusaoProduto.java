package InterfaceGrafica.Exclusoes;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExclusaoProduto extends JFrame {
    JComboBox<Produto> exclusao = new JComboBox<>();
    JButton btn1 = new JButton();
    private static Produto item_selecionado;

    public ExclusaoProduto(){
        setTitle("Exclusão de Produtos");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Exclusão de Produtos");
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
        for(Produto produto : App.Produtos ){
            exclusao.addItem(produto);
        }
        add(exclusao);

    }

    public void btn1(ActionEvent ActionEvent){
        item_selecionado = (Produto) exclusao.getSelectedItem();


        if(item_selecionado!=null) {
            App.Produtos.remove(item_selecionado);

            JOptionPane.showMessageDialog(null, "Removido do sistema com sucesso!");
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");
        }

    }
}
