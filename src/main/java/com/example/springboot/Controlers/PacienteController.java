package com.example.springboot.Controlers;
import com.example.springboot.ModelsLupa.PacienteModel;
import com.example.springboot.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<PacienteModel> getAll() {
        return pacienteService.findAll();
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<PacienteModel> getById(@PathVariable String cpf) {
        return pacienteService.findById(cpf)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PacienteModel create(@RequestBody PacienteModel paciente) {
        return pacienteService.save(paciente);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> delete(@PathVariable String cpf) {
        pacienteService.delete(cpf);
        return ResponseEntity.noContent().build();
    }
}
