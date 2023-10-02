package InterfaceGrafica.Cadastros;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class CadastroEstoque extends JFrame {
    JLabel quantidade = new JLabel("Quantidade:");
    JLabel produto = new JLabel("Produto:");
    JTextField campo_quantidade = new JTextField();
    JComboBox<Produto> cadastra = new JComboBox<>();
    private static Produto item_selecionado;

    public CadastroEstoque(){
        setTitle("Cadastro de Estoque");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Estoque");
        titulo.setBounds(330, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        add(titulo);

        //Quantidade--------------------------------
        quantidade.setBounds(20, 100, 100, 20);
        add(quantidade);

        campo_quantidade.setBounds(110, 100, 590, 20);
        add(campo_quantidade);
        //-------------------------------------------------

        //Botão de seleção do produto---------
        produto.setBounds(20,130,100,20);
        add(produto);

        cadastra.setBounds(110, 130, 300, 20);
        for(Produto prod : App.Produtos ){
            cadastra.addItem(prod);
        }
        add(cadastra);

        JButton confirma = new JButton("OK");
        confirma.setBounds(350, 400, 100, 50);
        add(confirma);
        confirma.addActionListener(this::confirmar);
    }

    void confirmar(ActionEvent actionEvent){
        try {
            //Cria com base nas informações preenchidas.
            Estoque estoque = new Estoque(Integer.parseInt(campo_quantidade.getText()));
            item_selecionado = (Produto) cadastra.getSelectedItem();

            //Adiciona ao ArrayList.
            estoque.setProduto(item_selecionado);
            App.Estoques.add(estoque);

            //Fecha a janela.
            JOptionPane.showMessageDialog(null, "Estoque adicionado com sucesso!");
            this.dispose();

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digite a quantidade em números inteiros!", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}
