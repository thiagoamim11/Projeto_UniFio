package unifio.edu.br.projeto_petshop.repositorios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import unifio.edu.br.projeto_petshop.entidades.Animal;


import java.util.Optional;

@SpringBootTest
public class AnimalTest {
    @Autowired
    public AnimalRepositorio animalRepositorio;

    @Test
    public void buscarPorAgendamento() {
        Integer codigo = 1;
        Optional<Animal> opcional = animalRepositorio.findById(codigo);
        boolean achou = opcional.isPresent();
        Assertions.assertTrue(achou);
    }

    @Test
    public void inserir() {
        Animal animal = new Animal();
        animal.setCodigo(1);
        animal.setNome("");
        animal.setRaca("");
        animal.setSexo("");
        animal.setPorte("");
        animal.setTipo("");
        animal.setHorario_consulta("");
        Animal retorno = animalRepositorio.save(animal);
        Assertions.assertNotNull(retorno);
    }

    @Test
    public void editar() {
        Animal animal = new Animal();
        animal.setCodigo(1);
        animal.setNome("Rex");
        animal.setRaca("Labrador");
        animal.setSexo("M");
        animal.setPorte("Grande");
        animal.setTipo("Cachorro");
        animal.setHorario_consulta("22/09/21 às 13:30");
        Animal retorno = animalRepositorio.save(animal);
        Assertions.assertNotNull(retorno);
    }

    @Test
    public void excluir() {
        animalRepositorio.deleteById(2);
        Optional<Animal> opcional = animalRepositorio.findById(2);
        Assertions.assertTrue(opcional.isEmpty());
    }

}
