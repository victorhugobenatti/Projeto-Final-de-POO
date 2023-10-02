package InterfaceGrafica.Listas;

import Classes.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class TelaInicialLista extends JFrame {
    JButton btn1 = new JButton();
    JComboBox<String> campoAlterar;
    DefaultTableModel tableModel = new DefaultTableModel();

    public TelaInicialLista() {
        setTitle("Escolher o tipo de pessoa.");
        setVisible(true);
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        //Botão de seleção do item a ser listado---------
        campoAlterar = new JComboBox<>();
        campoAlterar.setBounds(20, 30, 300, 20);
        campoAlterar.addItem("Clientes");
        campoAlterar.addItem("Contas à Pagar");
        campoAlterar.addItem("Contas à Receber");
        campoAlterar.addItem("Contratos");
        campoAlterar.addItem("Endereços");
        campoAlterar.addItem("Estoques");
        campoAlterar.addItem("Fornecedores");
        campoAlterar.addItem("Funcionários");
        campoAlterar.addItem("Manutenções");
        campoAlterar.addItem("Máquinas");
        campoAlterar.addItem("Produtos");
        add(campoAlterar);

        //Botão de confirmação do item a ser listado---------
        btn1.setText("Confirma");
        btn1.setBounds(330,30,100,20);
        btn1.setBackground(new Color(100, 100, 100));
        btn1.setForeground(new Color(255,255,255));
        add(btn1);
        btn1.addActionListener(this::btn1);

        JTable tabela = new JTable(tableModel);
        tabela.setPreferredScrollableViewportSize(new Dimension(300, 50));
        tabela.setFillsViewportHeight(true);
        tabela.setVisible(true);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(20, 60, 750, 380);
        getContentPane().add(scrollPane);
    }

    public void btn1(ActionEvent ActionEvent){
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        switch((String) campoAlterar.getSelectedItem()){
            case "Clientes":

                tableModel.addColumn("ID-Pessoa");
                tableModel.addColumn("ID-Cliente");
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Telefone");
                tableModel.addColumn("E-mail");
                tableModel.addColumn("Data de Nascimento");
                    for (Cliente cliente : App.Clientes) {
                        Object[] rowData = {cliente.getIdPessoa(), cliente.getIdCliente(), cliente.getNome(), cliente.getCpf(),
                        cliente.getTelefone(), cliente.getEmail(), cliente.getDtaNascimento()};
                        tableModel.addRow(rowData);
                    }
                break;
            case "Contas à Pagar":

                tableModel.addColumn("ID-ContaPagar");
                tableModel.addColumn("Valor");
                tableModel.addColumn("Observação");

                for (ContaPagar contaPagar : App.ContasPagar) {
                    Object[] rowData = {contaPagar.getIdContaPagar(), contaPagar.getValor(),
                            contaPagar.getObs()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Contas à Receber":

                tableModel.addColumn("ID-ContaReceber");
                tableModel.addColumn("Valor");
                tableModel.addColumn("Observação");

                for (ContaReceber contaReceber : App.ContasReceber) {
                    Object[] rowData = {contaReceber.getIdContaReceber(), contaReceber.getValor(),
                            contaReceber.getObs()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Contratos":

                tableModel.addColumn("ID-Contrato");
                tableModel.addColumn("Prazo");

                for (Contrato contrato : App.Contratos) {
                    Object[] rowData = {contrato.getIdContrato(), contrato.getPrazo()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Endereços":

                tableModel.addColumn("ID-Endereço");
                tableModel.addColumn("Logradouro");
                tableModel.addColumn("Bairro");
                tableModel.addColumn("Cidade");
                tableModel.addColumn("Estado");
                tableModel.addColumn("Número");
                tableModel.addColumn("CEP");
                for (Endereco endereco : App.Enderecos) {
                    Object[] rowData = {endereco.getIdEndereco(), endereco.getLogradouro(), endereco.getBairro(), endereco.getCidade(),
                            endereco.getEstado(), endereco.getNumero(), endereco.getCep()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Estoques":

                tableModel.addColumn("ID-Estoque");
                tableModel.addColumn("Nome do Produto");
                tableModel.addColumn("Quantidade");

                for (Estoque estoque : App.Estoques) {
                    Object[] rowData = {estoque.getIdEstoque(), estoque.getProduto().getNome(),
                            estoque.getQuantidade()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Fornecedores":

                tableModel.addColumn("ID-Pessoa");
                tableModel.addColumn("ID-Fornecedor");
                tableModel.addColumn("Nome Fantasia");
                tableModel.addColumn("CNPJ");
                tableModel.addColumn("Telefone");
                tableModel.addColumn("E-mail");
                for (Fornecedor fornecedor : App.Fornecedores) {
                    Object[] rowData = {fornecedor.getIdPessoa(), fornecedor.getIdFornecedor(), fornecedor.getNomeFantasia(),
                            fornecedor.getCnpj(), fornecedor.getTelefone(), fornecedor.getEmail()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Funcionários":

                tableModel.addColumn("ID-Pessoa");
                tableModel.addColumn("ID do Chefe");
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Telefone");
                tableModel.addColumn("E-mail");
                tableModel.addColumn("Data de Nascimento");
                for (Funcionario funcionario : App.Funcionarios) {
                    Object[] rowData = {funcionario.getIdPessoa(), funcionario.getIdFuncionarioChefe(), funcionario.getNome(), funcionario.getCpf(),
                            funcionario.getTelefone(), funcionario.getEmail(), funcionario.getDtaNascimento()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Manutenções":

                tableModel.addColumn("ID-Manutenção");
                tableModel.addColumn("Data da Manutenção");
                tableModel.addColumn("Observação");

                for (Manutencao manutencao : App.Manutencoes) {
                    Object[] rowData = {manutencao.getIdManutencao(), manutencao.getDtaManutencao(),
                            manutencao.getObs()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Máquinas":

                tableModel.addColumn("ID-Máquina");
                tableModel.addColumn("Data de Compra");
                tableModel.addColumn("Observação");

                for (Maquina maquina : App.Maquinas) {
                    Object[] rowData = {maquina.getIdMaquina(), maquina.getDtaCompra(),
                            maquina.getObs()};
                    tableModel.addRow(rowData);
                }

                break;
            case "Produtos":

                tableModel.addColumn("ID-Produto");
                tableModel.addColumn("Nome");
                tableModel.addColumn("Observação");

                for (Produto produto : App.Produtos) {
                    Object[] rowData = {produto.getIdProduto(), produto.getNome(),
                            produto.getObs()};
                    tableModel.addRow(rowData);
                }

                break;

        }
    }
}
