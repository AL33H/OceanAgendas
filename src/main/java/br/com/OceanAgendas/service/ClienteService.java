package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Cliente;
import br.com.OceanAgendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> listaClientes = clienteRepository.findAll();

        if (listaClientes.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(listaClientes);
    }
}
