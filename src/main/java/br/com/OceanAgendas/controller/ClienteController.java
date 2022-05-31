package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.entity.Cliente;
import br.com.OceanAgendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> findAll(){
        return clienteService.findAll();
    }
}
