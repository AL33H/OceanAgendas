package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Cliente;
import br.com.OceanAgendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements GenericCrud<Cliente> {

    @Autowired
    ClienteRepository clienteRepository;

    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> listaClientes = clienteRepository.findAll();

        if (listaClientes.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(listaClientes);
    }

    @Override
    public ResponseEntity<Cliente> findById(Long Id) {
        return clienteRepository.findById(Id)
                .map(cliente -> ResponseEntity.ok().body(cliente)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Cliente> save(Cliente cliente) {
        return ResponseEntity.ok(clienteRepository.save(cliente));
    }

    @Override
    public ResponseEntity<Cliente> delete(Cliente cliente) {
        clienteRepository.delete(cliente);
        return ResponseEntity.ok().build();
    }
}
