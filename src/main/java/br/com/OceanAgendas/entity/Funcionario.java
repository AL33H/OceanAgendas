package br.com.OceanAgendas.entity;

import br.com.OceanAgendas.entity.dependencias.Contato;
import br.com.OceanAgendas.entity.dependencias.Endereco;
import br.com.OceanAgendas.entity.dependencias.Pessoa;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {

    @Id
    @Column(name = "ID_FUNCIONARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Column(name = "PESSOA")
    private Pessoa pessoa;

    @Embedded
    @Column(name = "CONTATO")
    private Contato contato;

    @Embedded
    @Column(name = "ENDERECO")
    private Endereco endereco;

    @Column(name = "FUNCAO")
    private String funcao;

    @CreationTimestamp
    @Column(name = "DATA_CADASTRO")
    private LocalDateTime dataCadastro;

    @UpdateTimestamp
    @Column(name = "DATA_ATUALIZACAO")
    private LocalDateTime dataAtualizacao;
}
