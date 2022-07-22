package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    List<Cliente> findAll();

    Cliente findById(Long Id);

    Cliente save(Cliente cliente);

    void delete(Cliente cliente);
}
