package test;
import Classes.ContaPagar;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContaPagarTest {

    @Test
    public void testSetValor_MaxLimit() {
        ContaPagar conta = new ContaPagar(999999999, "Teste");
        assertEquals(999999999, conta.getValor());
    }

    @Test
    public void testSetValor_NormalValue() {
        ContaPagar conta = new ContaPagar(500.50, "Teste");
        assertEquals(500.50, conta.getValor());
    }

    @Test
    public void testSetObs_LengthLimit() {
        ContaPagar conta = new ContaPagar(100, "TESTE BASICO");
        assertEquals("TESTE BASICO", conta.getObs());
    }

    @Test
    public void testSetObs_NormalValue() {
        ContaPagar conta = new ContaPagar(100, "Teste");
        assertEquals("Teste", conta.getObs());
    }

    @Test
    public void testIdContaPagar_Increment() {
        ContaPagar conta1 = new ContaPagar(100, "Teste 1");
        ContaPagar conta2 = new ContaPagar(200, "Teste 2");
        assertTrue(conta2.getIdContaPagar() > conta1.getIdContaPagar());
    }
}