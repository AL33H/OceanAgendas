package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Cliente;
import br.com.OceanAgendas.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {

    ClienteService clienteService;

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> all = clienteService.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente byId = clienteService.findById(id);
        return ResponseEntity.ok(byId);
    }

    @PostMapping("/")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        Cliente save = clienteService.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(save);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Cliente cliente) {
        clienteService.delete(cliente);
    }
}
