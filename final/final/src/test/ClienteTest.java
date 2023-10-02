package test;
import Classes.Cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente clienteMurilo, clienteVitor;

    @BeforeEach
    public void setUp() {
        clienteMurilo = new Cliente("123456789", "murilo@examplo.com", "Murilo", "11122233344", "1990-01-01");
        clienteVitor = new Cliente("987654321", "vitor@examplo.com", "Vitor", "55566677788", "1992-02-02");
    }

    @Test
    public void testeCriacaoCliente() {
        assertNotNull(clienteMurilo, "Cliente não deve ser nulo após a criação");
        assertEquals("123456789", clienteMurilo.getTelefone(), "Telefone deve corresponder ao valor fornecido");
    }

    @Test
    public void testeIncrementoId() {
        assertTrue(clienteVitor.getIdCliente() > clienteMurilo.getIdCliente(), "O ID do novo cliente deve ser maior que o anterior");
    }
}