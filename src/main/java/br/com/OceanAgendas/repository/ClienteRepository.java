package br.com.OceanAgendas.repository;

import br.com.OceanAgendas.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}