package InterfaceGrafica.Exclusoes;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExclusaoEstoque extends JFrame {
    JComboBox<Estoque> exclusao = new JComboBox<>();
    JButton btn1 = new JButton();
    private static Estoque item_selecionado;

    public ExclusaoEstoque(){
        setTitle("Exclusão de Estoque");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Exclusão de Estoque");
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
        for(Estoque estoque : App.Estoques ){
            exclusao.addItem(estoque);
        }
        add(exclusao);

    }

    public void btn1(ActionEvent ActionEvent){
        item_selecionado = (Estoque) exclusao.getSelectedItem();


        if(item_selecionado!=null) {
            if(item_selecionado.getQuantidade() > 0){
                JOptionPane.showMessageDialog(null,"Esse estoque não pode ser excluído pois sua quantidade não está zerada");
            }
            else {
                App.Enderecos.remove(item_selecionado);

                JOptionPane.showMessageDialog(null, "Removido do sistema com sucesso!");
                this.dispose();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");
        }

    }
}
