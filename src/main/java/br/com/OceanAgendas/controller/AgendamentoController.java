package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Agendamento;
import br.com.OceanAgendas.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AgendamentoController {

    @Autowired
    AgendamentoService agendamentoService;

    @GetMapping("/")
    public ResponseEntity<List<Agendamento>> findAll() {
        return agendamentoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> findById(@PathVariable Long id) {
        return agendamentoService.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Agendamento> save(@RequestBody Agendamento agendamento) {
        return agendamentoService.save(agendamento);
    }

    @DeleteMapping("/")
    public ResponseEntity<Agendamento> delete(@RequestBody Agendamento agendamento) {
        return agendamentoService.delete(agendamento);
    }
}
