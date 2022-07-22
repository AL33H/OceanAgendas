package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Agendamento;
import br.com.OceanAgendas.service.AgendamentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AgendamentoController {

    AgendamentoService agendamentoService;

    @GetMapping("/")
    public ResponseEntity<List<Agendamento>> findAll() {
        List<Agendamento> all = agendamentoService.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> findById(@PathVariable Long id) {
        Agendamento byId = agendamentoService.findById(id);
        return ResponseEntity.ok(byId);
    }

    @PostMapping("/")
    public ResponseEntity<Agendamento> save(@RequestBody Agendamento agendamento) {
        Agendamento save = agendamentoService.save(agendamento);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(save);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Agendamento agendamento) {
        agendamentoService.delete(agendamento);
    }
}
