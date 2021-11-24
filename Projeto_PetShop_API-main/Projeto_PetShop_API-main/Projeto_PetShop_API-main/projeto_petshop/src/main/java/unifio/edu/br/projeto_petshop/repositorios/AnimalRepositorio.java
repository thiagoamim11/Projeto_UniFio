package unifio.edu.br.projeto_petshop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import unifio.edu.br.projeto_petshop.entidades.Animal;

public interface AnimalRepositorio extends JpaRepository<Animal, Integer> {
}
