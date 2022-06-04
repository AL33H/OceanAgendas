package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Funcionario;
import br.com.OceanAgendas.entity.Funcionario;
import br.com.OceanAgendas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FuncionarioService implements GenericCrud<Funcionario> {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public ResponseEntity<List<Funcionario>> findAll() {
        List<Funcionario> listaClientes = funcionarioRepository.findAll();

        if (listaClientes.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(listaClientes);
    }

    @Override
    public ResponseEntity<Funcionario> findById(Long Id) {
        return funcionarioRepository.findById(Id)
                .map(Funcionario -> ResponseEntity.ok().body(Funcionario)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Funcionario> save(Funcionario Funcionario) {
        return ResponseEntity.ok(funcionarioRepository.save(Funcionario));
    }

    @Override
    public ResponseEntity<Funcionario> delete(Funcionario Funcionario) {
        funcionarioRepository.delete(Funcionario);
        return ResponseEntity.ok().build();
    }
}
