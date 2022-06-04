package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Servico;
import br.com.OceanAgendas.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ServicoService implements GenericCrud<Servico> {

    @Autowired
    ServicoRepository servicoRepository;

    public ResponseEntity<List<Servico>> findAll() {
        List<Servico> listaServicos = servicoRepository.findAll();

        if (listaServicos.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(listaServicos);
    }

    @Override
    public ResponseEntity<Servico> findById(Long Id) {
        return servicoRepository.findById(Id)
                .map(servico -> ResponseEntity.ok().body(servico)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Servico> save(Servico servico) {
        return ResponseEntity.ok(servicoRepository.save(servico));
    }

    @Override
    public ResponseEntity<Servico> delete(Servico servico) {
        servicoRepository.delete(servico);
        return ResponseEntity.ok().build();
    }
}
