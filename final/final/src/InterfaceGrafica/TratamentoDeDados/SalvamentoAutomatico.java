package InterfaceGrafica.TratamentoDeDados;

import Classes.*;

import java.io.FileWriter;
import java.io.IOException;

public class SalvamentoAutomatico {

    public SalvamentoAutomatico(){

        //Salvar Cliente:
        try {
            FileWriter writer = new FileWriter("clientes.txt");

            for (Cliente variavel : App.Clientes) {
                String salvar = variavel.salvarCliente();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Clientes salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos clientes: " + e.getMessage());
        }


        //Salvar Conta a Pagar:
        try {
            FileWriter writer = new FileWriter("contaspagar.txt");

            for (ContaPagar variavel : App.ContasPagar) {
                String salvar = variavel.salvarContaPagar();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados das Contas a Pagar salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados das Contas a Pagar: " + e.getMessage());
        }


        //Salvar Conta a Receber:
        try {
            FileWriter writer = new FileWriter("contasreceber.txt");

            for (ContaReceber variavel : App.ContasReceber) {
                String salvar = variavel.salvarContaReceber();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados das Contas a Receber salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados das Contas a Receber: " + e.getMessage());
        }


        //Salvar Contrato:
        try {
            FileWriter writer = new FileWriter("contratos.txt");

            for (Contrato variavel : App.Contratos) {
                String salvar = variavel.salvarContrato();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Contratos salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Contratos: " + e.getMessage());
        }


        //Salvar Endereço:
        try {
            FileWriter writer = new FileWriter("enderecos.txt");

            for (Endereco variavel : App.Enderecos) {
                String salvar = variavel.salvarEndereco();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Enderecos salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Enderecos: " + e.getMessage());
        }


        //Salvar Estoque:
        try {
            FileWriter writer = new FileWriter("estoques.txt");

            for (Estoque variavel : App.Estoques) {
                String salvar = variavel.salvarEstoque();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Estoques salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Estoques: " + e.getMessage());
        }


        //Salvar Fornecedores:
        try {
            FileWriter writer = new FileWriter("fornecedores.txt");

            for (Fornecedor variavel : App.Fornecedores) {
                String salvar = variavel.salvarFornecedor();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Fornecedores salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Fornecedores: " + e.getMessage());
        }


        //Salvar Funcionarios:
        try {
            FileWriter writer = new FileWriter("funcionarios.txt");

            for (Funcionario variavel : App.Funcionarios) {
                String salvar = variavel.salvarFuncionario();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Funcionarios salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Funcionarios: " + e.getMessage());
        }


        //Salvar Manutenções:
        try {
            FileWriter writer = new FileWriter("manutencoes.txt");

            for (Manutencao variavel : App.Manutencoes) {
                String salvar = variavel.salvarManutencao();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados das Manutenções salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados das Manutenções: " + e.getMessage());
        }


        //Salvar Maquinas:
        try {
            FileWriter writer = new FileWriter("maquinas.txt");

            for (Maquina variavel : App.Maquinas) {
                String salvar = variavel.salvarMaquina();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados das Máquinas salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados das Máquinas: " + e.getMessage());
        }


        //Salvar Produtos:
        try {
            FileWriter writer = new FileWriter("produtos.txt");

            for (Produto variavel : App.Produtos) {
                String salvar = variavel.salvarProduto();
                writer.write(salvar);
            }

            writer.close();
            System.out.println("Dados dos Produtos salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos Produtos: " + e.getMessage());
        }


        //Salvar IDs:
        try {
            FileWriter writer = new FileWriter("IDs.txt");


                String salvar = salvarID();
                writer.write(salvar);


            writer.close();
            System.out.println("Dados dos IDs salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados dos IDs: " + e.getMessage());
        }


    }

    public String salvarID(){
        return Cliente.getIDcounter() + "," + ContaPagar.getIDcounter() + "," +
                ContaReceber.getIDcounter() + "," + Contrato.getIDcounter() + "," +
                Endereco.getIDcounter() + "," + Estoque.getIDcounter() + "," +
                Manutencao.getIDcounter() + "," + Maquina.getIDcounter() + "," +
                Produto.getIDcounter() + "\n";
    }
}
