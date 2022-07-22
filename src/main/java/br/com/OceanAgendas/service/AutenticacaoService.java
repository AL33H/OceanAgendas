package br.com.OceanAgendas.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface AutenticacaoService {
    UserDetails loadUserByUsername(String username);
}
