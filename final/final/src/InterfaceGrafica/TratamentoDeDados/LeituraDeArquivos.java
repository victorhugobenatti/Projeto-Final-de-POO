package InterfaceGrafica.TratamentoDeDados;

import Classes.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivos {

    public LeituraDeArquivos(){

        //Ler Clientes
        try (BufferedReader br = new BufferedReader(new FileReader("clientes.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 7) {
                    String nome = partes[0];
                    String cpf = partes[1];
                    String telefone = partes[2];
                    String email = partes[3];
                    String dtanascimento = partes[4];
                    String idpessoa = partes[5];
                    String idcliente = partes[6];
                    Cliente cliente = new Cliente(telefone,email,nome,cpf,dtanascimento,Integer.parseInt(idcliente),Integer.parseInt(idpessoa));
                    App.Clientes.add(cliente);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos clientes", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler ContaPagar
        try (BufferedReader br = new BufferedReader(new FileReader("contaspagar.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String valor = partes[0];
                    String obs = partes[1];
                    String idcontapagar = partes[2];
                    ContaPagar contaPagar = new ContaPagar(Double.parseDouble(valor),obs,Integer.parseInt(idcontapagar));
                    App.ContasPagar.add(contaPagar);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura das contas à pagar", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler ContaReceber
        try (BufferedReader br = new BufferedReader(new FileReader("contasreceber.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String valor = partes[0];
                    String obs = partes[1];
                    String idcontareceber = partes[2];
                    ContaReceber contaReceber = new ContaReceber(Double.parseDouble(valor),obs,Integer.parseInt(idcontareceber));
                    App.ContasReceber.add(contaReceber);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura das contas à receber", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Contrato
        try (BufferedReader br = new BufferedReader(new FileReader("contratos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 2) {
                    String prazo = partes[0];
                    String idcontrato = partes[1];
                    Contrato contrato = new Contrato(Integer.parseInt(prazo),Integer.parseInt(idcontrato));
                    App.Contratos.add(contrato);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos contratos", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Endereços
        try (BufferedReader br = new BufferedReader(new FileReader("enderecos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 7) {
                    String logradouro = partes[0];
                    String numero = partes[1];
                    String bairro = partes[2];
                    String cidade = partes[3];
                    String estado = partes[4];
                    String cep = partes[5];
                    String idendereco = partes[6];
                    Endereco endereco = new Endereco(logradouro,Integer.parseInt(numero),bairro,cidade,estado,cep,Integer.parseInt(idendereco));
                    App.Enderecos.add(endereco);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos endereços", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Estoque
        try (BufferedReader br = new BufferedReader(new FileReader("estoques.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 5) {
                    String quantidade = partes[0];
                    String idestoque = partes[1];
                    String idproduto = partes[2];
                    String nomeproduto = partes[3];
                    String obsproduto = partes[4];
                    Estoque estoque = new Estoque(Integer.parseInt(quantidade),Integer.parseInt(idestoque));
                    Produto produto_estoque = new Produto(nomeproduto, obsproduto, Integer.parseInt(idproduto));
                    estoque.setProduto(produto_estoque);
                    App.Estoques.add(estoque);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos estoques", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }

        //Ler Fornecedores
        try (BufferedReader br = new BufferedReader(new FileReader("fornecedores.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 6) {
                    String telefone = partes[0];
                    String email = partes[1];
                    String nomeFantasia = partes[2];
                    String cnpj = partes[3];
                    String idfornecedor = partes[4];
                    String idpessoa = partes[5];
                    Fornecedor fornecedor = new Fornecedor(telefone,email,nomeFantasia,cnpj,Integer.parseInt(idfornecedor),Integer.parseInt(idpessoa));
                    App.Fornecedores.add(fornecedor);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos fornecedores", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Funcionários
        try (BufferedReader br = new BufferedReader(new FileReader("funcionarios.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 7) {
                    String telefone = partes[0];
                    String email = partes[1];
                    String nome = partes[2];
                    String cpf = partes[3];
                    String dtanascimento = partes[4];
                    String idfuncionariochefe = partes[5];
                    String idpessoa = partes[6];
                    Funcionario funcionario = new Funcionario(telefone,email,nome,cpf,dtanascimento,Integer.parseInt(idfuncionariochefe),Integer.parseInt(idpessoa));
                    App.Funcionarios.add(funcionario);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos funcionários", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Manutenção
        try (BufferedReader br = new BufferedReader(new FileReader("manutencoes.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String dtamanutencao = partes[0];
                    String obs = partes[1];
                    String idmanutencao = partes[2];
                    Manutencao manutencao = new Manutencao(dtamanutencao,obs,Integer.parseInt(idmanutencao));
                    App.Manutencoes.add(manutencao);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos manutenções", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Máquina
        try (BufferedReader br = new BufferedReader(new FileReader("maquinas.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String obs = partes[0];
                    String dtacompra = partes[1];
                    String idmaquina = partes[2];
                    Maquina maquina = new Maquina(obs,dtacompra,Integer.parseInt(idmaquina));
                    App.Maquinas.add(maquina);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos máquinas", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


        //Ler Produto
        try (BufferedReader br = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String nome = partes[0];
                    String obs = partes[1];
                    String idproduto = partes[2];
                    Produto produto = new Produto(nome,obs,Integer.parseInt(idproduto));
                    App.Produtos.add(produto);
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos produtos", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }

        //Ler IDs
        try (BufferedReader br = new BufferedReader(new FileReader("IDs.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 9) {
                    Cliente.setIDcounter(Integer.parseInt(partes[0]));
                    ContaPagar.setIDcounter(Integer.parseInt(partes[1]));
                    ContaReceber.setIDcounter(Integer.parseInt(partes[2]));
                    Contrato.setIDcounter(Integer.parseInt(partes[3]));
                    Endereco.setIDcounter(Integer.parseInt(partes[4]));
                    Estoque.setIDcounter(Integer.parseInt(partes[5]));
                    Manutencao.setIDcounter(Integer.parseInt(partes[6]));
                    Maquina.setIDcounter(Integer.parseInt(partes[7]));
                    Produto.setIDcounter(Integer.parseInt(partes[8]));
                }
            }
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na leitura dos IDs", "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }


    }
}
