package unifio.edu.br.projeto_petshop.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Animal {
    @Id
    public Integer codigo;

    public String nome;
    public String raca;
    public String sexo;
    public String porte;
    public String tipo;
    public String horario_consulta;

    @ManyToOne
    public Cliente cliente;

}
