package com.example.springboot.ModelsLupa;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_Upas")
public class UpaModels implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 14, nullable = false, unique = true)
    private String cnpj;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String enderecoUpa;

    @Column(nullable = false)
    private String tellUpa;

    // Getters and Setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoUpa() {
        return enderecoUpa;
    }

    public void setEnderecoUpa(String enderecoUpa) {
        this.enderecoUpa = enderecoUpa;
    }

    public String getTellUpa() {
        return tellUpa;
    }

    public void setTellUpa(String tellUpa) {
        this.tellUpa = tellUpa;
    }
}
