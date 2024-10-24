package com.example.springboot.ModelsLupa;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_Servicos")
public class ServicoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServico;

    @Column(nullable = false)
    private String nomeServico;

    // Getters and Setters

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
}
