package br.com.OceanAgendas.repository;

import br.com.OceanAgendas.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}