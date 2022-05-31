package br.com.OceanAgendas.repository;

import br.com.OceanAgendas.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}