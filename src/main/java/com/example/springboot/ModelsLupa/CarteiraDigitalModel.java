package com.example.springboot.ModelsLupa;

import com.example.springboot.ModelsLupa.PacienteModel;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_CarteiraDigital")
public class CarteiraDigitalModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, unique = true)
    private String tipoDoc;

    @Lob
    @Column(nullable = false)
    private byte[] doc1;

    @Lob
    @Column(nullable = false)
    private byte[] doc2;

    // Definindo a chave estrangeira com a entidade PacienteModel (usando o CPF)
    @ManyToOne
    @JoinColumn(name = "cpf_paciente", nullable = false)
    private PacienteModel paciente;

    // Getters e Setters

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public byte[] getDoc1() {
        return doc1;
    }

    public void setDoc1(byte[] doc1) {
        this.doc1 = doc1;
    }

    public byte[] getDoc2() {
        return doc2;
    }

    public void setDoc2(byte[] doc2) {
        this.doc2 = doc2;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }
}
