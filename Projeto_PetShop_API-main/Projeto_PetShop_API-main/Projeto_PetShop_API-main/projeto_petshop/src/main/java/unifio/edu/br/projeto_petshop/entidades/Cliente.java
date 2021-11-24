package unifio.edu.br.projeto_petshop.entidades;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Cliente {
    @Id
    public Integer codigo;

    public String nome;
    public String telefone;
    public String endereco;
    public Integer documento;
    public String horario_consulta;

}
