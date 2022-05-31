package br.com.OceanAgendas.entity;

import br.com.OceanAgendas.entity.enumeracao.Status;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {

    @Id
    @Column(name = "ID_AGENDAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Funcionario funcionario;

    @OneToOne
    private Servico servico;

    @Column(name = "VALOR")
    @DecimalMin(value = "0.0")
    private BigDecimal valor;

    @Column(name = "HORARIO_MARCADO")
    private LocalDateTime horarioMarcado;

    @Column(name = "STATUS")
    @Enumerated
    private Status status;

    @CreationTimestamp
    @Column(name = "DATA_CADASTRO")
    private LocalDateTime dataCadastro;

    @UpdateTimestamp
    @Column(name = "DATA_ATUALIZACAO")
    private LocalDateTime dataAtualizacao;
}
