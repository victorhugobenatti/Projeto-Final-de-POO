package test;

import Classes.ContaReceber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaReceberTest {

    private ContaReceber conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaReceber(1000, "Teste de descrição");
    }

    @Test
    public void testeSetValor() {
        conta.setValor(500);
        assertEquals(500, conta.getValor(), "O valor da conta deve ser 500");
    }

    @Test
    public void testeSetValorAcimaDoLimite() {
        conta.setValor(1000000000); // Um valor acima do limite estipulado na classe
        assertEquals(999999999, conta.getValor(), "O valor da conta deve ser ajustado para 999999999");
    }

    @Test
    public void testeSetObservacao() {
        String observacao = "Uma nova observação para teste";
        conta.setObs(observacao);
        assertEquals(observacao, conta.getObs(), "A observação da conta deve corresponder à observação fornecida");
    }

    @Test
    public void testeIdContaReceberIncremento() {
        ContaReceber novaConta = new ContaReceber(500, "Teste ID");
        assertEquals(conta.getIdContaReceber() + 1, novaConta.getIdContaReceber(), "O ID da nova conta deve ser o próximo disponível");
    }
}