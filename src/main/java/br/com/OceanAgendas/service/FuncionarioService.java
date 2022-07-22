package br.com.OceanAgendas.service;

import br.com.OceanAgendas.entity.Funcionario;

import java.util.List;

public interface FuncionarioService {

    List<Funcionario> findAll();

    Funcionario findById(Long Id);

    Funcionario save(Funcionario Funcionario);

    void delete(Funcionario Funcionario);
}
