package unifio.edu.br.projeto_petshop.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Funcionario {
    @Id
    public Integer codigo;

    public String nome;
    public String telefone;
    public String endereco;
    public Integer documento;

    @ManyToOne
    public Cliente cliente;
}
