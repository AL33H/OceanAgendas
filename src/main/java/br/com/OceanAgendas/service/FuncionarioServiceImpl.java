package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Funcionario;
import br.com.OceanAgendas.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FuncionarioServiceImpl implements GenericCrud<Funcionario>, FuncionarioService {

    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll() {
        List<Funcionario> all = funcionarioRepository.findAll();
        return all;
    }

    @Override
    public Funcionario findById(Long Id) {
        Funcionario funcionario = funcionarioRepository.findById(Id).orElseThrow(IllegalArgumentException::new);
        return funcionario;
    }

    @Override
    public Funcionario save(Funcionario Funcionario) {
        Funcionario save = funcionarioRepository.save(Funcionario);
        return save;
    }

    @Override
    public void delete(Funcionario Funcionario) {
        funcionarioRepository.delete(Funcionario);
    }
}
