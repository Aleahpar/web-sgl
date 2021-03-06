package com.ifes.gr.sgl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "LOCACAO")
@Getter
@Setter
public class Locacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATA_LOCACAO", nullable = false)
    private LocalDateTime dataLocacao;

    @Column(name = "DATA_DEVOLUCAO_PREVISTA", nullable = false)
    private LocalDateTime dataDevolucaoPrevista;

    @Column(name = "DATA_DEVOLUCAO")
    private LocalDateTime dataDevolucao;

    @Column(name = "VALOR", nullable = false)
    private Double valor;

    @Column(name = "MULTA")
    private Double multa;

    @ManyToOne
    @JoinColumn(name = "ID_ITEM", nullable = false)
    private Item item;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

}
