package br.com.OceanAgendas.entity.dependencias;

import lombok.Data;

@Data
public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
