package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Funcionario;
import br.com.OceanAgendas.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping("/")
    public ResponseEntity<List<Funcionario>> findAll() {
        return funcionarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        return funcionarioService.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {
        return funcionarioService.save(funcionario);
    }

    @DeleteMapping("/")
    public ResponseEntity<Funcionario> delete(@RequestBody Funcionario funcionario) {
        return funcionarioService.delete(funcionario);
    }
}
