package br.com.OceanAgendas.repository;

import br.com.OceanAgendas.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}