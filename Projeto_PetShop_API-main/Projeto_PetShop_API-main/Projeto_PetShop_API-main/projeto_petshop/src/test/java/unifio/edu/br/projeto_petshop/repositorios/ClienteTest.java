package unifio.edu.br.projeto_petshop.repositorios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import unifio.edu.br.projeto_petshop.entidades.Cliente;

import java.util.Optional;

@SpringBootTest
public class ClienteTest {
    @Autowired
    public ClienteRepositorio clienteRepositorio;

    @Test
    public void buscarPorAgendamento() {
        Integer codigo = 1;
        Optional<Cliente> opcional = clienteRepositorio.findById(codigo);
        boolean achou = opcional.isPresent();
        Assertions.assertTrue(achou);
    }

    @Test
    public void inserir() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setNome("");
        cliente.setTelefone("");
        cliente.setEndereco("");
        cliente.setDocumento(1234567890);
        cliente.setHorario_consulta("");
        Cliente retorno = clienteRepositorio.save(cliente);
        Assertions.assertNotNull(retorno);
    }

     @Test
    public void editar() {
        Cliente cliente = new Cliente();
        cliente.setNome("");
        cliente.setTelefone("(43)99912-1234");
        cliente.setEndereco("");
        cliente.setDocumento(1234567891);
        cliente.setHorario_consulta("25/09/21 às 15:30");
        Cliente retorno = clienteRepositorio.save(cliente);
        Assertions.assertNotNull(retorno);
    }

    @Test
    public void excluir() {
        clienteRepositorio.deleteById(1);
        Optional<Cliente> opcional = clienteRepositorio.findById(1);
        Assertions.assertTrue(opcional.isEmpty());
    }
}
