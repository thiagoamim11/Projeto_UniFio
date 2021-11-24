package unifio.edu.br.projeto_petshop.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import unifio.edu.br.projeto_petshop.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
