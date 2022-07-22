package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Servico;
import br.com.OceanAgendas.service.ServicoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ServicoController {

    ServicoService servicoService;

    @GetMapping("/")
    public ResponseEntity<List<Servico>> findAll() {
        List<Servico> all = servicoService.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> findById(@PathVariable Long id) {
        Servico byId = servicoService.findById(id);
        return ResponseEntity.ok(byId);
    }

    @PostMapping("/")
    public ResponseEntity<Servico> save(@RequestBody Servico servico) {
        Servico save = servicoService.save(servico);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(save);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Servico servico) {
        servicoService.delete(servico);
    }
}
