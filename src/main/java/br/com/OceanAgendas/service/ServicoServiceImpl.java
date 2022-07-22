package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Servico;
import br.com.OceanAgendas.repository.ServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServicoServiceImpl implements GenericCrud<Servico>, ServicoService {


    ServicoRepository servicoRepository;

    public List<Servico> findAll() {
        List<Servico> all = servicoRepository.findAll();
        return all;
    }

    @Override
    public Servico findById(Long Id) {
        Servico servico = servicoRepository.findById(Id).orElseThrow(IllegalArgumentException::new);
        return servico;
    }

    @Override
    public Servico save(Servico servico) {
        Servico save = servicoRepository.save(servico);
        return save;
    }

    @Override
    public void delete(Servico servico) {
        servicoRepository.delete(servico);
    }
}
