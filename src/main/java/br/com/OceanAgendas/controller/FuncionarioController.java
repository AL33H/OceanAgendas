package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Funcionario;
import br.com.OceanAgendas.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FuncionarioController {

    FuncionarioService funcionarioService;

    @GetMapping("/")
    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> all = funcionarioService.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        Funcionario byId = funcionarioService.findById(id);
        return ResponseEntity.ok(byId);
    }

    @PostMapping("/")
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {
        Funcionario save = funcionarioService.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(save);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Funcionario funcionario) {
        funcionarioService.delete(funcionario);
    }
}
