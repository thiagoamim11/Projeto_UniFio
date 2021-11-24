package unifio.edu.br.projeto_petshop.repositorios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import unifio.edu.br.projeto_petshop.entidades.Funcionario;

import java.util.Optional;

@SpringBootTest
public class FuncionarioTest {
    @Autowired
    public FuncionarioRepositorio funcionarioRepositorio;

    @Test
    public void buscarPorAgendamento() {
        Integer codigo = 1;
        Optional<Funcionario> opcional = funcionarioRepositorio.findById(codigo);
        boolean achou = opcional.isPresent();
        Assertions.assertTrue(achou);
    }

    @Test
    public void inserir() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(1);
        funcionario.setNome("");
        funcionario.setTelefone("");
        funcionario.setEndereco("");
        funcionario.setDocumento(1234567890);
        Funcionario retorno = funcionarioRepositorio.save(funcionario);
        Assertions.assertNotNull(retorno);
    }

    @Test
    public void editar() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("");
        funcionario.setTelefone("(43)99912-1234");
        funcionario.setEndereco("");
        funcionario.setDocumento(1234567891);
        Funcionario retorno = funcionarioRepositorio.save(funcionario);
        Assertions.assertNotNull(retorno);
    }

   @Test
    public void excluir() {
        funcionarioRepositorio.deleteById(1);
        Optional<Funcionario> opcional = funcionarioRepositorio.findById(1);
        Assertions.assertTrue(opcional.isEmpty());
    }

}
