package com.example.springboot.repositories;

import com.example.springboot.ModelsLupa.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, String> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}
