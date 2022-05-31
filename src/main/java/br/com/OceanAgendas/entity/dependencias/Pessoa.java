package br.com.OceanAgendas.entity.dependencias;

import br.com.OceanAgendas.entity.enumeracao.Sexo;
import lombok.Data;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Pessoa {
    @Size(min = 2, max = 24)
    private String nome;

    @Size(min = 2, max = 24)
    private String sobreNome;
    private Sexo sexo;
    private LocalDate dataNascimento;
}
