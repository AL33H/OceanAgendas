package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Cliente;
import br.com.OceanAgendas.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteServiceImpl implements GenericCrud<Cliente>, ClienteService {

    ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        List<Cliente> all = clienteRepository.findAll();
        return all;
    }

    @Override
    public Cliente findById(Long Id) {
        Cliente cliente = clienteRepository.findById(Id).orElseThrow(IllegalArgumentException::new);
        return cliente;
    }

    @Override
    public Cliente save(Cliente cliente) {
        Cliente save = clienteRepository.save(cliente);
        return save;
    }

    @Override
    public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
}
