package br.com.OceanAgendas.controller;

import br.com.OceanAgendas.DTO.LoginFormDTO;
import br.com.OceanAgendas.DTO.TokenDTO;
import br.com.OceanAgendas.config.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<TokenDTO> autenticar(@RequestBody LoginFormDTO form) {
        UsernamePasswordAuthenticationToken dataLogin = form.converter();
        try {
            Authentication authenticate = authenticationManager.authenticate(dataLogin);
            String token = tokenService.gerarToken(authenticate);
            return ResponseEntity.ok(new TokenDTO(token, "Bearer"));
        } catch (AuthenticationException authenticationException) {
            return ResponseEntity.badRequest().build();
        }
    }
}
