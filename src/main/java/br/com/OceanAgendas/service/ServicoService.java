package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Servico;

import java.util.List;

public interface ServicoService {
    List<Servico> findAll();

    Servico findById(Long Id);

    Servico save(Servico servico);

    void delete(Servico servico);
}
