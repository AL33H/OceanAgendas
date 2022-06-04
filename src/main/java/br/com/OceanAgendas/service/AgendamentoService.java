package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Agendamento;
import br.com.OceanAgendas.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService implements GenericCrud<Agendamento> {

    @Autowired
    AgendamentoRepository agendamentoRepository;

    @Override
    public ResponseEntity<List<Agendamento>> findAll() {
        List<Agendamento> listaAgendamentos = agendamentoRepository.findAll();

        if (listaAgendamentos.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(listaAgendamentos);
    }

    @Override
    public ResponseEntity<Agendamento> findById(Long Id) {
        return agendamentoRepository.findById(Id)
                .map(Agendamento -> ResponseEntity.ok().body(Agendamento)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Agendamento> save(Agendamento Agendamento) {
        return ResponseEntity.ok(agendamentoRepository.save(Agendamento));
    }

    @Override
    public ResponseEntity<Agendamento> delete(Agendamento Agendamento) {
        agendamentoRepository.delete(Agendamento);
        return ResponseEntity.ok().build();
    }
}
