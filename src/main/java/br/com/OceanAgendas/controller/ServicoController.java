package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Servico;
import br.com.OceanAgendas.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    ServicoService servicoService;

    @GetMapping("/")
    public ResponseEntity<List<Servico>> findAll() {
        return servicoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> findById(@PathVariable Long id) {
        return servicoService.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Servico> save(@RequestBody Servico servico) {
        return servicoService.save(servico);
    }

    @DeleteMapping("/")
    public ResponseEntity<Servico> delete(@RequestBody Servico servico) {
        return servicoService.delete(servico);
    }
}
