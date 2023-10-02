package InterfaceGrafica;

import InterfaceGrafica.Alteracoes.*;
import InterfaceGrafica.Cadastros.*;
import InterfaceGrafica.Consultas.*;
import InterfaceGrafica.Exclusoes.TelaInicialExclusao;
import InterfaceGrafica.Listas.TelaInicialLista;
import InterfaceGrafica.TratamentoDeDados.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Home extends JFrame {
    private boolean isClosed = false;

    public Home(){
        setTitle("Página Inicial");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                new SalvamentoAutomatico();
            }
        });

        setLayout(null);

        JLabel titulo = new JLabel("Página Inicial");
        titulo.setBounds(350, 20, 200, 50);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        add(titulo);

        JButton cadastros = new JButton("Cadastros");
        cadastros.setBounds(150, 150, 200, 50);
        cadastros.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        cadastros.setForeground(new Color(255,255,255));
        cadastros.setBackground(new Color(0, 0, 0));
        add(cadastros);
        cadastros.addActionListener(this::cadastros);

        JButton consultas = new JButton("Consultas");
        consultas.setBounds(150, 210, 200, 50);
        consultas.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        consultas.setForeground(new Color(255,255,255));
        consultas.setBackground(new Color(0, 0, 0));
        add(consultas);
        consultas.addActionListener(this::consultas);

        JButton exclusao = new JButton("Exclusão");
        exclusao.setBounds(450, 150, 200, 50);
        exclusao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        exclusao.setForeground(new Color(255,255,255));
        exclusao.setBackground(new Color(0, 0, 0));
        add(exclusao);
        exclusao.addActionListener(this::exclusao);

        JButton alteracao = new JButton("Alteração");
        alteracao.setBounds(450, 210, 200, 50);
        alteracao.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        alteracao.setForeground(new Color(255,255,255));
        alteracao.setBackground(new Color(0, 0, 0));
        add(alteracao);
        alteracao.addActionListener(this::alteracao);

        JButton listas = new JButton("Listas");
        listas.setBounds(300, 270, 200, 50);
        listas.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
        listas.setForeground(new Color(255,255,255));
        listas.setBackground(new Color(0, 0, 0));
        add(listas);
        listas.addActionListener(this::listas);
    }

    private void cadastros(ActionEvent actionEvent){
        new TelaInicialCadastros();

    }

    private void consultas(ActionEvent actionEvent){
        new TelaInicialConsultas();

    }

    private void exclusao(ActionEvent actionEvent){
        new TelaInicialExclusao();

    }

    private void alteracao(ActionEvent actionEvent){
        new TelaInicialAlteracao();

    }

    private void listas(ActionEvent actionEvent){
        new TelaInicialLista();

    }

}
