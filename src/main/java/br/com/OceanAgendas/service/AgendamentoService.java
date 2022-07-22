package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Agendamento;

import java.util.List;

public interface AgendamentoService {

    List<Agendamento> findAll();

    Agendamento findById(Long Id);

    Agendamento save(Agendamento Agendamento);

    void delete(Agendamento Agendamento);
}
