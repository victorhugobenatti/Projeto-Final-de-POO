package Classes;

import InterfaceGrafica.*;
import InterfaceGrafica.TratamentoDeDados.LeituraDeArquivos;

import java.util.ArrayList;

public class App {
    public static ArrayList<Cliente> Clientes = new ArrayList<>();
    public static ArrayList<Funcionario> Funcionarios = new ArrayList<>();
    public static ArrayList<Fornecedor> Fornecedores = new ArrayList<>();
    public static ArrayList<ContaPagar> ContasPagar = new ArrayList<>();
    public static ArrayList<ContaReceber> ContasReceber = new ArrayList<>();
    public static ArrayList<Contrato> Contratos = new ArrayList<>();
    public static ArrayList<Endereco> Enderecos = new ArrayList<>();
    public static ArrayList<Estoque>  Estoques = new ArrayList<>();
    public static ArrayList<Manutencao> Manutencoes = new ArrayList<>();
    public static ArrayList<Maquina> Maquinas = new ArrayList<>();
    public static ArrayList<Produto> Produtos = new ArrayList<>();


    public static void main(String[] args) {
        new LeituraDeArquivos();
        new Home();
    }
}
