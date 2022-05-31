package br.com.OceanAgendas.entity.dependencias;

import br.com.OceanAgendas.entity.enumeracao.Sexo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Pessoa {
    private String nome;
    private String sobreNome;
    private Sexo sexo;
    private LocalDate dataNascimento;
}
