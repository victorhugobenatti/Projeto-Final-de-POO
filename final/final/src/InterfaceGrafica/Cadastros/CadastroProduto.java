package InterfaceGrafica.Cadastros;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroProduto extends JFrame{
    JLabel nome = new JLabel("Nome:");
    JLabel obs = new JLabel("Observação:");
    JTextField campo_nome = new JTextField();
    JTextField campo_obs = new JTextField();

    public CadastroProduto(){
        setTitle("Cadastro de Produtos");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Produto");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Nome--------------------------------
        nome.setBounds(20, 100, 100, 20);
        add(nome);

        campo_nome.setBounds(110, 100, 590, 20);
        add(campo_nome);
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
            Produto produto = new Produto(campo_nome.getText(), campo_obs.getText());

            //Adiciona ao ArrayList.
            App.Produtos.add(produto);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não pode ser cadastrado!");
        }
    }
}
