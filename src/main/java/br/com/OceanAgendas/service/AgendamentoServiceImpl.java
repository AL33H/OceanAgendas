package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Agendamento;
import br.com.OceanAgendas.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AgendamentoServiceImpl implements GenericCrud<Agendamento>, AgendamentoService {

    AgendamentoRepository agendamentoRepository;

    @Override
    public List<Agendamento> findAll() {
        List<Agendamento> all = agendamentoRepository.findAll();
        return all;
    }

    @Override
    public Agendamento findById(Long Id) {
        Agendamento agendamento = agendamentoRepository.findById(Id).orElseThrow(IllegalArgumentException::new);
        return agendamento;
    }

    @Override
    public Agendamento save(Agendamento Agendamento) {
        Agendamento save = agendamentoRepository.save(Agendamento);
        return save;
    }

    @Override
    public void delete(Agendamento Agendamento) {
        agendamentoRepository.delete(Agendamento);
    }
}
