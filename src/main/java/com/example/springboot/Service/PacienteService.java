package com.example.springboot.Service;

import com.example.springboot.ModelsLupa.PacienteModel;
import com.example.springboot.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteModel> findAll() {
        return pacienteRepository.findAll();
    }

    public Optional<PacienteModel> findById(String cpf) {
        return pacienteRepository.findById(cpf);
    }

    public PacienteModel save(PacienteModel paciente) {
        return pacienteRepository.save(paciente);
    }

    public void delete(String cpf) {
        pacienteRepository.deleteById(cpf);
    }
}
