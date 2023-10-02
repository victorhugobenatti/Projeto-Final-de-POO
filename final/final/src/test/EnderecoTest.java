package test;
import Classes.Endereco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnderecoTest {

    private Endereco endereco;

    @BeforeEach
    public void setUp() {
        endereco = new Endereco("Rua A", 123, "Centro", "São Paulo", "SP", "01234-567");
    }

    @Test
    public void testeLogradouro() {
        String logradouro = "Rua B";
        endereco.setLogradouro(logradouro);
        assertEquals(logradouro, endereco.getLogradouro(), "O logradouro deve corresponder ao fornecido");
    }

    @Test
    public void testeBairro() {
        String bairro = "Zona Sul";
        endereco.setBairro(bairro);
        assertEquals(bairro, endereco.getBairro(), "O bairro deve corresponder ao fornecido");
    }

    @Test
    public void testeCidade() {
        String cidade = "Rio de Janeiro";
        endereco.setCidade(cidade);
        assertEquals(cidade, endereco.getCidade(), "A cidade deve corresponder ao fornecido");
    }

    @Test
    public void testeEstado() {
        String estado = "RJ";
        endereco.setEstado(estado);
        assertEquals(estado, endereco.getEstado(), "O estado deve corresponder ao fornecido");
    }

    @Test
    public void testeCep() {
        String cep = "98765-432";
        endereco.setCep(cep);
        assertEquals(cep, endereco.getCep(), "O CEP deve corresponder ao fornecido");
    }

    @Test
    public void testeToString() {
        String logradouro = "Rua A";
        assertEquals(logradouro, endereco.toString(), "O retorno do método toString deve ser o logradouro do endereço");
    }

}
